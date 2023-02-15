grammar BigCalcProg;

txtfile
    :program EOF
    ;

program
        : statement+
        ;

statement
        : Variable '=' expression ';'   #assignmentStatement
        | expression ';'                #expressionStatement
        ;

expression
        : expression op=('*' | '/') expression  # mulDiv
        | expression op=('+' | '-') expression  # addSub
        | Number                                # num
        | Variable                              # var
        | '(' expression ')'                    # parens
        ;

Variable
        : [a-zA-Z][a-zA-Z0-9]* ;

Number
        : Digit* '.' Digit+
        | Digit+
        ;

Digit
        : [0-9]
        ;

WS      : [ \t\r\n\u000C]+ -> skip
        ;

COMMENT
        :   '/*' .*? '*/' -> skip
        ;

LINE_COMMENT
        : '//' ~[\r\n]* -> skip
        ;
