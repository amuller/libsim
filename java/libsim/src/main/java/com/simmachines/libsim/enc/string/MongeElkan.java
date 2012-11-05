package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Monge-Elkan distance]
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.MongeElkan;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class MongeElkan {

	/**
	 * SimMetrics MongeElkan object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.MongeElkan;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.MongeElkan mongeElkan = new uk.ac.shef.wit.simmetrics.similaritymetrics.MongeElkan(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Monge-Elkan distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Monge-Elkan distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return mongeElkan.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Monge-Elkan distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Monge-Elkan distance.
	 */
	public static double distance(String str1, String str2){
		return mongeElkan.getSimilarity(str1, str2);
	}
	
}
