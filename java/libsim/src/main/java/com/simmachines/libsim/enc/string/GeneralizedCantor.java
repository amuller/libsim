package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;
import com.simmachines.libsim.common.Transformations;

/**
 * [Generalized Cantor metric]
 * <p>
 * :: The Generalized Cantor metric is an ultrametric between finite or infinite strings.
 * <p>
 * [Definition]
 * <p>
 
 
 The Generalized Cantor metric between two strings \(x,y\) is given by:
 <p>
 \( d = a^{1 + LCP(x,y)} \),
 <p>
 where \(a\) is a fixed number from the interval \([0,1]\), and \(LCP(x,y)\) is the length of the longest common prefix of \(x\) and \(y\).
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.209 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class GeneralizedCantor {

	/**
	 * Received two strings representing two words and calculates the Generalized Cantor metric.
	 * @param a is a fixed number from the interval \(0,1\).
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Generalized Cantor metric.
	 */
	public static double distance (double a, String str1, String str2){
		return distance(a, Transformations.convertStringToIntArray(str1),Transformations.convertStringToIntArray(str2));
	}
	
	/**
	 * Received two integer vectors representing two words and calculates the Generalized Cantor metric.
	 * @param a is a fixed number from the interval \(0,1\).
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The Generalized Cantor metric.
	 */
	public static double distance(double a, int[] str1, int[] str2){
		Asserts.assertBetweenZeroandOne(a);
		return Math.pow(a, (double)(1 + CommonStats.LCP(str1, str2)));
	}
	
}
