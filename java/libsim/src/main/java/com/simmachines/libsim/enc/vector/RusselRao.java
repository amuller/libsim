package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Russel-Rao distance]
 * <p>
 * :: The Russel-Rao distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Russel-Rao distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{|A\cap B|}{n} \)
 
 
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


public class RusselRao {

	/**
	 * Received two binary vectors and calculates the Russel-Rao distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Russel-Rao distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		int[] matches = CommonStats.processBinaryVectors(v1, v2);
		return 1-((double)(matches[0])/(double)(v1.length));
	}
	
}
