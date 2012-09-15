package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;


/**
 * [Canberra distance]
 * <p>
 * :: The Canberra distance is a numerical measure of the distance between pairs of points in a vector space.
 * <p>
 * [Brief Description]
 * <p>
 * The Canberra distance is a numerical measure of the distance between pairs of points in a vector space. It is mostly used for data scattered around the origin.
 * <p>
 * [Definition]
 * <p>
 
 
 The Canberra distance between two vectors \(a,b\) is given by \( d^{CAD}_{a,b} (|a|,|b|) \) where:
 <p>
 \( d^{CAD}(a,b)=\sum \frac{|a_i-b_i|}{|a_i|+|b_i|} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.300 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Canberra_distance">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Canberra {
	
	/**
	 * Received two double vectors and calculates the Canberra distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Canberra distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		double sum = 0;
		for(int i=0;i<v1.length;i++){
			sum += CommonStats.abs(v1[i]-v2[i])/(CommonStats.abs(v1[i])+CommonStats.abs(v2[i]));
		}
		return sum;
	}

}
