package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Hellinger distance]
 * <p>
 * :: The Hellinger distance is a distance in data analisis on \( \mathbb{R}^n_+ \).
 * <p>
 * [Definition]
 * <p>


 The Hellinger distance between two vectors \(a,b\) is given by:
 <p>
 \( d = \sqrt{2 \sum(\sqrt{\frac{a_i}{\overline{a}}}-\sqrt{\frac{b_i}{\overline{b}}})^2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.2 :: Relatives of Euclidean distance :: P.303 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Hellinger {

	/**
	 * Received two double vectors and calculates the Hellinger distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Hellinger distance.
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(v1, 0);
		Asserts.assertGreaterOrEqualThanValue(v2, 0);
		double meanV1 = CommonStats.mean(v1);
		double meanV2 = CommonStats.mean(v2);
		int n = v1.length;
		double sum = 0;
		for(int i=0;i<n;i++){
			sum += Math.pow(Math.sqrt(v1[i]/meanV1)-Math.sqrt(v2[i]/meanV2),2);
		}
		return Math.sqrt(2*sum);
	}
	
}
