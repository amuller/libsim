package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [JaroWinkler distance]
 * <p>
 * :: The Jaro-Winkler distance is a measure of similarity between two strings.
 * <p>
 * [Brief Description]
 * <p>
 * It is a variant of the Jaro distance metric and mainly used in the area of record linkage (duplicate detection).
 * <p>
 * [Definition]
 * <p>
 
 
 The JaroWinkler distance between two strings \(a,b\) is given by:
 <p>
 \( JW(a,b)=Jaro(a,b)+\frac{max\{4,LCP(a,b)\}}{10}(1-Jaro(a,b)) \)
 * <p>
 * where \(Jaro(a,b)\) is the Jaro similarity, and \(LCP (a,b)\) is the length of the longest common prefix of \(a\) and \(b\).
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.206 |
 * <p>
 * 
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler
 * 
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.Jaro
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class JaroWinkler {
	
	/**
	 * SimMetrics JaroWinkler object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler jaroWinkler = new uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Jaro-Winkler distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Jaro-Winkler distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return jaroWinkler.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Jaro-Winkler distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Jaro-Winkler distance.
	 */
	public static double distance(String str1, String str2){
		return jaroWinkler.getSimilarity(str1, str2);
	}
	
}
