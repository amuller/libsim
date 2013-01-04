package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Morisita-Horn similarity]
 * <p>
 * :: The Morisita-Horn similarity is a correlation similarity in data analisis on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>
 
 
 The Morisita-Horn similarity between two vectors \(a,b\) is given by:
 <p>
 \( d=\frac{2\langle a,b \rangle}{\| a \|^2_2 \cdot \frac{\overline{b}}{\overline{a}}+\| b \|^2_2 \cdot \frac{\overline{a}}{\overline{b}}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.309 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class MorisitaHorn {

	/**
	 * Received two double vectors and calculates the Morisita-Horn similarity.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Morisita-Horn similarity.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(v1, 0);
		Asserts.assertGreaterOrEqualThanValue(v2, 0);
		double meanV1 = CommonStats.mean(v1);
		double meanV2 = CommonStats.mean(v2);
		return (2*CommonStats.dotProduct(v1, v2))/((Math.pow(CommonStats.norm(v1), 2)*(meanV2/meanV1))+(Math.pow(CommonStats.norm(v2), 2)*(meanV1/meanV2)));
	}
	
}
