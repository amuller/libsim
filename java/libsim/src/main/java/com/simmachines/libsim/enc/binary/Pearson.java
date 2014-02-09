package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Pearson distance]
 * <p>
 * :: The Pearson distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Pearson distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 
 \( d = \frac{1-s}{2} \)
 
  <p>
 Where \(s\) is the Pearson similarity:
 <p>
 
 \( s = \frac{|A\cap B|\cdot |\overline{A\cup B}|- |X\backslash Y|\cdot |Y\backslash X|}{\sqrt{|A|\cdot |\overline{A}|\cdot |B|\cdot |\overline{B}|}} \)
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.3 :: Similarities and distances for binary data :: P.306 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Pearson {

	/**
	 * Received two binary vectors and calculates the Pearson distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Pearson distance.
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
		return (1-((double)((matches[0]*matches[3])-(matches[1]*matches[2]))/(double)(Math.sqrt(binary1[0]*binary1[1]*binary2[0]*binary2[1]))))/2;
	}
}