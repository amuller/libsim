package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.SmithWaterman;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Smith-Waterman distance]
 * <p>
 * :: The Smith-Waterman distance is a measure between two strings applying the Smith-Waterman algorithm.
 * <p>
 * @see com.simmachines.libsim.enc.string.SmithWaterman
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RASmithWaterman extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASmithWaterman(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASmithWaterman(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASmithWaterman(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASmithWaterman(cloneHelper());
	}
	
	/** Calculates the Smith-Waterman distance between this and other RASmithWaterman object
	 *  @param other RASmithWaterman object
	 *  @return Smith-Waterman distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SmithWaterman.distance(getVector(),((RASmithWaterman)other).getVector());
	}
}
