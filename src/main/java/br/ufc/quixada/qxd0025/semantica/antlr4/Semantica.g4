grammar Semantica;

program
    : statement+ EOF
    ;

statement
    : vardecl ';'
    | varassign ';'
    | conditional
    | repetition
    | expression? ';'
    | '{' statement+ '}'
    ;

vardecl
    : 'const'? type ID ('=' expression)?
    ;

varassign
    : ID '=' expression
    ;

conditional
    : 'if' '(' expression ')' statement ('else' statement)?
    ;

repetition
    : 'for' '(' listassign? ';' expression? ';' listassign? ')' statement
    ;

expression
    : '(' expression ')'                                #ParenthesisExpression
    |<assoc=right> ('+' | '-') expression               #UnaryExpression
    |<assoc=right> '!' expression                       #NotExpression
    | expression ('*' | '/') expression                 #MultDivExpression
    | expression ('+' | '-') expression                 #PlusMinusExpression
    | expression ('<' | '<=' | '>' | '>=') expression   #OrderingExpression
    | expression ('==' | '!=') expression               #EqualityExpression
    | expression '&&' expression                        #AndExpression
    | expression '||' expression                        #OrExpression
    | literal                                           #LiteralExpression
    | ID                                                #VarExpression
    ;

listassign
    : varassign (',' varassign)*
    ;

type
    : 'int'
    | 'float'
    | 'bool'
    ;

literal
    : INTL
    | FLOATL
    | 'true'
    | 'false'
    ;


ID      : [A-Za-z] [A-Za-z0-9_]* ;
INTL    : [0-9]+;
FLOATL  : [0-9]+ '.' [0-9]* ;
WS      : [ \r\n\t]+ -> skip ;