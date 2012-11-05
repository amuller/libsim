package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Chapman-Mean-Length distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMeanLength;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class ChapmanMeanLength {

	/**
	 * SimMetrics ChapmanMeanLength object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMeanLength;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMeanLength chapmanMeanLength = new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMeanLength(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Chapman-Mean-Length distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Chapman-Mean-Length distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return chapmanMeanLength.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Chapman-Mean-Length distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Chapman-Mean-Length distance.
	 */
	public static double distance(String str1, String str2){
		return chapmanMeanLength.getSimilarity(str1, str2);
	}
	
}