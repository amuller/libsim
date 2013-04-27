package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.ChapmanMatchingSoundex;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Chapman-Matching-Soundex distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.ChapmanMatchingSoundex
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAChapmanMatchingSoundex extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAChapmanMatchingSoundex(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAChapmanMatchingSoundex(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAChapmanMatchingSoundex(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAChapmanMatchingSoundex(cloneHelper());
	}
	
	/** Calculates the Chapman-Matching-Soundex distance between this and other RAChapmanMatchingSoundex object
	 *  @param other RAChapmanMatchingSoundex object
	 *  @return Chapman-Matching-Soundex distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return ChapmanMatchingSoundex.distance(getVector(),((RAChapmanMatchingSoundex)other).getVector());
	}
}
