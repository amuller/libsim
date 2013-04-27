package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.LevenshteinSM;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Levenshtein distance]
 * <p>
 * ::Compares the similarity between two strings based on edit operations.
 * <p>
 * @see com.simmachines.libsim.enc.string.LevenshteinSM
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RALevenshteinSM extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RALevenshteinSM(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RALevenshteinSM(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RALevenshteinSM(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RALevenshteinSM(cloneHelper());
	}
	
	/** Calculates the Levenshtein distance between this and other RALevenshteinSM object
	 *  @param other RALevenshteinSM object
	 *  @return Levenshtein distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return LevenshteinSM.distance(getVector(),((RALevenshteinSM)other).getVector());
	}
}
