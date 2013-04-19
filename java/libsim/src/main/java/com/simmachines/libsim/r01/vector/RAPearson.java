package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Pearson;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Pearson distance]
 * <p>
 * :: The Pearson distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Pearson;
 * @author Jose Daniel Salazar-Vargas
 */

public class RAPearson extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPearson(){
			
	}
	
	/**Pearson
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAPearson(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPearson(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPearson(cloneHelper());
	}
	
	/** Calculates the Pearson distance between this and other RAPearson object
	 *  @param other RAPearson object
	 *  @return Pearson distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Pearson.distance(getVector(),((RAPearson)other).getVector());
	}

}