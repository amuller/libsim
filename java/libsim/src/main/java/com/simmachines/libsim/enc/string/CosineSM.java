package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Cosine distance]
 * <p>
 * :: The Cosine is a measure of similarity between two vectors by measuring the cosine of the angle between them.
 * <p>
 * [Brief Description]
 * <p>
 * The cosine of the angle between two vectors thus determines whether two vectors are pointing in roughly the same direction.
 * This class implements the Cosine Similarity algorithm providing a similarity measure between two strings from the angular divergence within term based vector space.
 * <p>
 * [Definition]
 * <p>
 
 
 The Cosine distance between two strings \(a,b\) is given by:
 <p>
 \( d=1-\frac{\langle a,b \rangle}{\| a \|_2 \cdot \| b \|_2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.308 |
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.CosineSimilarity
 * @see <a href="http://en.wikipedia.org/wiki/Cosine_similarity">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class CosineSM {

	/**
	 * SimMetrics CosineSimilarity object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.CosineSimilarity
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.CosineSimilarity cosine = new uk.ac.shef.wit.simmetrics.similaritymetrics.CosineSimilarity(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Cosine similarity.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Cosine similarity.
	 */
	public static double distance(int[] str1, int[] str2){
		return cosine.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Cosine similarity.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Cosine similarity.
	 */
	public static double distance(String str1, String str2){
		return cosine.getSimilarity(str1, str2);
	}
	
}
