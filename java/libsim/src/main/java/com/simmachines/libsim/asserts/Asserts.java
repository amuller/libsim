package com.simmachines.libsim.asserts;

import com.simmachines.libsim.common.CommonChecks;



/**
 * Assert utilities that simplify 
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
	
	
	public static void assertEquals(double a, double b){
		validate(CommonChecks.equals(a, b),"The input values are not equals within the precision range");
	}
	
	public static void assertLThanZero(double v[]){
		validate(CommonChecks.lThanZero(v),"The input vector has at least one entry with a value less than zero");
	}
	
	public static void assertHasZero(double v[]){
		validate(CommonChecks.hasZero(v),"The input vector has at least one entry with a value equals to zero");
	}

}

