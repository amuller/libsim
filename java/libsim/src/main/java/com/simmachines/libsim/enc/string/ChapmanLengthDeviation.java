package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Chapman-Length-Deviation distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanLengthDeviation;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class ChapmanLengthDeviation {

	/**
	 * SimMetrics ChapmanLengthDeviation object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanLengthDeviation;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanLengthDeviation chapmanLengthDeviation = new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanLengthDeviation(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Chapman-Length-Deviation distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Chapman-Length-Deviation distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return chapmanLengthDeviation.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Chapman-Length-Deviation distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Chapman-Length-Deviation distance.
	 */
	public static double distance(String str1, String str2){
		return chapmanLengthDeviation.getSimilarity(str1, str2);
	}
	
}