package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;

/**
 * [Clark distance]
 * <p>
 * :: The Clark distance is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>


 The Clark distance between two vectors \(a,b\) of size \(n\) is given by:
 <p>
 \( d = (\frac{1}{n} \sum(\frac{a_i-b_i}{|a_i|+|b_i|})^2)^{\frac{1}{2}} \)
 
 
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


public class Clark {

	/**
	 * Received two double vectors and calculates the Clark distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Clark distance.
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.assertEqualLength(v1, v2);
		int n = v1.length;
		double sum = 0;
		for(int i=0;i<n;i++){
			sum += Math.pow((v1[i]-v2[i])/(Math.abs(v1[i])+Math.abs(v2[i])),2);
		}
		return Math.sqrt(sum/n);
	}
	
}
