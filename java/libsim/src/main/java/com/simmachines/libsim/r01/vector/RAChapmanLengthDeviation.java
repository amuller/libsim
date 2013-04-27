package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.ChapmanLengthDeviation;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Chapman-Length-Deviation distance]
 * <p>
 * @see com.simmachines.libsim.enc.string.ChapmanLengthDeviation
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAChapmanLengthDeviation extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAChapmanLengthDeviation(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAChapmanLengthDeviation(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAChapmanLengthDeviation(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAChapmanLengthDeviation(cloneHelper());
	}
	
	/** Calculates the Chapman-Length-Deviation distance between this and other RAChapmanLengthDeviation object
	 *  @param other RAChapmanLengthDeviation object
	 *  @return Chapman-Length-Deviation distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return ChapmanLengthDeviation.distance(getVector(),((RAChapmanLengthDeviation)other).getVector());
	}
}