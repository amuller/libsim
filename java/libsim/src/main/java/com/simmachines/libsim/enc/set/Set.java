package com.simmachines.libsim.enc.set;

import java.util.HashSet;

/**
 * The sets in the distance functions will be represented by this class.
 *
 */

public interface Set {
	
	/**
	 * Calculates the intersection between two sets.
	 * @param c1 set number 1.
	 * @param c2 set number 2.
	 * @return a set of all objects that are members of both A and B.
	 */
	
	public HashSet<Double> intersect(HashSet<Double> c1,HashSet<Double> c2);
	
	
	/**
	 * Calculates the union between two sets.
	 * @param c1 set number 1.
	 * @param c2 set number 2.
	 * @return a set of all objects that are a member of c1, or c2, or both.
	 */
	
	public HashSet<Double> union(HashSet<Double> c1,HashSet<Double> c2);
	
	
	/**
	 * Calculates the difference between two sets.
	 * @param c1 set number 1.
	 * @param c2 set number 2.
	 * @return a set of all members of c1 that are not members of c2.
	 */
	
	public HashSet<Double> difference(HashSet<Double> c1,HashSet<Double> c2);
}
