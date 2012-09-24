package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Angular;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Angular distance]
 * <p>
 * :: The angular semi-metric on \( \mathbb{R}^n \) is the angle (measured in radians) between two vectors.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Angular;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAAngular extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAAngular(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAAngular(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAAngular(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAAngular(cloneHelper());
	}
	
	/** Calculates the Angular distance between this and other RAAngular object
	 *  @param other RAAngular object
	 *  @return Angular distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Angular.distance(getVector(),((RAAngular)other).getVector());
	}

}
