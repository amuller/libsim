package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.MatchingCoefficient;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Matching Coefficient distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.MatchingCoefficient
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAMatchingCoefficient extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMatchingCoefficient(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMatchingCoefficient(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMatchingCoefficient(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMatchingCoefficient(cloneHelper());
	}
	
	/** Calculates the Matching Coefficient distance between this and other RAMatchingCoefficient object
	 *  @param other RAMatchingCoefficient object
	 *  @return Matching Coefficient distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return MatchingCoefficient.distance(getVector(),((RAMatchingCoefficient)other).getVector());
	}
}