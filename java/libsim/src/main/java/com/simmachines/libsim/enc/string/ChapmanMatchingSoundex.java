package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Chapman-Matching-Soundex distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMatchingSoundex;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class ChapmanMatchingSoundex {

	/**
	 * SimMetrics ChapmanMatchingSoundex object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMatchingSoundex;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMatchingSoundex chapmanMatchingSoundex = new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanMatchingSoundex(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Chapman-Matching-Soundex distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Chapman-Matching-Soundex distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return chapmanMatchingSoundex.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Chapman-Matching-Soundex distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Chapman-Matching-Soundex distance.
	 */
	public static double distance(String str1, String str2){
		return chapmanMatchingSoundex.getSimilarity(str1, str2);
	}
	
}