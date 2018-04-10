grammar DDL;

@header {
  package leo.modules.parsers.ddl;
}

fragment Non_zero_numeric : [1-9];
fragment Numeric : [0-9];
fragment Lower_alpha : [a-z];
fragment Upper_alpha : [A-Z];
fragment Alpha_numeric : Lower_alpha | Upper_alpha | Numeric | '_';

Integer : '0' | Positive_decimal;
Positive_decimal : Non_zero_numeric Numeric*;
Lower_word : Lower_alpha Alpha_numeric*;

WS : [ \r\t\n]+ -> skip ;
Line_comment : '%' ~[\r\n]* -> skip;
Block_comment : '/*' .*? '*/' -> skip;

file           : input* EOF;
input          : annotated_formula;

name : Lower_word | Integer;

annotated_formula : 'ddl' '(' name ',' formula_role ',' formula ')' '.';
formula_role : Lower_word;

formula: unary_formula | binary_formula | unitary_formula;

unary_formula : '~' atomic_formula | '~' '(' formula ')';

binary_formula : binary_assoc | binary_nonassoc;
binary_assoc : conjunction | disjunction;
conjunction : unitary_formula '&' unitary_formula
            | conjunction '&' unitary_formula;
disjunction : unitary_formula '|' unitary_formula
            | disjunction '|' unitary_formula;
nonassoc_connective : '<=>' | '=>' | '<=';
binary_nonassoc : unitary_formula nonassoc_connective unitary_formula;

unitary_formula : atomic_formula | '(' formula ')';
atomic_formula: atom | defined_atom;
atom : Lower_word;
defined_atom: '$true' | '$false' | defined_function;
defined_function : dyadic_defined_function | monadic_defined_function;

dyadic_defined_function : '$O' '(' formula '/' formula ')';
monadic_defined_function : monadic_defined_functor '(' formula ')';
monadic_defined_functor : '$O_a' | '$O_p' | '$O' | '$box_a' | '$box_p' | '$box';
