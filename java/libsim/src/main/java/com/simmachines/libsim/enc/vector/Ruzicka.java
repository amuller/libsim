package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Ruzicka distance]
 * <p>
 * :: The Ruzicka distance is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * [Definition]
 * <p>
 
 
 The Ruzicka distance between two vectors \(a,b\) is given by:
 <p>
 \( d= 1-\frac{\sum min \{a_i,b_i\}}{\sum max \{a_i,b_i\}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.298 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Ruzicka {

	/**
	 * Received two double vectors and calculates the Ruzicka distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Ruzicka distance.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		double sumMin = 0;
		double sumMax = 0;
		for(int i=0;i<v1.length;i++){
			sumMin += CommonStats.min(v1[i], v2[i]);
			sumMax += CommonStats.max(v1[i], v2[i]);
		}
		return 1 - (sumMin/sumMax);
	}
	
}
