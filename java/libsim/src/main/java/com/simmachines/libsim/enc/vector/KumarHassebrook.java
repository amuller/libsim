package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;


/**
 * [Kumar-Hassebrook distance]
 * <p>
 * :: The Kumar-Hassebrook Similarity is a correlation similarity on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>
 
 
 The Kumar-Hassebrook distance between two vectors \(a,b\) is given by:
 <p>
 \( d=\frac{\langle a,b \rangle}{\| a-b \|^2_2 + \langle a,b \rangle} \)
 
 
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

public class KumarHassebrook {
	/**
	 * Received two double vectors and calculates the Kumar-Hassebrook distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Kumar-Hassebrook distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		double sum = 0;
		double dotProduct = CommonStats.dotProduct(v1, v2);
		sum = dotProduct/(Math.pow(CommonStats.norm(CommonStats.difference(v1, v2)), 2)+dotProduct);
		return sum;
	}
	
}