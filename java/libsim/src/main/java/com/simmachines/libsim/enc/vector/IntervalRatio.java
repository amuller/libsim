package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;


/**
 * [IntervalRatio distance]
 * <p>
 * :: The interval-ratio in an audio distance between two rhythms (music patterns) represented by two rhythm-difference vectors.
 * <p>
 * [Definition]
 * <p>
 
 
 The IntervalRatio distance between two vectors \(a,b\) is given by:
 <p>
 \( d=1-n+\sum_{i=1}^{n-1}\frac{max\{a_i,b_i\}}{min\{a_i,b_i\}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 21.2 :: Audio distances :: P.369 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class IntervalRatio {

	/**
	 * If \( T=(t_1,t_2,\dots,t_n) \) is a vector of inter-onset time intervals then the rhythm-difference vector is defined as \( X=(x_1,x_2,\dots,x_{n-1}) \) where \( x_i= t_{i+1}/t_i \).
	 * @param t vector of inter-onset time intervals.
	 * @return the rhythm-difference vector.
	 */
	public static double[] rhythmDifferenceVector(int t[]){
		double res[] = new double[t.length-1];
		for(int i=0;i<t.length-1;i++){
			res[i] = (double)t[i+1]/t[i];
		}
		return res;
	}
	
	
	/**
	 * Received two int vectors and calculates the IntervalRatio distance.
	 * @param t1 vector number 1.
	 * @param t2 vector number 2.
	 * @return The IntervalRatio distance.
	 */
	public static double distance(int t1[],int t2[]){
		double res = 0;
		double v1[] = rhythmDifferenceVector(t1);
		double v2[] = rhythmDifferenceVector(t2);
		for(int i=0;i<v1.length;i++){
			res += CommonStats.max(v1[i], v2[i])/CommonStats.min(v1[i], v2[i]);
		}
		return res + 1 - t1.length;
	}
	
}
