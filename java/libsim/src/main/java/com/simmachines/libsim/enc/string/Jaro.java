package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Jaro distance]
 * <p>
 * :: The Jaro Similarity is a distance between two strings used in Record Linkage.
 * <p>
 * [Brief Description]
 * <p>
 * Given strings \(a=a_1\dots a_m\) and \(b=b_1\dots b_n\), call a character \(a_i\) common with \(b\) if
 * \( a_i=b_i \), where \(|i-j|\leq\frac{min\{m,n\}}{2}\). Let \(a'=a'_1\dots a'_{m'}\) be all the characters
 * of \(a\) which are common with \(b\) (in the same order as they appear in \(a\)), and let \(b'=b'_1\dots b'_{n'}\)
 * be the analogous string for \(b\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Jaro distance between two strings \(a,b\) is given by:
 <p>
 \( Jaro(a,b)=\frac{1}{3}(\frac{m'}{m}+\frac{n'}{n}+\frac{|1\leq i\leq min\{m',n'\}:a'_i=b'_i|}{min\{m',n'\}}) \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.206 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Jaro {
	
	/**
	 * SimMetrics Jaro object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.Jaro
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.Jaro jaro = new uk.ac.shef.wit.simmetrics.similaritymetrics.Jaro(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Jaro distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Jaro distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return jaro.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Jaro distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Jaro distance.
	 */
	public static double distance(String str1, String str2){
		return jaro.getSimilarity(str1, str2);
	}
	 
}
