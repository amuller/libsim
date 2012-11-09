header {
    package org.treelib;
}

class SliceParser extends Parser;

options {
        buildAST=true;
        k=2;
        defaultErrorHandler=false;
}

// ^ make it a sub-tree root
// ! take it out of the tree
// nothing means that it will become a leaf

/*slice : CONSTRUCT_NAME^
      | CONSTRUCT_NAME^ LEFT_PAREN!   RIGHT_PAREN!
      | CONSTRUCT_NAME^ LEFT_PAREN!   slice (PARAM_SEPARATOR! slice)*  RIGHT_PAREN!
      | CONSTRUCT_NAME^ slice
      | NUMBER^
      ;
      slice : CONSTRUCT_NAME^ (LEFT_PAREN! (slice (PARAM_SEPARATOR! slice)*)?  RIGHT_PAREN! )?
      | CONSTRUCT_NAME^ slice
      | NUMBER^
      ;
      
      slice : LEFT_PAREN! LEFT_PAREN! (slice (PARAM_SEPARATOR! slice)*)? RIGHT_PAREN! RIGHT_PAREN!
      | CONSTRUCT_NAME^ LEFT_PAREN! (slice (PARAM_SEPARATOR! slice)*)?  RIGHT_PAREN!
      | CONSTRUCT_NAME^ 
      | CONSTRUCT_NAME^ slice
      | NUMBER^
      ;
      
*/

// TODO:This (internal)* has to be (internal)? but it doesn't work

slice   :   CONSTRUCT_NAME^  (internal)*  | NUMBER^
        ;
      
internal :   LEFT_PAREN! (slice (PARAM_SEPARATOR! slice)*)? RIGHT_PAREN! 
         ;


class SliceLexer extends Lexer;

options {
    // Allow any char but \uFFFF (16 bit -1)
    //charVocabulary='\u0000'..'\uFFFE';
    k=2;    
}

// Words, which include our operators
CONSTRUCT_NAME  : ('a'..'z' | 'A'..'Z' | '$' | '%' | '^' | '#')+ 
                ;


LEFT_PAREN  : '(' 
            ;
RIGHT_PAREN : ')' 
            ;



PARAM_SEPARATOR : ','
                ;



 //('-')? ('0'..'9')+ ('.' ('0'..'9')+)?
NUMBER  :   ('-')? ('0'..'9')+ ('.' ('0'..'9')+)?  ('E' ('-')? ('0'..'9')+)?
		| '-' 'I''n''f''i''n''i''t''y'
        ;
    
// there is a bug in antlr, this rule has to be the last!!!!
WS
    : (' ' | '\t' | '\r' | '\n') { $setType(Token.SKIP); }
    ;





