package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Anderberg;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Anderberg distance]
 * <p>
 * :: The Anderberg distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Anderberg;
 * @author Jose Daniel Salazar-Vargas
 */

public class RAAnderberg extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAAnderberg(){
			
	}
	
	/**Anderberg
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAAnderberg(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAAnderberg(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAAnderberg(cloneHelper());
	}
	
	/** Calculates the Anderberg distance between this and other RAAnderberg object
	 *  @param other RAAnderberg object
	 *  @return Anderberg distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Anderberg.distance(getVector(),((RAAnderberg)other).getVector());
	}

}