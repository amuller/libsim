package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Kulczynski-2 similarity]
 * <p>
 * :: The Kulczynski-2 is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * [Definition]
 * <p>
 
 
 The Kulczynski-2 similarity between two vectors \(a,b\) is given by:
 <p>
 \( d= \frac{n}{2}(\frac{1}{\overline{a}}+\frac{1}{\overline{b}})\sum min \{a_i,b_i\} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.301 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Kulczynski2 {

	/**
	 * Received two double vectors and calculates the Kulczynski-2 similarity.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Kulczynski-2 similarity.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(v1, 0);
		Asserts.assertGreaterOrEqualThanValue(v2, 0);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		double sum = 0;
		double promV1 = 0;
		double promV2 = 0;
		for(int i=0;i<v1.length;i++){
			promV1 += v1[i];
			promV2 += v2[i];
			sum += CommonStats.min(v1[i], v2[i]);
		}
		promV1 /= v1.length;
		promV2 /= v1.length;
		return (((double)v1.length/2)*((1/promV1)+(1/promV2))*sum);
	}
	
}
