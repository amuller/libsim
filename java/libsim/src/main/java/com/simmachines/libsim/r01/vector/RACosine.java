package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Cosine;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Cosine distance]
 * <p>
 * :: The Cosine is a measure of similarity between two vectors by measuring the cosine of the angle between them.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Cosine
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RACosine extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RACosine(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RACosine(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RACosine(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RACosine(cloneHelper());
	}
	
	/** Calculates the Cosine distance between this and other RACosine object
	 *  @param other RACosine object
	 *  @return Cosine distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Cosine.distance(getVector(),((RACosine)other).getVector());
	}

}
