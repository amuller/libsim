package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.binary.BraunBlanquet;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Braun-Blanquet distance]
 * <p>
 * :: The Braun-Blanquet distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.binary.BraunBlanquet
 * @author Jose Daniel Salazar-Vargas
 */

public class RABraunBlanquet extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABraunBlanquet(){
			
	}
	
	/**BraunBlanquet
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABraunBlanquet(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABraunBlanquet(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABraunBlanquet(cloneHelper());
	}
	
	/** Calculates the Braun-Blanquet distance between this and other RABraunBlanquet object
	 *  @param other RABraunBlanquet object
	 *  @return Braun-Blanquet distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return BraunBlanquet.distance(getVector(),((RABraunBlanquet)other).getVector());
	}

}