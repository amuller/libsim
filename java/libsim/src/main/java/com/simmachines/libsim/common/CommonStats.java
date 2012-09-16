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
	 * Receives two integer numbers and calculates which one is the least.
	 * @param a first integer number.
	 * @param b second integer number.
	 * @return the least number out of the two.
	 */
	
	public static double min(double a, double b) {
		if(a<b){
			return a;
		}
		return b;
	}
	
	
	/**
	 * Receives two integer numbers and calculates which one is the highest.
	 * @param a first integer number.
	 * @param b second integer number.
	 * @return the highest number out of the two.
	 */
	
	public static double max(double a, double b) {
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
	
}
