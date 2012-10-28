package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Overlap;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Overlap coefficient]
 * <p>
 * ::The overlap coefficient is a similarity measure related to the Jaccard coefficient that computes the overlap between two sets
 * <p>
 * @see com.simmachines.libsim.enc.string.Overlap;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAOverlap extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAOverlap(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAOverlap(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAOverlap(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAOverlap(cloneHelper());
	}
	
	/** Calculates the Overlap coefficient between this and other RAOverlap object
	 *  @param other RAOverlap object
	 *  @return Overlap coefficient distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Overlap.distance(getVector(),((RAOverlap)other).getVector());
	}
}