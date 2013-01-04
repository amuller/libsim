package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Rand;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Rand distance]
 * <p>
 * :: The Rand distance (or Simple Matching similarity) is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Rand;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RARand extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARand(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARand(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARand(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARand(cloneHelper());
	}
	
	/** Calculates the Rand distance between this and other RARand object
	 *  @param other RARand object
	 *  @return Rand distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Rand.distance(getVector(),((RARand)other).getVector());
	}

}