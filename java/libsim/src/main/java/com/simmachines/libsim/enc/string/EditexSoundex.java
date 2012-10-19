package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.Transformations;



/**
 * [EditexSoundex distance]
 * <p>
 * :: The Editex distance between two words x and y is a cost-based editing metric, is the minimal cost of transforming x into y by substitution, deletion and insertion of letters.
 * The letter classification into groups is according the Soundex method, in which each group have a code depending of the letters  contained, the codes are:
 * 0 to a, e, h, i, o, u, w, y;
 * 1 to b, p, f, v; 
 * 2 to c, g, j, k, q, s, x, z; 
 * 3 to d, t; 
 * 4 to l;
 * 5 to m, n;
 * 6 to r.

 * <p>
 * [Definition]
 * <p>
 
 
 The EditexSoundex distance between two strings \(a,b\) is given by:
 <p>
 The minimal cost of transforming x into y by substitution, deletion and insertion of letters, where the costs are:
 $->$ 1 for insertion and deletion.
 And for substitutions the costs are:
 $->$ 0 if both letters are the same.
 $->$ 1 if both letters are in the same group.
 $->$ 2 otherwise.
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 28.3 :: Distances in Perception, Cognition and Language :: P.528 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class EditexSoundex {	
	
	
	
	public static EditexSoundexCostCalculator costCalc = new EditexSoundexCostCalculator();

	
	/**
	 * Receives two strings representing two words and calculates the EditexSoundex distance.
	 * @param str1 string number 1.
	 * @param str2 string number 2.
	 * @return The EditexSoundex distance, the minimal cost of transforming str1 into str2 by substitution, 
	 * 			deletion and insertion of letters.
	 */
	public static int distance(String str1,String str2){
		return distance(Transformations.convertStringToIntArray(str1),Transformations.convertStringToIntArray(str2));
	}
	
	
	/**
	 * Receives two integer vectors representing two words and calculates the EditexSoundex distance.
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The EditexSoundex distance, the minimal cost of transforming str1 into str2 by substitution, 
	 * 			deletion and insertion of letters.
	 */
	public static int distance(int str1[],int str2[]){
		return Levenshtein.distance(str1, str2, costCalc);
	}
	
}
