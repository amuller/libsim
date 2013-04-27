package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Dice similarity]
 * <p>
 * :: The Dice similarity is a statistic used for comparing the similarity of two samples.
 * <p>
 * [Brief Description]
 * <p>
 * The Dice coefficient, is a similarity measure over sets, in this case, over strings converted into sets.
 * <p>
 * [Definition]
 * <p>
 
 
 The Dice similarity between two strings \(a,b\) is given by:
 <p>
 \( d(A,B)=\frac{2|A \cap B|}{|A|+|B|} \)
 * <p>
 * Where \(A\) and \(B\) are the set representation of \(a\) and \(b\) respectively.
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.299 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Dice's_coefficient">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Dice {

	/**
	 * SimMetrics DiceSimilarity object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.DiceSimilarity
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.DiceSimilarity dice = new uk.ac.shef.wit.simmetrics.similaritymetrics.DiceSimilarity(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Dice similarity.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Dice similarity.
	 */
	public static double distance(int[] str1, int[] str2){
		return dice.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Dice similarity.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Dice similarity.
	 */
	public static double distance(String str1, String str2){
		return dice.getSimilarity(str1, str2);
	}
	
}
