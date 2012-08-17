package com.simmachines.libsim.common;

public class CommonChecks {

	/**
	 * Maximum accepted range for distance variability
	 */
	
	public static double PRECISION = 0.00001;
	
	
	/**
	 * Checks if both vectors are equal (within the precision range)
	 * @param a first vector
	 * @param b second vector
	 * @return true if the vectors are equals, false otherwise
	 * @see CommonChecks.precision 
	 */

	public static boolean equals(double a, double b){
		return ((a - b) <= PRECISION);
	}
	
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i < 0 \) 
	 * @param v vector received
	 * @return true if there is at least one \( v_i < 0 \), false otherwise
	 */

	public static boolean lThanZero(double v[]){
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

	public static boolean hasZero(double v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]==0){
				return true;
			}
		}
		return false;
	}

}
