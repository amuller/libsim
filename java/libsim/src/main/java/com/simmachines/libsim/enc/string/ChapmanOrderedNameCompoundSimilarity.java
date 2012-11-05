package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Chapman-Ordered-Name-Compound similarity]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanOrderedNameCompoundSimilarity;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class ChapmanOrderedNameCompoundSimilarity {

	/**
	 * SimMetrics ChapmanOrderedNameCompoundSimilarity object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanOrderedNameCompoundSimilarity;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanOrderedNameCompoundSimilarity chapmanOrderedNameCompoundSimilarity = new uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanOrderedNameCompoundSimilarity(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Chapman-Ordered-Name-Compound similarity.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Chapman-Ordered-Name-Compound similarity.
	 */
	public static double distance(int[] str1, int[] str2){
		return chapmanOrderedNameCompoundSimilarity.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Chapman-Ordered-Name-Compound similarity.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Chapman-Ordered-Name-Compound similarity.
	 */
	public static double distance(String str1, String str2){
		return chapmanOrderedNameCompoundSimilarity.getSimilarity(str1, str2);
	}
	
}