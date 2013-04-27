package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Jaccard distance]
 * <p>
 * :: The Jaccard similarity is a statistic used for comparing the similarity and diversity of two samples.
 * <p>
 * [Brief Description]
 * <p>
 * The Jaccard coefficient measures similarity between sample sets, however in this case, is between sample strings converted into sets.
 * <p>
 * [Definition]
 * <p>
 
 
 The Jaccard distance between two strings \(a,b\) is given by:
 <p>
 \( J(A,B)=\frac{|A \cap B|}{|A \cup B|} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.299 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Jaccard_index">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Jaccard {

	/**
	 * SimMetrics JaccardSimilarity object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.JaccardSimilarity
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.JaccardSimilarity jaccard = new uk.ac.shef.wit.simmetrics.similaritymetrics.JaccardSimilarity(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Jaccard similarity.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Jaccard similarity.
	 */
	public static double distance(int[] str1, int[] str2){
		return jaccard.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Jaccard similarity.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Jaccard similarity.
	 */
	public static double distance(String str1, String str2){
		return jaccard.getSimilarity(str1, str2);
	}
	
}
