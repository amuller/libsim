package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Sokal-Sneath 1 distance]
 * <p>
 * :: The Sokal-Sneath 1 distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Sokal-Sneath 1 distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{2\overline{|A\Delta B|}}{n+\overline{|A\Delta B|}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.3 :: Similarities and distances for binary data :: P.304 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class SokalSneath1 {

	/**
	 * Received two binary vectors and calculates the Sokal-Sneath 1 distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Sokal-Sneath 1 distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return 1-((double)(2*(matches[0]+matches[3]))/(double)(v1.length+(matches[0]+matches[3])));
	}
	
}
