package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Roberts similarity]
 * <p>
 * :: The Roberts is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * [Definition]
 * <p>
 
 
 The Roberts distance between two vectors \(a,b\) is given by:
 <p>
 \( d= \frac{\sum (a_i+b_i) \frac{min \{a_i,b_i\}}{max \{a_i,b_i\}}}{\sum (a_i+b_i)} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.299 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Roberts {

	/**
	 * Received two double vectors and calculates the Roberts similarity.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Roberts similarity.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double sumNum = 0;
		double sumDenom = 0;
		for(int i=0;i<v1.length;i++){
			sumNum += (v1[i] + v2[i])*(CommonStats.min(v1[i], v2[i])/CommonStats.max(v1[i], v2[i]));
			sumDenom += (v1[i] + v2[i]);
		}
		return sumNum/sumDenom;
	}
	
}
