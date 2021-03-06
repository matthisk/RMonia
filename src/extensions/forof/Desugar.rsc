@cachedParser{desugar.cached.Parser}
module extensions::forof::Desugar
extend desugar::Base;
extend extensions::forof::Syntax;

import desugar::Declarations;
import IO;

Statement desugar( (Statement)`for( <Declarator declarator> <ForBinding binding> of [ <{ArgExpression ","}* args> ] ) <Statement body>`, Id(str) generateUId ) {
	Id arrId = generateUId("_arr");
	Expression arr = (Expression)`[<{ArgExpression ","}* args>]`;
	VariableDeclaration d = declareBinding( binding, (Expression)`<Id arrId>[i]` );
	Statement* body = unscope( body );

	return (Statement)
		`{
		'	let <Id arrId> = <Expression arr>;
		'	for (var i = 0; i \< <Id arr>.length; i++) { 
		'		<Declarator declarator> <VariableDeclaration d>;
		'		<Statement* body> 
		'	}
		'}`;
}

default Statement desugar( (Statement)`for( <Declarator d> <ForBinding binding> of <Expression exp> ) <Statement body>`, Id(str) generateUId ) {
	Statement loop = iterableLoop( d, binding, exp, body );
	Statement* catchBlock = unscope((Statement)`{ _didIteratorError = true; _iteratorError = err; }`);
	Statement finalBlock = iterableFinal();
	Statement res = 
		(Statement)
				`try { 
				'	<Statement loop> 
				'} catch(err) { 
				'	<Statement* catchBlock> 
				'} finally { 
				'	<Statement finalBlock> 
				'}`;
	
	return setDeclarations( res, initialization );
}

Statement loopBody( Statement* body )
	= setDeclaration( res, decl( clos, closureFun ) )
	when
		/Function _ := body,
		Statement* res := (Statement)`<Id clos>();`;

Statement iterableLoop( Declarator d, ForBinding binding, Expression arr, Statement body )
	= res
	when
		VariableDeclaration declaration := declareBinding( binding, (Expression)`_step.value` ),
		Statement* body := unscope( body ),
		Statement res := (Statement)`for(var _iterator = <Expression arr>[Symbol.iterator](), _step; !(_iteratorNormalCompletion = (_step = _iterator.next()).done); _iteratorNormalCompletion = true ) { <Declarator d> <VariableDeclaration declaration>; <Statement* body> }`;

Statement iterableFinal()
	= (Statement)`try { <Statement tryBlock> } finally { <Statement finalBlock> }`
	when
		Statement tryBlock := (Statement)`if(!_iteratorNormalCompletion && _iterator["return"]) { _iterator["return"](); }`,
		Statement finalBlock := (Statement)`if(_didIteratorError) { throw _iteratorError; }`;

set[Declaration] initialization = { decl( [Id]"_iteratorNormalCompletion", [Expression]"true" ), decl( [Id]"_didIteratorError", [Expression]"false" ), decl( [Id]"_iteratorError", [Expression]"undefined" ) };

VariableDeclaration declareBinding( (ForBinding)`<Id id>`, Expression exp ) 
	= (VariableDeclaration)`<Id id> = <Expression exp>`;