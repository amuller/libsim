package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Hamann distance]
 * <p>
 * :: The Hamann distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Hamann distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = \frac{1-\frac{n-2|A\Delta B|}{n}}{2} \)
 
 
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


public class Hamann {

	/**
	 * Received two binary vectors and calculates the Hamann distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Hamann distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return (1-((double)(v1.length-(2*(matches[1]+matches[2])))/(double)v1.length))/2;
	}
	
}
