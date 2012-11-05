package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.TagLink;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Tag-Link distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.TagLink;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RATagLink extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RATagLink(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RATagLink(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RATagLink(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RATagLink(cloneHelper());
	}
	
	/** Calculates the Tag-Link distance between this and other RATagLink object
	 *  @param other RATagLink object
	 *  @return Tag-Link distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return TagLink.distance(getVector(),((RATagLink)other).getVector());
	}
}