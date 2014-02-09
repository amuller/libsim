package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Rand distance]
 * <p>
 * :: The Rand distance (or Simple Matching similarity) is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Brief Description]
 * <p>
 * The Rand distance (Rand index or Rand measure) in statistics, and in particular in data clustering, is a measure of the similarity between two data clusterings.
 * <p>
 * [Definition]
 * <p>
 
 
 The Rand distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{\overline{|A\Delta B|}}{n} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.3 :: Similarities and distances for binary data :: P.304 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Rand_index">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Rand {
	
	/**
	 * Received two binary vectors and calculates the Rand distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Rand distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return 1-((double)(matches[0]+matches[3])/(double)v1.length);
	}

}
