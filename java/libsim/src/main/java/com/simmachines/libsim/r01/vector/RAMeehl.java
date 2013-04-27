package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Meehl;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Meehl distance]
 * <p>
 * :: The Meehl distance is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Meehl
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAMeehl extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMeehl(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMeehl(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMeehl(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMeehl(cloneHelper());
	}
	
	/** Calculates the Meehl distance between this and other RAMeehl object
	 *  @param other RAMeehl object
	 *  @return Meehl distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Meehl.distance(getVector(),((RAMeehl)other).getVector());
	}
	
}