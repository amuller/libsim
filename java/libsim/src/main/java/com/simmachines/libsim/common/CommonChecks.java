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
		return ((a - b) <= PRECISION);
	}
	
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i < 0 \) 
	 * @param v vector received
	 * @return true if there is at least one \( v_i < 0 \), false otherwise
	 */

	public static boolean lessThanZero(double v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]<0){
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

}
