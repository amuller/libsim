package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Orloci;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Orloci distance]
 * <p>
 * :: The Orloci distance (or chord distance) is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Orloci
 * @author Jose Daniel Salazar-Vargas
 */


public class RAOrloci extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAOrloci(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAOrloci(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAOrloci(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAOrloci(cloneHelper());
	}
	
	/** Calculates the Orloci distance between this and other RAOrloci object
	 *  @param other RAOrloci object
	 *  @return Orloci distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Orloci.distance(getVector(),((RAOrloci)other).getVector());
	}

}
