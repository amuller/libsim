package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Tag-Link-Token distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.TagLinkToken
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class TagLinkToken {

	/**
	 * SimMetrics TagLinkToken object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.TagLinkToken
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.TagLinkToken tagLinkToken = new uk.ac.shef.wit.simmetrics.similaritymetrics.TagLinkToken(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Tag-Link-Token distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Tag-Link-Token distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return tagLinkToken.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Tag-Link-Token distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Tag-Link-Token distance.
	 */
	public static double distance(String str1, String str2){
		return tagLinkToken.getSimilarity(str1, str2);
	}
	
}