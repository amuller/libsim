package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;

/**
 * Name: L1 distance (euclidean distance)
 * 
 * @author amuller
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
