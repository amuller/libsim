package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.MongeElkan;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Monge-Elkan distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.MongeElkan
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAMongeElkan extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMongeElkan(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMongeElkan(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMongeElkan(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMongeElkan(cloneHelper());
	}
	
	/** Calculates the Monge-Elkan distance between this and other RAMongeElkan object
	 *  @param other RAMongeElkan object
	 *  @return Monge-Elkan distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return MongeElkan.distance(getVector(),((RAMongeElkan)other).getVector());
	}
}
