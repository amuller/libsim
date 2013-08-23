package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;


/**
 * [Chebyshev distance]
 * <p>
 * :: The Chebyshev distance is a metric defined on a vector space between two vectors.
 * <p>
 * [Brief Description]
 * <p>
 * Chebyshev distance is a metric defined on a vector space where the distance between two vectors is the greatest of their differences along any coordinate dimension.
 * <p>
 * [Definition]
 * <p>
 
 
 The Chebyshev distance between two vectors \(a,b\) is given by:
 <p>
 \( \| a-b \|_\infty = max\{ |a_1-b_1|,|a_2-b_2|,\cdots,|a_n-b_n| \} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 19.1 :: Metrics on real plane :: P.324 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Chebyshev_distance">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Chebyshev {

	/**
	 * Received two double vectors and calculates the Chebyshev distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Chebyshev distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		double[] res=new double[v1.length];
		for(int i=0;i<v1.length;i++){
			res[i] = Math.abs(v1[i]-v2[i]);
		}
		return CommonStats.max(res);
	}
	
}
