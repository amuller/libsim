package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Ratio;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Ratio distance]
 * <p>
 * :: The Ratio Similarity (or Kohonen similarity) is a correlation similarity on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Ratio;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RARatio extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARatio(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARatio(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARatio(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARatio(cloneHelper());
	}
	
	/** Calculates the Ratio distance between this and other RARatio object
	 *  @param other RARatio object
	 *  @return Ratio distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Ratio.distance(getVector(),((RARatio)other).getVector());
	}

}
