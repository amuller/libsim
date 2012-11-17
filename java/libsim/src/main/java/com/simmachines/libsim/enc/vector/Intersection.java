package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Intersection distance]
 * <p>
 * :: The Intersection is a distance on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * [Definition]
 * <p>
 
 
 The Intersection distance between two vectors \(a,b\) is given by:
 <p>
 \( d= 1-\frac{\sum min \{a_i,b_i\}}{min \{\sum a_i,\sum b_i\}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.300 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Intersection {

	/**
	 * Received two double vectors and calculates the Intersection distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Intersection distance.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(v1, 0);
		Asserts.assertGreaterOrEqualThanValue(v2, 0);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		double sumNum = 0;
		double sumV1 = 0;
		double sumV2 = 0;
		for(int i=0;i<v1.length;i++){
			sumNum += CommonStats.min(v1[i], v2[i]);
			sumV1 += v1[i];
			sumV2 += v2[i];
		}
		return 1 - (sumNum/CommonStats.min(sumV1, sumV2));
	}
	
}
