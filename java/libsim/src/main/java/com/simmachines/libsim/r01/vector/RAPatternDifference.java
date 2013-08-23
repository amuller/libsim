package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.binary.PatternDifference;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Pattern-difference distance]
 * <p>
 * :: The Pattern-difference distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.binary.PatternDifference
 * @author Jose Daniel Salazar-Vargas
 */

public class RAPatternDifference extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPatternDifference(){
			
	}
	
	/**PatternDifference
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAPatternDifference(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPatternDifference(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPatternDifference(cloneHelper());
	}
	
	/** Calculates the Pattern-difference distance between this and other RAPatternDifference object
	 *  @param other RAPatternDifference object
	 *  @return Pattern-difference distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return PatternDifference.distance(getVector(),((RAPatternDifference)other).getVector());
	}

}