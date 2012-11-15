package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Smith-Waterman distance]
 * <p>
 * :: The Smith-Waterman distance is a measure between two strings applying the Smith-Waterman algorithm.
 * <p>
 * [Brief Description]
 * <p>
 * The Smith–Waterman algorithm is a well-known algorithm for performing local sequence alignment; 
 * that is, for determining similar regions between two nucleotide or protein sequences. 
 * Instead of looking at the total sequence, the Smith–Waterman algorithm compares segments 
 * of all possible lengths and optimizes the similarity measure.
 * <p>
 * [Definition]
 * <p>
 
 
 The Smith-Waterman algorithm uses a matrix \(H\) that is built as follows:
 <p>
 \( H(i,0)=0, 0\leq i\leq m \)
 \( H(0,j)=0, 0\leq j\leq n \)
 
 if \(a_i=b_i\) then \(w(a_i,b_i)=w(match)\) or if \(a_i \neq b_i\) then \(w(a_i,b_i)=w(mismatch)\)
 
 \(
  H(i,j) = max\left\{ 
  \begin{array}{l l}
    0 & \quad \\
    H(i-1,j-1)+w(a_i,b_i) & \quad \text{Match/Mismatch}\\
    H(i-1,j)+w(a_i,-) & \quad \text{Deletion}\\
     H(i,j-1)+w(-,b_i) & \quad \text{Insertion}\\
  \end{array} \right\},1\leq i\leq m,1\leq j\leq n
\)

Where:

\(\cdot\) \(a,b=\) strings over the Alphabet \(\sum\)
\(\cdot\) \(m=length(a)\)
\(\cdot\) \(n=length(b)\)
\(\cdot\) \(H(i,j)\) – is the maximum Similarity-Score between a suffix of \(a[1\dots i]\) and a suffix of \(b[1\dots j]\)
\(\cdot\) \(w(c,d),\) \(c,d \in \sum \cup \{'-'\}\), \('-'\) is the gap-scoring scheme 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.208 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Smith%E2%80%93Waterman_algorithm">Wikipedia Article</a>
 * <p>
 * @see <a href="http://www.gen.tcd.ie/molevol/nwswat.html">Additional Information</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class SmithWaterman {

	/**
	 * SimMetrics SmithWaterman object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWaterman;
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWaterman smithWaterman = new uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWaterman(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Smith-Waterman distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Smith-Waterman distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return smithWaterman.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Smith-Waterman distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Smith-Waterman distance.
	 */
	public static double distance(String str1, String str2){
		return smithWaterman.getSimilarity(str1, str2);
	}
	
}
