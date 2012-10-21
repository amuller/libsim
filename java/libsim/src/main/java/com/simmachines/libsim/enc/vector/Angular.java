package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Angular distance]
 * <p>
 * :: The angular semi-metric on \( \mathbb{R}^n \) is the angle (measured in radians) between two vectors.
 * <p>
 * [Definition]
 * <p>
 
 
 The Angular distance between two vectors \(a,b\) is given by:
 <p>
 \( d=\arccos \frac{\langle a,b \rangle}{\| a \|_2 \cdot \| b \|_2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.308 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Cosine_similarity">Wikipedia Article (Related distance)</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Angular {

	
	/**
	 * Received two double vectors and calculates the Angular distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Angular distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		if(v1==v2){
			return 0;
		}
		double res;
		res=CommonStats.dotProduct(v1, v2)/(CommonStats.norm(v1)*CommonStats.norm(v2));
		Asserts.assertBetween1andMinus1(res);
		return Math.acos(res);
	}
	
}
