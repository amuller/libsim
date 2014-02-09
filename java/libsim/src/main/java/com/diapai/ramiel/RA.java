package com.diapai.ramiel;
/**
 * Main interface used to define objects that hold a similarity criteria.
 * This interface defines a distance function that calculates the similarity between objects
 * @author amuller
 *
 * @param <N> The result value of the distance function (Double, Integer, Float etc).
 */
public interface RA<N extends Comparable<N>> extends Storable{
	
	/**
	 * Compute the distance between two objects
	 * @param other The other object that will be compared
	 * @return The distance between the objects. 
	 */
	public N distance(RA<N> other);
	
	
}
