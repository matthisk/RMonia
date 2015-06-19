module desugar::Declarations

import extensions::arrow::Syntax;

import ParseTree;
import Set;
import IO;

data Declaration
	= decl( Id name )
	| decl( Id name, Expression val )
	;

public Expression setDeclaration( Expression e, decl( Id name ) ) 
	= (Expression)`(<Id name> =\> <Expression e>)()`;
public Expression setDeclaration( Expression e, decl( Id name, Expression val ) )
	= (Expression)`(<Id name> =\> <Expression e>)(<Expression val>)`;
public Expression setDeclarations( Expression e, set[Declaration] decls )
	= (Expression)`((<Params ps>) =\> <Expression e>)(<{ArgExpression ","}* args>)`
	when
		<Params ps,{ArgExpression ","}* args> := extractParams( decls );

Params extractParams( set[Declaration] decls ) {
	params = (Params)``;
	args = (ArgExpressions)``;
	
	for( decl( Id name, Expression val ) <- decls, {Param ","}* ps := params.lst, {ArgExpression ","}* ar := args.lst ) {
		params = (Params)`<{Param ","}* ps>,<Id name>`;
		args = (ArgExpressions)`<{ArgExpression ","}* ar>,<Expression val>`;
	}
	
	for( decl( Id name ) <- decls, {Param ","}* ps := params.lst ) {
		params = (Params)`<{Param ","}* ps>,<Id name>`;
	}
	
	return <params,args.lst>;
}

Statement setDeclaration( Statement s, Declaration d )
	= (Statement)
				`{
				'<Statement declaration>
				'<Statement s>
				'}`
	when
		VariableDeclaration vd := extract( d ),
		Statement declaration := (Statement)`var <VariableDeclaration vd>;`;

Statement setDeclarations( Statement s, set[Declaration] decls )
	= (Statement)
				`{
				'<Statement declaration>
				'<Statement s>
				'}`
	when
		Statement declaration := makeDeclaration( decls );

private Statement makeDeclaration( set[Declaration] variables ) {
	<var,variables> = takeOneFrom( variables );
	VariableDeclaration decl = extract( var );
	VarDecl result = (VarDecl)`var <VariableDeclaration decl>;`;
	
	for( Declaration var <- variables, (VarDecl)`var <{VariableDeclaration ","}+ decls>;` := result ) {
		VariableDeclaration decl = extract( var );
		result = (VarDecl)`var <{VariableDeclaration ","}+ decls>, <VariableDeclaration decl>;`;
	}
	
	return (Statement)`<VarDecl result>`;
}

private VariableDeclaration extract( decl( Id var ) ) = (VariableDeclaration)`<Id var>`;
private VariableDeclaration extract( decl( Id var, Expression exp ) ) = (VariableDeclaration)`<Id var> = <Expression exp>`;
