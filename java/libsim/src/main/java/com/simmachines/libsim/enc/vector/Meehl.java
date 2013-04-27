package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;

/**
 * [Meehl distance]
 * <p>
 * :: The Meehl distance is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>


 The Meehl distance between two vectors \(a,b\) of size \(n\) is given by:
 <p>
 \( d = \sum_{1\leq i \leq n-1}(a_i-b_i-a_{i+1}+b_{i+1})^2 \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.2 :: Relatives of Euclidean distance :: P.302 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Meehl {

	/**
	 * Received two double vectors and calculates the Meehl distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Meehl distance.
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.assertEqualLength(v1, v2);
		int n = v1.length;
		double sum = 0;
		for(int i=0;i<n-1;i++){
			sum += Math.pow((v1[i]-v2[i]-v1[i+1]+v2[i+1]),2);
		}
		return sum;
	}
	
}