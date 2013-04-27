package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.BrayCurtis;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Bray-Curtis similarity]
 * <p>
 * :: The Bray-Curtis is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.BrayCurtis
 * @author Jose Daniel Salazar-Vargas
 */


public class RABrayCurtis extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABrayCurtis(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABrayCurtis(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABrayCurtis(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABrayCurtis(cloneHelper());
	}
	
	/** Calculates the Bray-Curtis similarity between this and other RABrayCurtis object
	 *  @param other RABrayCurtis object
	 *  @return Bray-Curtis similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return BrayCurtis.distance(getVector(),((RABrayCurtis)other).getVector());
	}

}