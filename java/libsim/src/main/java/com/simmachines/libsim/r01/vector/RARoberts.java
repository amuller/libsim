package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Roberts;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Roberts distance]
 * <p>
 * :: The Roberts distance is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Roberts;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RARoberts extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARoberts(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARoberts(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARoberts(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARoberts(cloneHelper());
	}
	
	/** Calculates the Roberts distance between this and other RARoberts object
	 *  @param other RARoberts object
	 *  @return Roberts distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Roberts.distance(getVector(),((RARoberts)other).getVector());
	}

}