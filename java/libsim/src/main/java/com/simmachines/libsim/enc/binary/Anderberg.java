package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Anderberg distance]
 * <p>
 * :: The Anderberg distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Anderberg distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{|A\cap B|}{4} (\frac{1}{|A|} + \frac{1}{|B|}) +\frac{|\overline{A\cup B}|}{4} (\frac{1}{|\overline{A}|} + \frac{1}{|\overline{B}|}) \)
 
 
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


public class Anderberg {

	/**
	 * Received two binary vectors and calculates the Anderberg distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Anderberg distance.
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
		return 1-((((double)matches[0]/4)*(((double)1/binary1[0])+((double)1/binary2[0])))+(((double)matches[3]/4)*(((double)1/binary1[1])+((double)1/binary2[1]))));
	}
}