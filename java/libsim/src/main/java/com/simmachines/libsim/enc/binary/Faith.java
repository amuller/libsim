package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Faith distance]
 * <p>
 * :: The Faith distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Faith distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{|A\cap B|+|\overline{A\Delta B}|}{2n} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.3 :: Similarities and distances for binary data :: P.305 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Faith {

	/**
	 * Received two binary vectors and calculates the Faith distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Faith distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return 1-((double)(2*matches[0]+matches[3])/(double)(2*v1.length));
	}
}