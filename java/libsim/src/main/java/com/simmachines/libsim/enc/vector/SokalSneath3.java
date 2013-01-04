package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Sokal-Sneath 3 similarity]
 * <p>
 * :: The Sokal-Sneath 3 similarity is a similarity for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Sokal-Sneath 3 similarity between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = \frac{|A\Delta B|}{|\overline{A\Delta B}|} \)
 
 
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


public class SokalSneath3 {

	/**
	 * Received two binary vectors and calculates the Sokal-Sneath 3 similarity.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Sokal-Sneath 3 similarity.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		int[] matches = CommonStats.processBinaryVectors(v1, v2);
		return (double)(matches[1]+matches[2])/(double)(matches[0]+matches[3]);
	}
	
}
