// Demo for two types expression grammar
// Bartosz Sawicki, 2014-05-12

grammar Mat;

prog: ( stat? NEWLINE )*
;

stat:	 WRITE ID   		#write
	| ID '=' expr0		#assign
	| READ ID   		#read
   ;

expr0:  expr1			#single0
      | expr1 ADD expr1		#add
;

expr1:  expr2			#single1
      | expr2 MULT expr2	#mult
;

expr2:   INT			#int
       | REAL			#real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;

WRITE:	'write'
    ;

READ:	'read'
   ;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;

ADD: '+'
    ;

MULT: '*'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
