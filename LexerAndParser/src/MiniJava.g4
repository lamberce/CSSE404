// Define a grammar called Hello
grammar MiniJava;

// Parser Stuff
r : program EOF;
program : mainClassDecl (classDecl)*;
mainClassDecl : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' (stmt)* '}' '}';
classDecl : 'class' ID '{' (classVarDecl)* (methodDecl)* '}'
		| 'class' ID 'extends' ID '{' (classVarDecl)* (methodDecl)* '}';
classVarDecl : type ID ';';
formal : type ID | ;
methodDecl : 'public' type ID '(' formal (',' formal)*')''{'(stmt)* 'return' expr';''}';
type : 'int' | 'boolean' | ID;
stmt : type ID '=' (expr)* ';'
		| '{'stmt*'}'
		| 'if' '(' expr ')' stmt 'else' stmt
		| 'while' '(' expr ')' stmt
		| 'System.out.println' '(' expr ')' ';'
		| ID '=' expr ';';

exprTerminals: 'new' ID '(' ')' | ID | 'this' | Integer | 'null' | 'true' | 'false';
expr : minusNot exprTerminals exprPrime '||' expr
		| expr2
		| ('-'|'!')expr
		| exprTerminals exprPrime '.' ID '(' expr (',' expr) ')'
		| exprTerminals exprPrime '.' ID '(' ')';
expr2 : expr3 '&&' expr
		| expr3 '||' expr
		| expr3;
expr3 : expr4 ('!=' | '==') expr
		| expr4;
expr4 : expr5 ('<'|'<='|'>='|'>') expr
		| expr5;
expr5 : expr6 ('+'|'-') expr
		| expr6;
expr6 : expr7 ('*'|'/') expr
		| expr7;
expr7 : exprTerminals | '(' expr ')' ;

exprPrime : exprTerminals exprPrime | ('-' | '!') exprPrime | ;
minusNot : '-' | '!' | ;

// Lexer Stuff
//Program : (Token|Whitespace)*;
//Token : (ID|ReservedWord|Operator|Delimiter|Whitespace);
ReservedWord : 'class'|'public'|'static'|'extends'|'void'|'int'|'boolean'|'if'|'else'|'while'|'return'|'null'|'true'|'false'|'this'|'new'|'String'|'main'|'System.out.println';
ID : Letter (Letter|Digit)*;
Integer : NonZeroDigit Digit*|[0];
Letter : [a-z]|[A-Z];
Digit : [0-9];
NonZeroDigit : [1-9];
Operator : '+'|'-'|'*'|'/'|'<'|'<='|'>='|'>'|'=='|'!='|'&&'|'||'|'!';
Delimiter : ';'|'.'|','|'='|'('|')'|'{'|'}'|'['|']';
//Token : ID|Integer|ReservedWord|Operator|Delimiter;
Whitespace : (Comment|[ \t\r\n]) -> skip;
Comment : (SingleLineComment | MultiLineComment);
SingleLineComment : '//' ~('\r' | '\n')*;
MultiLineComment : '/*' .*? '*/';