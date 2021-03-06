module extensions::classes::Syntax
extend extensions::letconst::Syntax;

syntax Statement
	= "class" Id name ClassTail
	;

syntax Expression
	= class: "class" Id? name ClassTail
	;

syntax ClassTail
	= ClassHeritage "{" Constructor? ctor Methods ms "}"
	;

syntax ClassHeritage
	= "extends" Expression!class extends
	| 
	;

syntax Methods
	= Method*
	;
	
syntax Constructor
	= "constructor" "(" Params ")" "{" Statement* body "}"
	;

syntax Method
	= ClassElement
	| "static" ClassElement 
	;

syntax ClassElement
	= MethodDefinition
	| PropertyName name \ "constructor" "(" Params ")" "{" Statement* body "}"
	;

syntax Expression
	= "super" "(" {ArgExpression ","}* ")"
	| "super" "." Id
	| "super" "[" Expression "]"
	;