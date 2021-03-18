grammar predicate_proof_grammar;

predicateProof
:
    block
;

block
:
    BLOCKBEGIN (lineWithVariableSymbol)? (line|block)+ BLOCKEND
;

lineWithVariableSymbol
:
    lineNumber variable VARIABLEEND (logicFormula FORMULAEND description)? EOL
;

line
:
    lineNumber logicFormula FORMULAEND description EOL
;

logicFormula
:
    logicFormula EUQIVALENZ_ARROW implicationExpression
    | implicationExpression
;

implicationExpression
:
    implicationExpression TRANSFORMATION_ARROW orAndExpression
    | orAndExpression
;

orAndExpression
:
    orAndExpression OR unaryExpression
    | orAndExpression AND unaryExpression
    | unaryExpression
;

unaryExpression
:
    unaryOperator unaryExpression
    | LPAREN logicFormula RPAREN
    | predicateOrFunction
    | variable
    | BOTTOM
;

unaryOperator
:
    ALLQUANTOR variable
    | EXISTQUANTOR variable
    | NOT
;

predicateOrFunction
:
    variable LPAREN parameter RPAREN
;

parameter
:
    variable ( COMMA variable)*
    |
;

description
:
    PREMISE
    | ASSUMPTION
    | andIntroduction
    | andElimination1
    | andElimination2
    | orIntroduction1
    | orIntroduction2
    | orElimination
    | impliesIntroduction
    | impliesElimination
    | notIntroduction
    | notElimination
    | bottomElimination
    | doubleNotIntroduction
    | doubleNotElimination
    | pbc
    | modusTollens
    | excludedMiddle
    | allquantorIntroduction
    | allquantorElimination
    | existsquantorIntroduction
    | existsquantorElimination
;

andIntroduction
:
    AND 'i' singleScope COMMA singleScope
;

andElimination1
:
    AND 'e1' singleScope
;

andElimination2
:
    AND 'e2' singleScope
;

orIntroduction1
:
    OR 'i1' singleScope
;

orIntroduction2
:
    OR 'i2' singleScope
;
orElimination
:
    OR 'e' singleScope COMMA multiScope COMMA multiScope
;

impliesIntroduction
:
    TRANSFORMATION_ARROW 'i' multiScope
;

impliesElimination
:
    TRANSFORMATION_ARROW 'e' singleScope COMMA singleScope
;

notIntroduction
:
    NOT 'i' multiScope
;

notElimination
:
    NOT 'e' singleScope COMMA singleScope
;

bottomElimination
:
    BOTTOM 'e' singleScope
;

doubleNotIntroduction
:
    NOT NOT 'i' singleScope
;

doubleNotElimination
:
    NOT NOT 'e' singleScope
;

modusTollens
:
    'MT' singleScope COMMA singleScope
;

pbc
:
    'PBC' multiScope
;

excludedMiddle
:
    'LEM' singleScope
    | 'LEM'
;

allquantorIntroduction
:
    ALLQUANTOR variable 'i' multiScope
;

allquantorElimination
:
    ALLQUANTOR variable 'e' singleScope
;

existsquantorIntroduction
:
    EXISTQUANTOR variable 'i' singleScope
;

existsquantorElimination
:
    EXISTQUANTOR variable 'e' singleScope COMMA multiScope
;

variable
:
    CHAR
;

singleScope
:
    integer
;

multiScope
:
    integer '-' integer
;

lineNumber
:
    integer
;

integer
:
    DIGIT+
;

FORMULAEND
:
    '\\formula_end'
;

VARIABLEEND
:
    '\\variable_end'
;

ASSUMPTION
:
    'ass'
    | 'assumption'
;

PREMISE
:
    'prem'
    | 'premise'
;

BOTTOM
:
    '\\bot'
;

NOT
:
    '\\neg'
;

EXISTQUANTOR
:
    '\\exists'
;

ALLQUANTOR
:
    '\\forall'
;

AND
:
    '\\wedge'
;

OR
:
    '\\vee'
;

TRANSFORMATION_ARROW
:
    '->'
    | '\\to'
    | '\\rightarrow'
;

EUQIVALENZ_ARROW
:
    '\\leftrightarrow'
;

BLOCKBEGIN
:
    '\\block_begin'
;

BLOCKEND
:
    '\\block_end'
;

LPAREN
:
    '('
    | '\\left('
;

RPAREN
:
    ')'
    | '\\right)'
;

COMMA
:
    ','
;

EOL
:
    [\r\n]+
    | '\\eol'
;

DIGIT
:
    [0-9]
;

CHAR
:
    [A-Za-z]
;

WS : [ \r\n\t]+ -> skip;