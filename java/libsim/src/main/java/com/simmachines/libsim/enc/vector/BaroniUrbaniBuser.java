package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;

/**
 * [BaroniUrbaniBuser distance]
 * <p>
 * :: The Baroni-Urbani-Buser is a similarity for numerical data on \( \mathbb{R}^n \).
 * <p>
 * [Definition]
 * <p>


 The BaroniUrbaniBuser distance between two vectors \(a,b\) is given by:
 <p>
 \( d= \frac{\sum min \{a_i,b_i\}+\sqrt{\sum min \{a_i,b_i\} \sum(max_{1\leq j \leq n} a_j - max \{a_i,b_i\})}}{\sum max \{a_i,b_i\}+\sqrt{\sum min \{a_i,b_i\} \sum(max_{1\leq j \leq n} a_j - max \{a_i,b_i\})}} \)


 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.301 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class BaroniUrbaniBuser {
	
	
	/**
	 * Received two double vectors and calculates the BaroniUrbaniBuser distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The BaroniUrbaniBuser distance.
	 */
	
	
	public static double distance(double[] v1,double[] v2){
		double minSum = 0;
		double maxSum = 0;
		double maxV1 = v1[0];
		double term;
		for(int i=0;i<v1.length;i++){
			maxSum += CommonStats.max(v1[i], v2[i]);
			minSum += CommonStats.min(v1[i], v2[i]);
			if(v1[i]>maxV1){
				maxV1=v1[i];
			}
		}
		term = Math.sqrt(minSum*((v1.length*maxV1)-maxSum));
		return (minSum+term)/(maxSum+term);
	}
	
}
