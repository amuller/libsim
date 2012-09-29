package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;

/**
 * [HistogramIntersection distance]
 * <p>
 * :: The histogram intersection quasi-distance is an image distance between two color histograms.
 * <p>
 * [Definition]
 * <p>
 
 
 The HistogramIntersection distance between two vectors \(a,b\) is given by:
 <p>
 \( d = 1 - \frac{\sum_{i=1}^n min\{ a_i,b_i\}}{\sum_{i=1}^n a_i} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 21.1 :: Image distances :: P.353 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class HistogramIntersection {

	/**
	 * Received two integer vectors and calculates the HistogramIntersection distance.
	 * @param h1 histogram number 1.
	 * @param h2 histogram number 2.
	 * @return The HistogramIntersection distance.
	 */
	
	public static double distance(int[] h1,int[] h2){
		double sumNum = 0;
		double sumDenom = 0;
		for(int i=0;i<h1.length;i++){
			sumNum += CommonStats.min(h1[i], h2[i]);
			sumDenom += h1[i];
		}
		return 1 - (((double)sumNum)/sumDenom);
	}
	
}
