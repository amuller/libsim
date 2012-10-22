package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonStats;


/**
 * [Cosine distance]
 * <p>
 * :: The Cosine is a measure of similarity between two vectors by measuring the cosine of the angle between them.
 * <p>
 * [Brief Description]
 * <p>
 * The cosine of the angle between two vectors thus determines whether two vectors are pointing in roughly the same direction.
 * <p>
 * [Definition]
 * <p>
 
 
 The Cosine distance between two vectors \(a,b\) is given by:
 <p>
 \( d=1-\frac{\langle a,b \rangle}{\| a \|_2 \cdot \| b \|_2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.308 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Cosine_similarity">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Cosine {
	
	/**
	 * Receives two double vectors and calculates the Cosine distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Cosine distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		return 1-CommonStats.dotProduct(v1, v2)/(CommonStats.norm(v1)*CommonStats.norm(v2));
	}
	
}
