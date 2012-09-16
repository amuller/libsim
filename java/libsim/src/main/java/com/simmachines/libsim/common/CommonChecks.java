package com.simmachines.libsim.common;

public class CommonChecks {

	/**
	 * Maximum accepted range for distance variability
	 */
	
	public static double PRECISION = 0.00001;
	
	
	/**
	 * Checks if both values are equal (within the precision range)
	 * @param a first vector
	 * @param b second vector
	 * @return true if the vectors are equals, false otherwise
	 * @see CommonChecks.PRECISION
	 */

	public static boolean equals(double a, double b){
		return (Math.abs(a - b) <= PRECISION);
	}
	
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i < 0 \) 
	 * @param v vector received
	 * @return true if there is at least one \( v_i < 0 \), false otherwise
	 */

	public static boolean greaterThanZero(double v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]<=0){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i = 0 \) 
	 * @param v vector received
	 * @return true if there is at least one \( v_i = 0 \), false otherwise
	 */

	public static boolean hasNoZero(double v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Checks if two vectors have the same length.
	 * @param v1 vector number 1.
	 * @param v2 vector number 1.
	 * @return true if the vectors have the same length, false otherwise.
	 */
	
	public static boolean equalLength(double v1[], double v2[]){
		if(v1.length == v2.length){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a number is greater or equal than a given value.
	 * @param number number to check.
	 * @param value comparison parameter.
	 * @return true if the number is greater or equal than the value, false otherwise.
	 * @see CommonChecks.greaterThanValue
	 * @see CommonChecks.equalToValue
	 */
	
	public static boolean greaterOrEqualThanValue(double number, double value){
		if(greaterThanValue(number,value)||equalToValue(number,value)){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a number is greater than a given value.
	 * @param number number to check.
	 * @param value comparison parameter.
	 * @return true if the number is greater than the value, false otherwise.
	 */
	
	public static boolean greaterThanValue(double number, double value){
		if(number>value){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a number is equal to a given value.
	 * @param number number to check.
	 * @param value comparison parameter.
	 * @return true if the number is equal to the value, false otherwise.
	 */
	
	public static boolean equalToValue(double number, double value){
		if(number==value){
			return true;
		}
		return false;
	}

}
