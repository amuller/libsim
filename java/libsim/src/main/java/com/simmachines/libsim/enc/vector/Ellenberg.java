package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Ellenberg similarity]
 * <p>
 * :: The Ellenberg is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * [Definition]
 * <p>
 
 
 The Ellenberg similarity between two vectors \(a,b\) is given by:
 <p>
 \( d= \frac{\sum (a_i+b_i) 1_{x_i\cdot y_i\neq 0}}{\sum (a_i+b_i)(1+1_{x_i\cdot y_i=0})} \)
 
 
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


public class Ellenberg {

	/**
	 * Received two double vectors and calculates the Ellenberg similarity.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Ellenberg similarity.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double sumNum = 0;
		double sumDenom = 0;
		for(int i=0;i<v1.length;i++){
			sumNum += (v1[i] + v2[i])*CommonStats.zeroProduct(v1[i],v2[i],false);
			sumDenom += (v1[i] + v2[i])*(1+CommonStats.zeroProduct(v1[i],v2[i],true));
		}
		return sumNum/sumDenom;
	}
	
}
