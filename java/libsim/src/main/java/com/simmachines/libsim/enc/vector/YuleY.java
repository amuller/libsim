package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Yule-Y distance]
 * <p>
 * :: The Yule-Y distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Yule-Y distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 
 \( d = \frac{1-s}{2} \)
 
 <p>
 Where \(s\) is the Yule-Y similarity:
 <p>
 
\( s = \frac{\sqrt{|A\cap B|\cdot |\overline{A\cup B}|}- \sqrt{|A\backslash B|\cdot |B\backslash A|}}{\sqrt{|A\cap B|\cdot |\overline{A\cup B}|}+ \sqrt{|A\backslash B|\cdot |B\backslash A|}} \)
 
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


public class YuleY {

	/**
	 * Received two binary vectors and calculates the Yule-Y distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Yule-Y distance.
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
		return (1-((double)(Math.sqrt(matches[0]*matches[3])-Math.sqrt(matches[1]*matches[2]))/(double)(Math.sqrt(matches[0]*matches[3])+Math.sqrt(matches[1]*matches[2]))))/2;
	}
}