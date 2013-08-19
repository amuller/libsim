package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Forbes distance]
 * <p>
 * :: The Forbes distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Forbes distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{n|A\cap B|}{|A||B|} \)
 
 
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


public class Forbes {

	/**
	 * Received two binary vectors and calculates the Forbes distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Forbes distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		int[] binary1 = CommonStats.processSingleBinaryVector(v1);
		int[] binary2 = CommonStats.processSingleBinaryVector(v2);
		return 1-((double)(v1.length*matches[0])/(double)(binary1[0]*binary2[0]));
	}
	
}
