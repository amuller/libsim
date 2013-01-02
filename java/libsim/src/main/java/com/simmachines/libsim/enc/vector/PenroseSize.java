package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;

/**
 * [Penrose size distance]
 * <p>
 * :: The Penrose size distance is a distance in data analisis on \( \mathbb{R}^n \), it is proportional to the Manhattan metric.
 * <p>
 * [Definition]
 * <p>


 The Penrose size distance between two vectors \(a,b\) of size \(n\) is given by:
 <p>
 \( d = \sqrt{n} \sum |a_i-b_i| \)
 
 
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


public class PenroseSize {

	/**
	 * Received two double vectors and calculates the Penrose size distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Penrose size distance.
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.assertEqualLength(v1, v2);
		int n = v1.length;
		double sum = 0;
		for(int i=0;i<n;i++){
			sum += Math.abs(v1[i]-v2[i]);
		}
		return sum*Math.sqrt(n);
	}
	
}
