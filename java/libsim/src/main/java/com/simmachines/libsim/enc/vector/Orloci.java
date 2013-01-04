package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [Orloci distance]
 * <p>
 * :: The Orloci distance (or chord distance) is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>
 
 
 The Orloci distance between two vectors \(a,b\) is given by:
 <p>
 \( d=\sqrt{2 (1-\frac{\langle a,b \rangle}{\| a \|_2 \cdot \| b \|_2})} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.308 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Orloci {

	/**
	 * Receives two double vectors and calculates the Orloci distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Orloci distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		return Math.sqrt(2*(1-CommonStats.dotProduct(v1, v2)/(CommonStats.norm(v1)*CommonStats.norm(v2))));
	}
	
}
