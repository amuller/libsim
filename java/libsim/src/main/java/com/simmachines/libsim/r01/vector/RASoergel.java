package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Soergel;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Soergel distance]
 * <p>
 * :: The Soergel is a distance on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Soergel;
 * @author Jose Daniel Salazar-Vargas
 */


public class RASoergel extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASoergel(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASoergel(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASoergel(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASoergel(cloneHelper());
	}
	
	/** Calculates the Soergel distance between this and other RASoergel object
	 *  @param other RASoergel object
	 *  @return Soergel distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Soergel.distance(getVector(),((RASoergel)other).getVector());
	}

}