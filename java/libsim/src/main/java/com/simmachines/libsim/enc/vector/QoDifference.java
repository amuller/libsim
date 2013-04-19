package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Qo-difference distance]
 * <p>
 * :: The Qo-difference distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Qo-difference distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = \frac{|A\backslash B|\cdot |B\backslash A|}{|A\cap B|\cdot |\overline{A\cup B}|} \)
 
 
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


public class QoDifference {

	/**
	 * Received two binary vectors and calculates the Qo-difference distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Qo-difference distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return (double)(matches[1]*matches[2])/(double)(matches[0]*matches[3]);
	}
}