package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;

/**
 * [LP distance]
 * <p>
 * :: A generalization of the Euclidean distance (L2).
 * <p>
 * [Brief Description]
 * <p>
 * The LP distance is a generalization of the Euclidean distance (L2) and the Manhattan distance (L1),
 * in which the norm is giving by the parameter P (P = 2 for Euclidean distance, P = 1 for the Manhattan distance).
 * <p>
 * [Definition]
 * <p>
 
 
 The LP distance between two vectors \( a, b \) is given by:
 <p>
 \( {l_p}(a,b)=(\sum\limits_{i=1}^n |a_i-b_i|^p)^{1/p}  \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 5 :: Metric on Normed Structures :: P.94 |
 * <p>
 * @see <a href=http://http://en.wikipedia.org/wiki/Lp_space">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class LP {
	
	/**
	 * Received two double vectors and one double value and calculates the LP distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @param p indicates the norm in which the metric is going to be evaluated.
	 * @return the LP-metric distance.
	 */

	public static double distance(double v1[], double v2[], double p){
		double sum = 0;
		for(int i=0; i < v1.length; i++){
			sum+=Math.pow(CommonStats.abs(v1[i]-v2[i]),p);
		}
		return Math.pow(sum, 1/p);
	}
	
}
