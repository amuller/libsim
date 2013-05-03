
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
	 * @see CommonChecks#PRECISION
	 */
	public static boolean equals(double a, double b){
		return (Math.abs(a - b) <= PRECISION);
	}
	
	/**
	 * Checks if both strings are equal
	 * @param a first string
	 * @param b second string
	 * @return true if the strings are equals, false otherwise
	 */
	public static boolean equals(String a, String b){
		return (a == b);
	}
	
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i <= 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i <= 0 \), true otherwise
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
	 * Checks if:   \(\forall v_i \in V, \exists v_i <= 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i <= 0 \), true otherwise
	 */
	public static boolean greaterThanZero(int v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]<=0){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Checks if a given value is greater than zero.
	 * @param v value received.
	 * @return true if the value is greater than zero, false otherwise.
	 */
	public static boolean greaterThanZero(double v){
		if(v>0){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a given value is lower than zero.
	 * @param v value received.
	 * @return true if the value is greater than zero, false otherwise.
	 */
	public static boolean lowerThanZero(double v){
		if(v < 0){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a given value is greater than zero.
	 * @param v value received.
	 * @return true if the value is greater than zero, false otherwise.
	 */
	public static boolean greaterThanZero(int v){
		if(v>0){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i < 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i < 0 \), true otherwise
	 */
	public static boolean positiveValues(int v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]<0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Checks if:   \(\forall v_i \in V, \exists v_i < 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i < 0 \), true otherwise
	 */
	public static boolean positiveValues(double v[]){
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
	 * @return false if there is at least one \( v_i = 0 \), true otherwise
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
	 * Checks if:   \(\forall v_i \in V, \exists v_i = 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i = 0 \), true otherwise
	 */
	public static boolean hasNoZero(int v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Checks if:   \(\forall v_i \in V, v_i = 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i != 0 \), true otherwise
	 */
	public static boolean hasAllZeros(double v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]!=0){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if:   \(\forall v_i \in V, v_i = 0 \) 
	 * @param v vector received
	 * @return false if there is at least one \( v_i != 0 \), true otherwise
	 */
	public static boolean hasAllZeros(int v[]){
		for(int i=0;i<v.length;i++){
			if(v[i]!=0){
				return true;
			}
		}
		return false;
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
	 * Checks if two vectors have the same length.
	 * @param v1 vector number 1.
	 * @param v2 vector number 1.
	 * @return true if the vectors have the same length, false otherwise.
	 */
	public static boolean equalLength(int v1[], int v2[]){
		if(v1.length == v2.length){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if two matrices have the same dimensions..
	 * @param m1 matrix number 1.
	 * @param m2 matrix number 1.
	 * @return true if the matrices have the same dimensions, false otherwise.
	 */
	public static boolean equalLength(double m1[][], double m2[][]){
		if(m1.length == m2.length && m1[0].length == m2[0].length){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a number is greater or equal than a given value.
	 * @param number number to check.
	 * @param value comparison parameter.
	 * @return true if the number is greater or equal than the value, false otherwise.
	 * @see CommonChecks#greaterThanValue
	 * @see CommonChecks#equalToValue
	 */
	public static boolean greaterOrEqualThanValue(double number, double value){
		if(greaterThanValue(number,value)||equalToValue(number,value)){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Checks if a vector's entries are greater or equal than a given value.
	 * @param vector vector to check.
	 * @param value comparison parameter..
	 * @return true if the vector's entries are greater or equal than the value, false otherwise.
	 * @see CommonChecks#greaterThanValue
	 * @see CommonChecks#equalToValue
	 */
	public static boolean greaterOrEqualThanValue(double[] vector, double value){
		for(double v:vector){
			if(!(greaterThanValue(v, value)||equalToValue(v, value))){
				return false;
			}
		}
		return true;
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
	 * Checks if a vector's entries are greater than a given value.
	 * @param vector vector to check.
	 * @param value comparison parameter.
	 * @return true if the vector's entries are greater than the value, false otherwise.
	 */
	public static boolean greaterThanValue(double[] vector, double value){
		for(double v:vector){
			if(value>=v){
				return false;
			}
		}
		return true;
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
	
	/**
	 * Checks if a vector's entries are equal to a given value.
	 * @param vector vector to check.
	 * @param value comparison parameter.
	 * @return true if the vector's entries are equal to the value, false otherwise.
	 */
	public static boolean equalToValue(double[] vector, double value){
		for(double v:vector){
			if(value!=v){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Checks if a number is between (including) the values 1 and -1.
	 * @param number number to check.
	 * @return true if the value is between (including) 1 and -1, false otherwise.
	 */
	public static boolean between1andMinus1(double number){
		if(number<=1 && number>=-1){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a number is between (including) the values 0 and 1.
	 * @param number number to check.
	 * @return true if the value is between (including) 0 and 1, false otherwise.
	 */
	public static boolean betweenZeroandOne(double number){
		if(number<=1 && number>=0){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Checks if a matrix is a binary matrix (each entry has the value of 1 or 0).
	 * @param matrix matrix to check.
	 * @return true if each entry has the value of 1 or 0, false otherwise.
	 */
	public static boolean isBinary(double matrix[][]){
		for(double r[] : matrix){
			for(double i : r){
				if(i!=1 && i!=0){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Checks if a vector is a binary vector (each entry has the value of 1 or 0).
	 * @param vector vector to check.
	 * @return true if each entry has the value of 1 or 0, false otherwise.
	 */
	public static boolean isBinary(int vector[]){
		for(double i : vector){
			if(i!=1 && i!=0){
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Checks if a vector has exactly five entries.
	 * @param v vector to check.
	 * @return true if the vector has exactly five entries, false otherwise.
	 */
	public static boolean hasFiveEntries(double v[]){
		if(v.length==5){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Checks if the sum of all the vector entries is equal to 1.
	 * @param v vector to check.
	 * @return true if the sum of all the vector entries is equal to 1, false otherwise.
	 */
	public static boolean sumAllEntriesEqualToOne(double v[]){
		double sum = 0;
		for(double d:v){
			sum += d;
		}
		if(sum==1){
			return true;
		}
		return false;
	}

}
