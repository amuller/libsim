package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Baroni-Urbani-Buser distance]
 * <p>
 * :: The Baroni-Urbani-Buser distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Baroni-Urbani-Buser distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = \frac{|A\cap B|+\sqrt{|A\cap B|\cdot |\overline{A\cup B}|}}{|A\cup B|+\sqrt{|A\cap B|\cdot |\overline{A\cup B}|}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.2 :: Relatives of Euclidean distance :: P.301 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class BaroniUrbaniBuser {

	/**
	 * Received two binary vectors and calculates the Baroni-Urbani-Buser distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Baroni-Urbani-Buser distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		double term = Math.sqrt(matches[0]*matches[3]);
		return 1-((matches[0]+term)/(matches[0]+matches[1]+matches[2]+term));
	}
}