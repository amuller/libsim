package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Block distance]
 * <p>
 * :: The Block refers to city block distance, which is also known as rectilinear distance, \(L_1\) distance or \( \ell_1\) norm, Manhattan distance, or Manhattan length.
 * <p>
 * [Brief Description]
 * <p>
 * The taxicab distance, \(d_1\), between two vectors \(a,b\) in an \(n\)-dimensional real vector space with fixed Cartesian
 * coordinate system, is the sum of the lengths of the projections of the line segment between the points 
 * onto the coordinate axes.
 * <p>
 * [Definition]
 * <p>
 
 
 The Block distance between two strings \(a,b\) is given by:
 <p>
 \( d_1(a,b)=\|a-b\|_1=\sum_{i=1}^n |a_i-b_i| \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 19.1 :: Metrics on real plane :: P.323 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Taxicab_geometry">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Block {

	/**
	 * SimMetrics BlockDistance object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.BlockDistance
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.BlockDistance block = new uk.ac.shef.wit.simmetrics.similaritymetrics.BlockDistance(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Block distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Block distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return block.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Block distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Block distance.
	 */
	public static double distance(String str1, String str2){
		return block.getSimilarity(str1, str2);
	}
	
}
