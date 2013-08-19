package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Roger-Tanimoto distance]
 * <p>
 * :: The Roger-Tanimoto distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Roger-Tanimoto distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 \( d = 1 - \frac{|A\cap B|}{n+|A\Delta B|} \)
 
 
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


public class RogerTanimoto {

	/**
	 * Received two binary vectors and calculates the Roger-Tanimoto distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Roger-Tanimoto distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return 1-((double)(matches[0]+matches[3])/(double)(v1.length+matches[1]+matches[2]));
	}
}