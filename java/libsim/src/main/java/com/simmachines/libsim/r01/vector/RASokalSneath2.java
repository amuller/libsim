package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.SokalSneath2;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Sokal-Sneath 2 distance]
 * <p>
 * :: The Sokal-Sneath 2 distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.SokalSneath2
 * @author Jose Daniel Salazar-Vargas
 */


public class RASokalSneath2 extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASokalSneath2(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASokalSneath2(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASokalSneath2(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASokalSneath2(cloneHelper());
	}
	
	/** Calculates the Sokal-Sneath 2 distance between this and other RASokalSneath2 object
	 *  @param other RASokalSneath2 object
	 *  @return Sokal-Sneath 2 distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SokalSneath2.distance(getVector(),((RASokalSneath2)other).getVector());
	}

}