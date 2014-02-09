package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Yule-Q distance]
 * <p>
 * :: The Yule-Q distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Yule-Q distance between two binary vectors \(A,B\) of length \(n\) is given by:
 <p>
 
 \( d = \frac{1-s}{2} \)
  
  <p>
 Where \(s\) is the Yule-Q similarity:
 <p>
  
\( s = \frac{|A\cap B|\cdot |\overline{A\cup B}|- |A\backslash B|\cdot |B\backslash A|}{|A\cap B|\cdot |\overline{A\cup B}|+ |A\backslash B|\cdot |B\backslash A|} \)
  
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


public class YuleQ {

	/**
	 * Received two binary vectors and calculates the Yule-Q distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Yule-Q distance.
	 */
	public static double distance(int[] v1, int[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		int[] matches = CommonStats.processTwoBinaryVectors(v1, v2);
		return (1-((double)((matches[0]*matches[3])-(matches[1]*matches[2]))/(double)((matches[0]*matches[3])+(matches[1]*matches[2]))))/2;
	}
}