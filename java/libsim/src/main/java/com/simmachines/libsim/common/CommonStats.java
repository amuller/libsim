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
	 * Calculates the Euclidean norm of a vector.
	 * @param v vector received.
	 * @return the Euclidean norm.
	 */
	
	public static double norm(double[] v){
		double sum = 0;
		for(int i=0;i<v.length;i++){
			sum += Math.pow(v[i], 2);
		}
		return Math.sqrt(sum);
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
	
}
