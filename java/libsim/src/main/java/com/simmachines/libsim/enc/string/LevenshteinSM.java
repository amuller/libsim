package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Levenshtein distance]
 * <p>
 * :: Compares the similarity between two strings based on edit operations.
 * <p>
 * [Brief Description]
 * <p>
 * The Levenshtein distance between two strings is defined as the minimum number
 * of edits needed to transform one string into the other, with the allowable
 * edit operations being insertion, deletion, or substitution of a single
 * character.
 * <p>
 * [Definition]
 * <p>
 * 
 * Mathematically, the Levenshtein distance between two strings \(a, b\)  is given by \( \operatorname{lev}_{a,b}(|a|,|b|) \) where
 * <p>
 * \( \qquad\operatorname{lev}_{a,b}(i,j) = \begin{cases} 0 &, i=j=0 \\ i &,
 * j = 0 \land i > 0 \\ j &, i = 0 \land j > 0 \\ \min \begin{cases}
 * \operatorname{lev}_{a,b}(i-1,j) + 1 \\ \operatorname{lev}_{a,b}(i,j-1) + 1 \\
 * \operatorname{lev}_{a,b}(i-1,j-1) + [a_i \neq b_j] \end{cases} &, \text{
 * else} \end{cases} \)
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on General Strings :: P. 202 |
 * <p>
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Levenshtein_distance">Wikipedia
 *      Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class LevenshteinSM {

	/**
	 * SimMetrics Levenshtein object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein levenshtein = new uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Levenshtein distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Levenshtein distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return levenshtein.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Levenshtein distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Levenshtein distance.
	 */
	public static double distance(String str1, String str2){
		return levenshtein.getSimilarity(str1, str2);
	}
	
}
