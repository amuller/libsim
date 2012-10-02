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
	
	public static void assertEqualLength(int a[], int b[]){
		validate(CommonChecks.equalLength(a, b),"The vectors must have the same length");
	}
	
	public static void assertEqualLength(double a[][], double b[][]){
		validate(CommonChecks.equalLength(a, b),"The matrices must have the same dimensions");
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
	 * Verifies if the vector has at least one entry with a negative or zero value, if has it, throws an exception with a custom message.
	 * @param v vector received.
	 * @see Asserts.validate
	 * @see CommonChecks.greaterThanZero
	 */
	
	public static void assertGreaterThanZero(double v[]){
		validate(CommonChecks.greaterThanZero(v),"The input vector has at least one entry with a value equal or less than zero");
	}
	
	
	/**
	 * Verifies if the vector has at least one entry with a negative value, if has it, throws an exception with a custom message.
	 * @param v vector received.
	 * @see Asserts.validate
	 * @see CommonChecks.greaterThanZero
	 */
	
	public static void assertPositiveValues(int v[]){
		validate(CommonChecks.positiveValues(v),"The input vector has at least one entry with a value less than zero");
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
		validate(CommonChecks.greaterOrEqualThanValue(number, value),"The number received is less than "+value);
	}
	
	
	/**
	 * Verifies if a number is between (including) the values 1 and -1, if it isn't, throws an exception with a custom message.
	 * @param number number to check.
	 * @see Asserts.validate
	 * @see CommonChecks.between1andMinus1
	 */
	public static void assertBetween1andMinus1(double number){
		validate(CommonChecks.between1andMinus1(number),"The number does not belong to the range: [-1,1]");
	}
	
	/**
	 * Makes sure that the returned value is a distance function value. 
	 * @param distanceValue
	 * @see Asserts.validate
	 */
	public static void assertDistance(double distanceValue){
		validate(distanceValue >= 0, "Must be >= zero");
	}
	
	
	/**
	 * Verifies if a matrix is a binary matrix (each entry has the value of 1 or 0), if it isn't, throws an exception with a custom message.
	 * @param matrix matrix to check.
	 * @see Asserts.validate
	 * @see CommonChecks.isBinary
	 */
	public static void assertIsBinary(double matrix[][]){
		validate(CommonChecks.isBinary(matrix),"The matrix is not a binary matrix");
	}

}

