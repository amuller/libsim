package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.CommonStats;
import com.simmachines.libsim.common.Transformations;

/**
 * [Prefix-Hamming metric]
 * <p>
 * :: The Prefix-Hamming is a metric on general strings.
 * <p>
 * [Brief Description]
 * <p>
 * Prefix-Hamming metric is a variation of the Hamming distance.
 * <p>
 * [Definition]
 * <p>
 
 
 The Prefix-Hamming metric between two strings represented as integer arrays \(a,b\) of lengths \(m,n\) respectively is given by:
 <p>
 \( d = (max\{m,n\} - min\{m,n\}) + |\{ 1\leq i \leq min\{m,n\}:a_i \ne b_i \}| \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.207 |
  * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Hamming_distance">Wikipedia Related Article (Hamming Distance)</a>
 * 
 * @author  Jose Daniel Salazar-Vargas
 * 
 */


public class PrefixHamming {

	/**
	 * Received two strings representing two words and calculates the Prefix-Hamming metric.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Prefix-Hamming metric.
	 */
	public static int distance (String str1, String str2){
		return distance(Transformations.convertStringToIntArray(str1),Transformations.convertStringToIntArray(str2));
	}
	
	/**
	 * Received two integer vectors representing two words and calculates the Prefix-Hamming metric.
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The Prefix-Hamming metric.
	 */
	public static int distance(int[] str1, int[] str2){
		int max = CommonStats.max(str1.length, str2.length);
		int min = CommonStats.min(str1.length, str2.length);
		int res = 0;
		for(int i=0;i<min;i++){
			if(str1[i]!=str2[i]){
				res++;
			}
		}
		return (max - min) + Math.abs(res);
	}
	
}
