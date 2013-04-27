package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.TagLinkToken;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Tag-Link-Token distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.TagLinkToken
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RATagLinkToken extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RATagLinkToken(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RATagLinkToken(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RATagLinkToken(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RATagLinkToken(cloneHelper());
	}
	
	/** Calculates the Tag-Link-Token distance between this and other RATagLinkToken object
	 *  @param other RATagLinkToken object
	 *  @return Tag-Link-Token distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return TagLinkToken.distance(getVector(),((RATagLinkToken)other).getVector());
	}
}