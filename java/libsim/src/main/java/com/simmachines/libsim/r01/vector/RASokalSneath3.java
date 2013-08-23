package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.binary.SokalSneath3;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Sokal-Sneath 3 similarity]
 * <p>
 * :: The Sokal-Sneath 3 similarity is a similarity for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.binary.SokalSneath3
 * @author Jose Daniel Salazar-Vargas
 */


public class RASokalSneath3 extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASokalSneath3(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASokalSneath3(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASokalSneath3(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASokalSneath3(cloneHelper());
	}
	
	/** Calculates the Sokal-Sneath 3 similarity between this and other RASokalSneath3 object
	 *  @param other RASokalSneath3 object
	 *  @return Sokal-Sneath 3 similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SokalSneath3.distance(getVector(),((RASokalSneath3)other).getVector());
	}

}