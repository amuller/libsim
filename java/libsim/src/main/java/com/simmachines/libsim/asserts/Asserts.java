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
	
	/**
	 * Verifies if two vectors have the same length, if not, throws an exception with a custom message.
	 * @param a vector number 1.
	 * @param b vector number 2.
	 * @see Asserts.validate
	 * @see CommonChecks.equalLength
	 */
	
	public static void assertEqualLength(double a[], double b[]){
		validate(CommonChecks.equalLength(a, b),"The vectors must have the same length");
	}
	
	
	/**
	 * Verifies if both values are equal (within the precision range), if not, throws an exception with a custom message.
	 * @param v1 value number 1.
	 * @param v2 value number 2.
	 * @see Asserts.validate
	 * @see CommonChecks.equals
	 */
	
	public static void assertEquals(double v1, double v2){
		validate(CommonChecks.equals(v1, v2),"The input values are not equals within the precision range");
	}
	
	/**
	 * Verifies if the vector has at least one entry with a negative value, if has it, throws an exception with a custom message.
	 * @param v vector received.
	 * @see Asserts.validate
	 * @see CommonChecks.lessThanZero
	 */
	
	public static void assertLessThanZero(double v[]){
		validate(CommonChecks.lessThanZero(v),"The input vector has at least one entry with a value less than zero");
	}
	
	/**
	 * Verifies if the vector has at least one entry with a value equals to zero, if has it, throws an exception with a custom message.
	 * @param v vector received.
	 * @see Asserts.validate
	 * @see CommonChecks.hasNoZero
	 */
	
	public static void assertHasNoZero(double v[]){
		validate(CommonChecks.hasNoZero(v),"The input vector has at least one entry with a value equals to zero");
	}
	
	
	/**
	 * Verifies if a number is greater than a given value, if it isn't, throws an exception with a custom message.
	 * @param number number to check.
	 * @param value comparison parameter.
	 * @see Asserts.validate
	 * @see CommonChecks.greaterOrEqualThanValue
	 */
	
	public static void assertGreaterOrEqualThanValue(double number, double value){
		validate(CommonChecks.greaterOrEqualThanValue(number, value),"The number received is less than the given value");
	}

}

