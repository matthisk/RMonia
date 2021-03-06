module extensions::generators::Desugar
extend desugar::Base;

extend extensions::generators::Syntax;

import extensions::generators::Emitter;
import IO;

public str fun =
"function* f() {
  var pre = 0, cur = 1;
  for (;;) {
    var temp = pre;
    pre = cur;
    cur += temp;
   	yield cur;
  }
}";

public Function gen = [Function]"<fun>";

CaseClause* cc() 
	= cases
	when (Statement)`switch(c) { <CaseClause* cases> }` := (Statement)`switch(c) { case 0: break;case 1: break; }`;

Function desugar( f:(Function)`function * <Id name> (<Params ps>) { <Statement* body> }`, Id(str) generateUId )
	= (Function)`function <Id name> (<Params ps>) { 
				'	<Statement* generator> 
				'}`
	when
		Statement* generator := makeGenerator( f );

tuple[list[Id],Statement*] hoist( Statement* body ) {
	list[Id] vars = [];
	
	body = top-down visit( body ) {
		case (Statement)`var <{VariableDeclaration ","}+ vds>;` : {
			list[Expression] assigns = [];
			Statement* ss = statementStar( (Statement)`;` );	
			
			for( vd <- vds ) {
				id = vd.id;
				if( vd.exp? ) exp = vd.exp;
				vars += vd.id;
				
				if( vd.exp? ) {
					Expression exp = vd.exp;
					assigns += (Expression)`<Id id> = <Expression exp>`;
				}	
			}
		
			for( ass <- assigns ) ss = \append( ss, (Statement)`<Expression ass>;` );
			if( size( assigns ) > 0 )
				insert (Statement)`{ <Statement* ss> }`;	
			else
				insert (Statement)`;`;
		}
	}
	
	return <vars,body>;
}

Statement varDecl( list[Id] vars ) {
	Statement d = (Statement)`var id;`;

	void app( (Statement)`var <{VariableDeclaration ","}+ vds>;`, Id id ) {
		d = (Statement)`var <{VariableDeclaration ","}+ vds>, <Id id>;`;
	}

	for( id <- vars ) app( d, id );
	
	return d;
}

Statement* makeGenerator( Function f ) {
	<vars,hBody> = hoist( f.body );
	list[Statement] outerBody = [];
	list[Statement] innerBody = [];
	Id innerFnId = [Id]"generator";
	Id marked = [Id]"marked";
	Id context = [Id]"context";
	
	<explode,getContextFunction,getTryLocList> = emitter(context);
	
	explode(hBody);

	if( size( vars ) > 0 ) outerBody += varDecl( vars );
	
	list[Expression] wrapArgs = [
		getContextFunction(innerFnId),
		(Expression)`false`,
		(Expression)`this`
	];
	
	return f.body;	
}