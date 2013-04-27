package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Hamann;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Hamann distance]
 * <p>
 * :: The Hamann distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Hamann
 * @author Jose Daniel Salazar-Vargas
 */


public class RAHamann extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAHamann(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAHamann(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAHamann(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAHamann(cloneHelper());
	}
	
	/** Calculates the Hamann distance between this and other RAHamann object
	 *  @param other RAHamann object
	 *  @return Hamann distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Hamann.distance(getVector(),((RAHamann)other).getVector());
	}

}