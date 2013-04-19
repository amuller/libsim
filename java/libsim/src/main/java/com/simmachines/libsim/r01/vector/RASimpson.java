package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Simpson;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Simpson distance]
 * <p>
 * :: The Simpson distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Simpson;
 * @author Jose Daniel Salazar-Vargas
 */

public class RASimpson extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASimpson(){
			
	}
	
	/**Simpson
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASimpson(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASimpson(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASimpson(cloneHelper());
	}
	
	/** Calculates the Simpson distance between this and other RASimpson object
	 *  @param other RASimpson object
	 *  @return Simpson distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Simpson.distance(getVector(),((RASimpson)other).getVector());
	}

}
