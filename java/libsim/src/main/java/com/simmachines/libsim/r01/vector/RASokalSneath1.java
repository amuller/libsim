package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.SokalSneath1;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Sokal-Sneath 1 distance]
 * <p>
 * :: The Sokal-Sneath 1 distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.SokalSneath1;
 * @author Jose Daniel Salazar-Vargas
 */


public class RASokalSneath1 extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASokalSneath1(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASokalSneath1(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASokalSneath1(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASokalSneath1(cloneHelper());
	}
	
	/** Calculates the Sokal-Sneath 1 distance between this and other RASokalSneath1 object
	 *  @param other RASokalSneath1 object
	 *  @return Sokal-Sneath 1 distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SokalSneath1.distance(getVector(),((RASokalSneath1)other).getVector());
	}

}