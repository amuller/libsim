package com.diapai.ramiel.exception;
import java.util.logging.Logger;
/**
 * This exception is thrown when the index is
 * not prepared  
 * @author amuller
 */
public class UnPreparedException extends Exception {
	static final transient Logger logger = Logger
			.getLogger(UnPreparedException.class.getName());
}
