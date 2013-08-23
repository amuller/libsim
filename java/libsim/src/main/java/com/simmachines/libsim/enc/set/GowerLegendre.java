package com.simmachines.libsim.enc.set;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.common.CommonSet;

/**
 * [Gower-Legendre distance]
 * <p>
 * :: The Gower Legendre is a similarity distance on \( \{0,1\}^n \)
 * <p>
 * Calculates the similarity between two sets.
 * <p>
 * [Definition]
 * <p>
 
 
 The GowerLegendre distance between two sets \(A , B \) is given by:
 <p>
 \( {| \overline{A \triangle B} | }\over {n + (a - 1) | A \triangle B |} \)
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Distances and Similarities in Data Analysis :: P.306 |
 * <p>
 * 
 * @author Arnoldo Jose Muller-Molina Arnoldo J. Muller-Molina
 * 
 */

public class GowerLegendre {
		
		/**
		 * Calculates the GowerLegendre distance
		 * @param s1 The first set object
		 * @param s2 The second set object
		 * @param alpha Alpha parameter employed in the division. (must be larger than 1)
		 * @return  the Gower Legendre similarity value
		 */ 
		public static double distance(double alpha, double universeSize, Set s1, Set s2) {
				Asserts.validate(alpha > 1, "Alpha must be greater than 1");
				Set symmetricDifference = CommonSet.symmetricDifference(s1, s1);
				double top = universeSize - symmetricDifference.size();
				double bottom = universeSize + ((alpha * - 1d) * symmetricDifference.size());				
				return top / bottom;
				
		}
		
}


