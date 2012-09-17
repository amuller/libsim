package com.simmachines.libsim.common;

import com.simmachines.libsim.enc.set.Set;

/**
 * Common set operations based on the set interface
 * @author amuller
 *
 */
public class CommonSet {
	
	/**
	 * Calculates the symmetric difference between sets A and B. 
	 * <p>
	 * It is defined as:
	 * <p>
	 * \( A\,\triangle\,B = (A \smallsetminus B) \cup (B \smallsetminus A),\, \)
	 * @param a the first set 
	 * @param b the second set.
	 * @return The symmetric difference between the sets. 
	 * @see <a href="http://en.wikipedia.org/wiki/Symmetric_difference">Wikipedia Article</a>
	 */
	public static Set symmetricDifference(Set a, Set b){
		Set aMinusB = a.difference(b);
		Set bMinusA = b.difference(b);
		return aMinusB.union(bMinusA);
	}

}
