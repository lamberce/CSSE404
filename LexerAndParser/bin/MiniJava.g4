// Define a grammar called Hello
lexer grammar MiniJava;
/*
// Parser Stuff
program : mainClassDecl '{'classDecl'}';
mainClassDecl : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{'(stmt)*'}';
classDecl : 'class' ID {'[' 'extends' ID ']'} '{'(classVarDecl)* (methodDecl)*'}';
classVarDecl : type ID;
formal : type ID;
methodDecl : 'public' type ID '(' formal (',' formal)*')''{'(stmt)* 'return' expr';''}';
type : 'int'|'boolean'|ID;
stmt : type ID '=' expr ';'
		| '{'stmt*'}'
		| 'if' '(' expr ')' stmt 'else' stmt
		| 'while' '(' expr ')' stmt
		| 'System.out.println' '(' expr ')' ';'
		| ID '=' expr;
expr : expr('+'|'-'|'*'|'/'|'<'|'<='|'>='|'>'|'=='|'!='|'&&'|'||')expr ';'
		| ('-'|'!')expr ';'
		| expr '.' ID '(' (expr {,expr})* ')'
		| 'new' ID '(' ')'
		| ID ''
		| 'this'
		| Integer ';'
		| 'null'
		| 'true'
		| 'false'
		| '(' expr ')';
*/
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