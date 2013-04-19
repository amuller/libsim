package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Gower-2 distance]
 * <p>
 * :: The Gower-2 distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Gower-2 distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( s = \frac{|A\cap B|\cdot |\overline{A\cup B}|}{\sqrt{|A|\cdot |\overline{A}|\cdot |B|\cdot |\overline{B}|}} \)
 
 \( d = \frac{1-s}{2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.3 :: Similarities and distances for binary data :: P.307 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Gower2 {

	/**
	 * Received two binary vectors and calculates the Gower-2 distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Gower-2 distance.
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
		return 1-((double)(matches[0]*matches[3])/(double)(Math.sqrt(binary1[0]*binary1[1]*binary2[0]*binary2[1])));
	}
}