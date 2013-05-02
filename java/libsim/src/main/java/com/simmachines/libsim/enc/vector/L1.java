package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * [L1 distance]
 * <p>
 * :: The L1 distance is a metric where the distance between two points is the sum of the absolute differences of their coordinates. 
 * <p>
 * [Brief Description]
 * <p>
 * The L1 distance (also known as Taxicab distance, city block distance, Manhattan distance), is a special case of the LP distance, with \(p=1\).
 * <p>
 * [Definition]
 * <p>
 
 
 The L1 distance between two vectors \(a,b\) is given by: 
  <p>
 \( l_1(a,b)=\sum{|a_i-b_i|} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 19.2 :: Digital metrics :: P.333 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Taxicab_geometry">Wikipedia Article</a>
 * 
 * @author  Arnoldo Jose Muller-Molina
 * 
 */
public class L1 {
	
	/**
	 * Receives two double vectors and calculates the euclidean (L1) distance.
	 * v1 and v2 must have the same size. 
	 * @param v1 vector number 1
	 * @param v2 vector number 2
	 * @return The euclidean distance. 
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.assertEqualLength(v1, v2);
		double res = 0;
		int i = 0;
		while(i < v1.length){
			double t = CommonStats.abs(v1[i] - v2[i]);
			res += t;
			i++;
		}
		Asserts.assertDistance(res);
		return res;
	}

}
