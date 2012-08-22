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
	
}
