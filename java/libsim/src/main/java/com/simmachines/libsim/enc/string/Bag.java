package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.CommonStats;
import com.simmachines.libsim.common.Transformations;
import com.simmachines.libsim.enc.set.MultiSetCounter;

/**
 * [Bag distance]
 * <p>
 * :: The Bag distance (or multiset metric, counting filter) is a distance between two strings, it is a (computationally) cheap approximation of the Levenshtein metric.
 * <p>
 * [Brief Description]
 * <p>
 * For any strings \(a\) and  \(b\), \(A\) and \(B\) are the bags of symbols (multisets of characters) in strings \(a\)
 * and \(b\), respectively, and, say, \(|A\setminus B|\) counts the number of elements in the multiset \(A\setminus B\).
 * <p>
 * [Definition]
 * <p>
 
 
 The Bag distance between two strings \(a,b\) represented as multisets \(A,B\) is given by:
 <p>
 \( d=max\{|A \setminus B|,|B \setminus A|\} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.204 |
 * <p>
 * 
 * @author  Jose Daniel Salazar-Vargas
 * 
 */


public class Bag {
	
	
	/**
	 * Received two strings representing two words and calculates the Bag distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Bag distance.
	 */
	public static int distance (String str1, String str2){
		return distance(Transformations.convertStringToIntArray(str1),Transformations.convertStringToIntArray(str2));
	}
		

	/**
	 * Received two integer vectors representing two words and calculates the Bag distance.
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The Bag distance.
	 */
	public static int distance(int str1[], int str2[]){
		MultiSetCounter<Integer> msc1 = Transformations.convertIntArrayToMultiSetCounter(str1);
		MultiSetCounter<Integer> msc2 = Transformations.convertIntArrayToMultiSetCounter(str2);
		return CommonStats.max(msc1.multiSetComplement(msc2).totalSize(),msc2.multiSetComplement(msc1).totalSize());
	}
	
}
