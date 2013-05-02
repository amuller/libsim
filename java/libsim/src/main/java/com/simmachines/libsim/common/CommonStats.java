package com.simmachines.libsim.common;


import hep.aida.bin.StaticBin1D;

public class CommonStats {
	
	/**
	 * Calculates the mean value of a vector.
	 * @param vector the vector received.
	 * @return the mean value of the vector.
	 */
	public static double mean(double[] vector) {
		StaticBin1D sb = new StaticBin1D();
		for (double d : vector) {
			sb.add(d);
		}
		return sb.mean();
	}
	
	
	/**
	 * Calculates the absolute value of the received number.
	 * @param value the number received.
	 * @return the absolute value of the number.
	 */
	public static double abs(double value){
		if(value<0){
			value*=-1;
		}
		return value;
	}
	
	
	
	/**
	 * Receives three integer numbers and calculates which one is the least.
	 * @param a first integer number.
	 * @param b second integer number.
	 * @param c third integer number.
	 * @return the least number out of the three.
	 */
	public static int min(int a, int b, int c) {
		int mi;

		mi = a;
		if (b < mi) {
			mi = b;
		}
		if (c < mi) {
			mi = c;
		}
		return mi;

	}
	
	
	/**
	 * Receives two  numbers and calculates which one is the least.
	 * @param a first number.
	 * @param b second number.
	 * @return the least number out of the two.
	 */
	public static double min(double a, double b) {
		if(a<b){
			return a;
		}
		return b;
	}
	
	/**
	 * Receives two  numbers and calculates which one is the least.
	 * @param a first number.
	 * @param b second number.
	 * @return the least number out of the two.
	 */
	public static int min(int a, int b) {
		if(a<b){
			return a;
		}
		return b;
	}
	
	
	/**
	 * Receives two numbers and calculates which one is the highest.
	 * @param a first number.
	 * @param b second number.
	 * @return the highest number out of the two.
	 */
	public static double max(double a, double b) {
		if(a>b){
			return a;
		}
		return b;
	}
	
	/**
	 * Receives two numbers and calculates which one is the highest.
	 * @param a first number.
	 * @param b second number.
	 * @return the highest number out of the two.
	 */
	public static int max(int a, int b) {
		if(a>b){
			return a;
		}
		return b;
	}
	
	
	/**
	 * Recieves a vector and calculates the element with the highest value.
	 * @param v vector received.
	 * @return the number with the highest value of the vector.
	 */
	public static double max(double[] v){
		double max=v[0];
		for(double i: v){
			if(i>max){
				max=i;
			}
		}
		return max;
	}
	
	/**
	 * Receives two double vectors and calculates the difference between them.
	 * @param v1 first double vector.
	 * @param v2 second double vector.
	 * @return the difference vector between them.
	 */
	public static double[] difference(double[] v1, double[] v2){
		double res[] = new double[v1.length];
		for(int i=0;i<v1.length;i++){
			res[i]=v1[i] - v2[i];
		}
		return res;
	}
	
	
	/**
	 * Receives two double vectors and calculates the dot product (inner product) of them.
	 * @param v1 first double vector.
	 * @param v2 second double vector.
	 * @return the dot product (inner product) of them.
	 */
	public static double dotProduct(double[] v1, double[] v2){
		double res = 0;
		for(int i=0;i<v1.length;i++){
			res += v1[i] * v2[i];
		}
		return res;
	}
	
	/**
	 * Calculates the Euclidean norm of a vector.
	 * @param v vector received.
	 * @return the Euclidean norm.
	 */
	public static double norm(double[] v){
		return Math.sqrt(dotProduct(v,v));
	}
	
	
	/**
	 * Calculates the hyperbolic arctangent of a number.
	 * @param number number received.
	 * @return the hyperbolic arctangent.
	 */
	public static double arctanh(double number){
		return Math.log((1+number)/(1-number))/2;
	}
	
	/**
	 * Calculates the Longest Common Prefix between two Strings represented by integer arrays.
	 * @param str1 array number 1.
	 * @param str2 array number 2.
	 * @return the first n characters that are equal in both Strings (integer arrays).
	 */
	public static int LCP(int[] str1, int[] str2){
		int min = min(str1.length,str2.length);
		for (int i = 0; i < min; i++) {
            if (str1[i] != str2[i]) {
                return i;
            }
        }
		return min;
	}
	
	/**
	 * Process two binary vectors, calculating the number of variables that are positive for both objects, one of them or none of them.
	 * @param v1 binary vector number 1
	 * @param v2 binary vector number 2
	 * @return an integer vector of four elements, in which the first element represents the number of variables that are positive for both objects (11),
	 * the second element represents the number of variables that are positive for the first object but not for the second (10),
	 * the third element represents the number of variables that are positive for the second object but not for the first (01)
	 * and the fourth element represents the number of variables that are negative for both objects (00).
	 */
	public static int[] processTwoBinaryVectors(int[] v1, int[] v2){
		int[] res = new int[4];
		res[0]=0;
		res[1]=0;
		res[2]=0;
		res[3]=0;
		for(int i=0;i<v1.length;i++){
			if(v1[i]==1 && v2[i]==1){
				res[0]++;
			}else{
				if(v1[i]==1 && v2[i]==0){
					res[1]++;
				}else{
					if(v1[i]==0 && v2[i]==1){
						res[2]++;
					}else{
						res[3]++;
					}
				}
			}
		}
		return res;
	}
	
	
	
	/**
	 * Process a single binary vector, calculating the number of variables that are positive and the number that are negative.
	 * @param v binary vector
	 * @return an integer vector of two elements, in which the first element represents the number of variables that are positive (1),
	 * the second element represents the number of variables that are negative (0).
	 */
	public static int[] processSingleBinaryVector(int[] v){
		int[] res = new int[2];
		res[0]=0;
		res[1]=0;
		for(int i=0;i<v.length;i++){
			if(v[i]==1){
				res[0]++;
			}else{
				res[1]++;
			}
		}
		return res;
	}
	
	
	/**
	 * Checks if the product of two doubles is equal to zero, and returns 1 or 0 depending on the wanted result
	 * @param x double number 1
	 * @param y double number 2
	 * @param resultZero boolean that indicates if the zero is the wanted result or if the wanted is a non-zero result
	 * @return if the result you need is zero, then returns 1 if resultZero is true (as long as the product result is zero), 0 if it is false; if the result you need is non-zero, then returns 1 if resultZero is false (as long as the porduct result is non-zero), 0 if it is true. 
	 */
	public static int zeroProduct(double x, double y, boolean resultZero){
		if(x*y==0){
			if(resultZero){
				return 1;
			}else{
				return 0;
			}
		}else{
			if(resultZero){
				return 0;
			}else{
				return 1;
			}
		}
	}
	
}