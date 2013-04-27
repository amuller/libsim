package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Ochiai-Otsuka distance]
 * <p>
 * :: The Ochiai-Otsuka distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Ochiai-Otsuka distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = \frac{|A\cap B|}{\sqrt{|A|\cdot |B|}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.308 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class OchiaiOtsuka {

	/**
	 * Received two binary vectors and calculates the Ochiai-Otsuka distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Ochiai-Otsuka distance.
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
		return 1-((double)(matches[0])/(double)(Math.sqrt(binary1[0]*binary2[0])));
	}
}