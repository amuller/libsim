package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.ChapmanMeanLength;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Chapman-Mean-Length distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.ChapmanMeanLength;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAChapmanMeanLength extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAChapmanMeanLength(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAChapmanMeanLength(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAChapmanMeanLength(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAChapmanMeanLength(cloneHelper());
	}
	
	/** Calculates the Chapman-Mean-Length distance between this and other RAChapmanMeanLength object
	 *  @param other RAChapmanMeanLength object
	 *  @return Chapman-Mean-Length distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return ChapmanMeanLength.distance(getVector(),((RAChapmanMeanLength)other).getVector());
	}
}