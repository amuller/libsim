// $ANTLR 2.7.4: "Slice.g" -> "SliceParser.java"$

    package org.treelib;

import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.RecognitionException;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.TokenStreamException;
import antlr.collections.AST;

public class SliceParser extends antlr.LLkParser       implements SliceParserTokenTypes
 {

protected SliceParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public SliceParser(TokenBuffer tokenBuf) {
  this(tokenBuf,2);
}

protected SliceParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public SliceParser(TokenStream lexer) {
  this(lexer,2);
}

public SliceParser(ParserSharedInputState state) {
  super(state,2);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void slice() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST slice_AST = null;
		
		switch ( LA(1)) {
		case CONSTRUCT_NAME:
		{
			AST tmp1_AST = null;
			tmp1_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp1_AST);
			match(CONSTRUCT_NAME);
			{
			_loop3:
			do {
				if ((LA(1)==LEFT_PAREN)) {
					internal();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop3;
				}
				
			} while (true);
			}
			slice_AST = (AST)currentAST.root;
			break;
		}
		case NUMBER:
		{
			AST tmp2_AST = null;
			tmp2_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp2_AST);
			match(NUMBER);
			slice_AST = (AST)currentAST.root;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		returnAST = slice_AST;
	}
	
	public final void internal() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST internal_AST = null;
		
		match(LEFT_PAREN);
		{
		switch ( LA(1)) {
		case CONSTRUCT_NAME:
		case NUMBER:
		{
			slice();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop7:
			do {
				if ((LA(1)==PARAM_SEPARATOR)) {
					match(PARAM_SEPARATOR);
					slice();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop7;
				}
				
			} while (true);
			}
			break;
		}
		case RIGHT_PAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		match(RIGHT_PAREN);
		internal_AST = (AST)currentAST.root;
		returnAST = internal_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"CONSTRUCT_NAME",
		"NUMBER",
		"LEFT_PAREN",
		"PARAM_SEPARATOR",
		"RIGHT_PAREN",
		"WS"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	
	}
