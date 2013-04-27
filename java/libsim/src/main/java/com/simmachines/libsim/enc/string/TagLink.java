package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Tag-Link distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.TagLink
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class TagLink {

	/**
	 * SimMetrics TagLink object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.TagLink
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.TagLink tagLink = new uk.ac.shef.wit.simmetrics.similaritymetrics.TagLink(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Tag-Link distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Tag-Link distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return tagLink.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Tag-Link distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Tag-Link distance.
	 */
	public static double distance(String str1, String str2){
		return tagLink.getSimilarity(str1, str2);
	}
	
}
