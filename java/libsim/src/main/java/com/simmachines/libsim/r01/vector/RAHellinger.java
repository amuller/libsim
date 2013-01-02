package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Hellinger;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Hellinger distance]
 * <p>
 * :: The Hellinger distance is a distance in data analisis on \( \mathbb{R}^n_+ \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Hellinger;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAHellinger extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAHellinger(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAHellinger(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAHellinger(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAHellinger(cloneHelper());
	}
	
	/** Calculates the Hellinger distance between this and other RAHellinger object
	 *  @param other RAHellinger object
	 *  @return Hellinger distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Hellinger.distance(getVector(),((RAHellinger)other).getVector());
	}
	
}