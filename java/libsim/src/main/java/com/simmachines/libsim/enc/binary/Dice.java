package com.simmachines.libsim.enc.binary;

import com.simmachines.libsim.asserts.Asserts;
/**
 * [Dice distance]
 * <p>
 * :: The Dice distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Dice distance between two binary vectors \(A,B\) of length \(n\) is the average value of the Simpson and Braun-Blanquet Distance.
 
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
 * @author James Wang, Jose Daniel Salazar-Vargas
 * 
 */

public class Dice
{
	
	/**
	 * Received two binary vectors and calculates the Dice distance.
	 * @param v1 binary vector number 1.
	 * @param v2 binary vector number 2.
	 * @return The Dice distance.
	 * 
	 * 
	 */
	
	public static double distance(int[] v1, int[] v2){
		
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertIsBinary(v1);
		Asserts.assertIsBinary(v2);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		return (Simpson.distance(v1, v2) + BraunBlanquet.distance(v1, v2))/2;
	}
}