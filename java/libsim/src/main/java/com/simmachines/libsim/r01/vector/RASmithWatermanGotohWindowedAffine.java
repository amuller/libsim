package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.SmithWatermanGotohWindowedAffine;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Smith-Waterman-Gotoh-Windowed-Affine distance]
 * <p>
 * :: The Smith-Waterman-Gotoh-Windowed-Affine distance is a measure between two strings applying an improved version (Gotoh with affine gaps) of the Smith-Waterman algorithm.
 * <p>
 * @see com.simmachines.libsim.enc.string.SmithWatermanGotohWindowedAffine
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RASmithWatermanGotohWindowedAffine extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASmithWatermanGotohWindowedAffine(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASmithWatermanGotohWindowedAffine(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASmithWatermanGotohWindowedAffine(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASmithWatermanGotohWindowedAffine(cloneHelper());
	}
	
	/** Calculates the Smith-Waterman-Gotoh-Windowed-Affine distance between this and other RASmithWatermanGotohWindowedAffine object
	 *  @param other RASmithWatermanGotohWindowedAffine object
	 *  @return Smith-Waterman-Gotoh-Windowed-Affine distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SmithWatermanGotohWindowedAffine.distance(getVector(),((RASmithWatermanGotohWindowedAffine)other).getVector());
	}
}
