package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.CommonStats;
import com.simmachines.libsim.common.Transformations;

/**
 * [Baire metric]
 * <p>
 * :: The Baire metric is an ultrametric between finite or infinite strings.
 * <p>
 * [Definition]
 * <p>
 
 
 The Baire metric between two strings \(a,b\) is given by:
 <p>
 \( d = \frac{1}{1 + LCP(a,b)} \),
 <p>
 where \(LCP(a,b)\) is the length of the longest common prefix of \(a\) and \(b\).
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.208 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Baire {

	/**
	 * Received two strings representing two words and calculates the Baire metric.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Baire metric.
	 */
	public static double distance (String str1, String str2){
		return distance(Transformations.convertStringToIntArray(str1),Transformations.convertStringToIntArray(str2));
	}
	
	/**
	 * Received two integer vectors representing two words and calculates the Baire metric.
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The Baire metric.
	 */
	public static double distance(int[] str1, int[] str2){
		return (double)1/(1 + CommonStats.LCP(str1, str2));
	}
	
}
