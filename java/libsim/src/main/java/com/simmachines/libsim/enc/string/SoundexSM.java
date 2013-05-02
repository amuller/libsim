package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Soundex distance]
 * <p>
 * :: Soundex is a phonetic algorithm for indexing names by sound, as pronounced in English.
 * <p>
 * [Brief Description]
 * <p>
 * The goal is for homophones to be encoded to the same representation so that they can be matched despite minor
 *  differences in spelling. The algorithm mainly encodes consonants; a vowel will not be encoded unless it is the first letter.
 * <p>
 * The Soundex letter classification into groups are:
 * <p>
 * 0 to a, e, h, i, o, u, w, y;
 * <p>
 * 1 to b, p, f, v; 
 * <p>
 * 2 to c, g, j, k, q, s, x, z; 
 * <p>
 * 3 to d, t; 
 * <p>
 * 4 to l;
 * <p>
 * 5 to m, n;
 * <p>
 * 6 to r.
 * <p>
 * [Definition]
 * <p>
 
 
 The Soundex distance between two strings \(a,b\) is given by the JaroWinkler distance
 between the two encoded representations of \(a\) and \(b\), \(a'\) and \(b'\) respectively.
 The JaroWinkler between the two encoded representations \(a',b'\) is given by:
 <p>
 \( JW(a',b')=Jaro(a',b')+\frac{LCP(a',b')}{10}(1-Jaro(a',b')) \)
 <p>
 where \(Jaro(a',b')\) is the Jaro similarity, and \(LCP (a',b')\) is the length of the longest common prefix of \(a'\) and \(b'\).
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 28.3 :: Distances in Perception, Cognition and Language :: P.528 |
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex
 * @see com.simmachines.libsim.enc.string.JaroWinkler
 * @see com.simmachines.libsim.enc.string.Jaro
 * @see <a href="http://en.wikipedia.org/wiki/Soundex">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class SoundexSM {

	/**
	 * SimMetrics Soundex object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex soundex = new uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Soundex distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Soundex distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return soundex.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Soundex distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Soundex distance.
	 */
	public static double distance(String str1, String str2){
		return soundex.getSimilarity(str1, str2);
	}
	
}
