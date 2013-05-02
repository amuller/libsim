package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Overlap distance]
 * <p>
 * :: The overlap coefficient is a similarity measure related to the Jaccard coefficient that computes the overlap between two sets.
  * <p>
 * [Brief Description]
 * <p>
 * Given two strings \(a,b\), if \(a\) is a substring of \(b\) or vice versa, then the overlap coefficient is equal to one.
 * <p>
 * [Definition]
 * <p>
 
 
 The Overlap coefficient between two strings \(a,b\) is given by:
 <p>
 \( overlap(A,B)=\frac{|A \cap B|}{min\{|A|,|B|\}} \)
 
 
 Where \(A\) and \(B\) are the set representations of \(a\) and \(b\), respectively.
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.3 :: Similarities and distances for binary data :: P.305 |
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.OverlapCoefficient
 * @see <a href="http://en.wikipedia.org/wiki/Overlap_coefficient">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Overlap {

	/**
	 * SimMetrics OverlapCoefficient object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.OverlapCoefficient
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.OverlapCoefficient overlap = new uk.ac.shef.wit.simmetrics.similaritymetrics.OverlapCoefficient(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Overlap coefficient.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Overlap coefficient.
	 */
	public static double distance(int[] str1, int[] str2){
		return overlap.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Overlap coefficient.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Overlap coefficient.
	 */
	public static double distance(String str1, String str2){
		return overlap.getSimilarity(str1, str2);
	}
	
}
