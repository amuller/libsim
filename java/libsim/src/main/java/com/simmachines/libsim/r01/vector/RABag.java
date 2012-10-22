package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Bag;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Bag distance]
 * <p>
 * :: The Bag distance (or multiset metric, counting filter) is a distance between two strings, it is a (computationally) cheap approximation of the Levenshtein metric.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Bag;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RABag extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABag(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABag(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABag(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABag(cloneHelper());
	}
	
	/** Calculates the Bag distance between this and other RABag object
	 *  @param other RABag object
	 *  @return Bag distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Double.valueOf(Bag.distance(getVector(),((RABag)other).getVector()));
	}

}
