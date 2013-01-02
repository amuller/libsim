package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Penrose shape distance]
 * <p>
 * :: The Penrose shape distance is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>


 The Penrose shape distance between two vectors \(a,b\) is given by:
 <p>
 \( d = \sqrt{\sum((a_i-\overline{a})-(b_i-\overline{b}))^2} \)
 
 
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


public class PenroseShape {

	/**
	 * Received two double vectors and calculates the Penrose shape distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Penrose shape distance.
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.assertEqualLength(v1, v2);
		double meanV1 = CommonStats.mean(v1);
		double meanV2 = CommonStats.mean(v2);
		double sum = 0;
		for(int i=0;i<v1.length;i++){
			sum += Math.pow((v1[i]-meanV1)-(v2[i]-meanV2),2);
		}
		return Math.sqrt(sum);
	}
	
}
