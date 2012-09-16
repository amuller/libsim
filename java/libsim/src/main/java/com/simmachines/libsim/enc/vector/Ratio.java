package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;


/**
 * [Ratio distance]
 * <p>
 * :: The Ratio Similarity (or Kohonen similarity) is a correlation similarity on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>
 
 
 The Ratio distance between two vectors \(a,b\) is given by:
 <p>
 \( d=\frac{\langle a,b \rangle}{\langle a,b \rangle+\| a-b \|^2_2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.308 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Ratio {
	/**
	 * Received two double vectors and calculates the Ratio distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Ratio distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		double sum = 0;
		double dotProduct = CommonStats.dotProduct(v1, v2);
		sum = dotProduct/(dotProduct+Math.pow(CommonStats.norm(CommonStats.difference(v1, v2)), 2));
		return sum;
	}
	
}
