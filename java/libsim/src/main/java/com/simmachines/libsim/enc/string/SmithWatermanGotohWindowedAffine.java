package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;

/**
 * [Smith-Waterman-Gotoh-Windowed-Affine distance]
 * <p>
 * :: The Smith-Waterman-Gotoh-Windowed-Affine distance is a measure between two strings applying an improved version (Gotoh with affine gaps) of the Smith-Waterman algorithm.
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on general strings :: P.208 |
 * <p>
 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotohWindowedAffine
 * @see com.simmachines.libsim.enc.string.SmithWaterman
 * @see <a href="http://en.wikipedia.org/wiki/Smith%E2%80%93Waterman_algorithm">Wikipedia Article</a>
 * @see <a href="http://www.gen.tcd.ie/molevol/nwswat.html">Reference by author</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class SmithWatermanGotohWindowedAffine {

	/**
	 * SimMetrics SmithWatermanGotohWindowedAffine object
	 * @see uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotohWindowedAffine
	 */
	public static uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotohWindowedAffine smithWatermanGotohWindowedAffine = new uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotohWindowedAffine(); 
	
	
	/**
	 * Receives two integer arrays representing two words and calculates the Smith-Waterman-Gotoh-Windowed-Affine distance.
	 * @param str1 integer array number 1.
	 * @param str2 integer array number 2.
	 * @return The Smith-Waterman-Gotoh-Windowed-Affine distance.
	 */
	public static double distance(int[] str1, int[] str2){
		return smithWatermanGotohWindowedAffine.getSimilarity(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
	
	/**
	 * Receives two strings representing two words and calculates the Smith-Waterman-Gotoh-Windowed-Affine distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The Smith-Waterman-Gotoh-Windowed-Affine distance.
	 */
	public static double distance(String str1, String str2){
		return smithWatermanGotohWindowedAffine.getSimilarity(str1, str2);
	}
	
}
