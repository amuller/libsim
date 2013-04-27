package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [QGram distance]
 * <p>
 * :: The q-gram is a similarity between strings using the q-gram function. 
 * <p>
 * [Brief Description]
 * <p>
 * The q-gram function $q(x)$ is the size of multiset of all q-grams (sub-strings of length q) occurring in x,
 * this is, for example: $x="Nelson"$, for $q=2, \Rightarrow q(x)=5$, being q the length of the substrings to find;
 * in this case the q-grams (substrings) occurring in x are: $\{"Ne","el","ls","so","on"\}$, 5 in total.
 * <p>
 * [Definition]
 * <p>
 
 
 The QGram distance between two strings \(a,b\) is given by:
 <p>
 \( d=\frac{2q(a,b)}{q(a)+q(b)} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.206 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/N-gram">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class QGramsSM {

	/**
	 * SimMetrics QGramsDistance object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.QGramsDistance
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.QGramsDistance qGram = new uk.ac.shef.wit.simmetrics.similaritymetrics.QGramsDistance(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the QGrams distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The QGrams distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return qGram.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the QGrams distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The QGrams distance.
	 */
	public static double distance(String str1, String str2){
		return qGram.getSimilarity(str1, str2);
	}
	
}
