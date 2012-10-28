package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Euclidean distance]
 * <p>
 * :: The Euclidean distance is the "ordinary" distance between two points, and is given by the Pythagorean formula. 
 * <p>
 * [Brief Description]
 * <p>
 * The Euclidean distance between points \( a \) and \( b \) is the length of the line segment connecting them.
 * <p>
 * [Definition]
 * <p>
 
 
 The Euclidean distance between two vectors \(a,b\) is given by: 
  <p>
 \( l_2(a,b)=\sqrt{(a_1-b_1)^2+\cdots+(a_n-b_n)^2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 5 :: Metric on Normed Structures :: P.94 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Euclidean_distance">Wikipedia Article</a>
 * 
 * @author  Jose Daniel Salazar-Vargas
 * 
 */


public class Euclidean {

	/**
	 * SimMetrics EuclideanDistance object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.EuclideanDistance;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.EuclideanDistance euclidean = new uk.ac.shef.wit.simmetrics.similaritymetrics.EuclideanDistance(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Euclidean distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Euclidean distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return euclidean.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Euclidean distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Euclidean distance.
	 */
	public static double distance(String str1, String str2){
		return euclidean.getSimilarity(str1, str2);
	}
	
}
