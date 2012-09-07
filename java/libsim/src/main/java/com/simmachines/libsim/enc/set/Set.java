package com.simmachines.libsim.enc.set;

import com.diapai.ramiel.Storable;

/**
 * The sets in the distance functions will be represented by this class.
 *
 */

public interface Set extends Storable {
	
	/**
	 * Calculates the intersection between this and other set.
	 * @param s1 set received to operate along with this.
	 * @return a set of all objects that are members of both this and s1.
	 */
	
	public Set intersect(Set s1);

	/**
	 * Calculates the union between this and other set.
	 * @param s1 set received to operate along with this.
	 * @return A set of all objects that are a member of this, or s1, or both.
	 */
	
	public Set union(Set s1);
	
	
	/**
	 * Calculates the difference between this and other set.
	 * @param s1 set that will be subtracted from this.
	 * @return A set of all members of this that are not members of s1.
	 */	
	public Set difference(Set s1);
	
	/**
	 * Deep copy of the set.  
	 * @return A new, deep copied set.
	 */
	public Set deepCopy();
	
	
	/**
	 * Size of the set (count of all the set's elements).
	 * @return The size of the set.
	 */
	public int size();
	
	
	@Override
	public boolean equals(Object other);
	
	
	@Override
	public int hashCode();
	
}
