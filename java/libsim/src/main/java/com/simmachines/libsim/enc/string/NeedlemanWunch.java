package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Needleman-Wunch distance]
 * <p>
 * :: The Needleman–Wunsch algorithm performs a global alignment on two sequences.
 * <p>
 * [Brief Description]
 * <p>
 * It is commonly used in bioinformatics to align protein or nucleotide sequences.
 * The Needleman–Wunsch is an example of dynamic programming, and was the first application
 * of dynamic programming to biological sequence comparison.
 * <p>
 * [Definition]
 * <p>
 
 
 The NeedlemanWunch distance between two strings \(a,b\) is given by:
 <p>
 \( d_{NW}=min\{d_{wH}(x^*,y^*)\} \)
 
 
Where \(x^∗,y^∗\) are strings of length \(k\), \(k ≥ max{m, n}\), over the alphabet
\(A^∗ = A ∪ {∗}\), so that, after deleting all new characters \(∗\), strings \(x^∗\)
and \(y^∗\) shrink to \(x\) and \(y\), respectively. Here \(d_{wH}(x^∗, y^∗)\) is the weighted
Hamming metric between \(x^*\) and \(y^*\) with weight \(d(x^∗_i, y^*_i) = q\) if one of 
\(x^∗_i, y^*_i\) is \(∗\), and \(d(x^∗_i, y^*_i) = d(i, j)\),otherwise.

 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.207 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Needleman%E2%80%93Wunsch_algorithm">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class NeedlemanWunch {

	/**
	 * SimMetrics NeedlemanWunch object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.NeedlemanWunch
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.NeedlemanWunch needlemanWunch = new uk.ac.shef.wit.simmetrics.similaritymetrics.NeedlemanWunch(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Needleman-Wunch distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Needleman-Wunch distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return needlemanWunch.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Needleman-Wunch distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Needleman-Wunch distance.
	 */
	public static double distance(String str1, String str2){
		return needlemanWunch.getSimilarity(str1, str2);
	}
	
}
