package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Sorensen;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Sorensen distance]
 * <p>
 * :: The Sorensen is a distance on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Sorensen;
 * @author Jose Daniel Salazar-Vargas
 */


public class RASorensen extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASorensen(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASorensen(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASorensen(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASorensen(cloneHelper());
	}
	
	/** Calculates the Sorensen distance between this and other RASorensen object
	 *  @param other RASorensen object
	 *  @return Sorensen distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Sorensen.distance(getVector(),((RASorensen)other).getVector());
	}

}