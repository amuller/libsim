package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.SmithWatermanGotoh;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Smith-Waterman-Gotoh distance]
 * <p>
 * :: The Smith-Waterman-Gotoh distance is a measure between two strings applying an improved version (Gotoh) of the Smith-Waterman algorithm.
 * <p>
 * @see com.simmachines.libsim.enc.string.SmithWatermanGotoh
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RASmithWatermanGotoh extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASmithWatermanGotoh(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASmithWatermanGotoh(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASmithWatermanGotoh(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASmithWatermanGotoh(cloneHelper());
	}
	
	/** Calculates the Smith-Waterman-Gotoh distance between this and other RASmithWatermanGotoh object
	 *  @param other RASmithWatermanGotoh object
	 *  @return Smith-Waterman-Gotoh distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SmithWatermanGotoh.distance(getVector(),((RASmithWatermanGotoh)other).getVector());
	}
}