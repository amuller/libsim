package com.simmachines.libsim.asserts;
/**
 *  
 * @author amuller
 */
public class Asserts {
	
	/**
	 * If exp is false will throw an exception
	 * @param exp Expression to validate
	 * @param msg Message that will be displayed
	 */
	public static void validate(boolean exp, String msg){
		if(! exp){
			throw new IllegalArgumentException(msg);
		}
	}

}
