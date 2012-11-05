package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Matching Coefficient distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.MatchingCoefficient;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class MatchingCoefficient {

	/**
	 * SimMetrics MatchingCoefficient object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.MatchingCoefficient;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.MatchingCoefficient matchingCoefficient = new uk.ac.shef.wit.simmetrics.similaritymetrics.MatchingCoefficient(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Matching Coefficient distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Matching Coefficient distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return matchingCoefficient.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Matching Coefficient distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Matching Coefficient distance.
	 */
	public static double distance(String str1, String str2){
		return matchingCoefficient.getSimilarity(str1, str2);
	}
	
}
