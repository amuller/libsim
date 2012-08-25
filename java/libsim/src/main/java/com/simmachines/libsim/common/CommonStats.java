package com.simmachines.libsim.common;

import java.util.HashSet;
import java.util.Iterator;

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
	 * Calculates the Euclidean norm (length) of a Set.
	 * @param c Set received.
	 * @return the Euclidean Norm (length).
	 */
	
	public static double norm(HashSet<Double> c){
		double sum = 0;
		Iterator<Double> iter = c.iterator();
		while(iter.hasNext()){
			sum += Math.pow(iter.next().doubleValue(), 2);
		}
		return Math.sqrt(sum);
	}
	
}
