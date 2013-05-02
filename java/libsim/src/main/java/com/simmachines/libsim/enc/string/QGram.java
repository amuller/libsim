package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [QGram distance]
 * <p>
 * :: The q-gram is a similarity between strings using the q-gram function. 
 * <p>
 * [Brief Description]
 * <p>
 * The q-gram function \(q(x)\) is the size of multiset of all q-grams (sub-strings of length q) occurring in x,
 * this is, for example: \(x="Nelson"\), for \(q=2, \Rightarrow q(x)=5\), being q the length of the substrings to find;
 * in this case the q-grams (substrings) occurring in x are: \(\{"Ne","el","ls","so","on"\}\), 5 in total.
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


public class QGram {
	
	/**
	 * Calculates the amount of q-grams(substrings) of length q that can be obtained from the given string.
	 * @param q length of the q-gram (substring).
	 * @param str string to operate.
	 * @return the amount of q-grams(substrings) of length q that can be obtained from the given string.
	 */
	public static int qGramCount(int q, int str[]){
		if(q==1){
			return str.length;
		}
		if(q==str.length){
			return 1;
		}
		return str.length+1-q;
	}
	
	
	/**
	 * Calculates the absolute value of subtracting the str2 q-gram amount from the str1 q-gram amount.
	 * @param q length of the q-gram (substring).
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return the absolute value of subtracting the str2 q-gram amount from the str1 q-gram amount.
	 */
	public static int qGramCount(int q, int str1[], int str2[]){
		return Math.abs(qGramCount(q,str1)-qGramCount(q,str2));
	}
	

	/**
	 * Received two strings representing two words and calculates the q-gram similarity.
	 * @param q length of the q-gram (substring).
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The q-gram similarity.
	 */
	public static double distance(int q, String str1,String str2){
		return distance(q, Transformations.convertStringToIntArray(str1),Transformations.convertStringToIntArray(str2));
	}
	
	
	/**
	 * Received two integer vectors representing two words and calculates the q-gram similarity.
	 * @param q length of the q-gram (substring).
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The q-gram similarity.
	 */
	public static double distance(int q, int str1[],int str2[]){
		return (double)(2*qGramCount(q,str1,str2))/(qGramCount(q,str1)+qGramCount(q,str2));
	}
	
}
