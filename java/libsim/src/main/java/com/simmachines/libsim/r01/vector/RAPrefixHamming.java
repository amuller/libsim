package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.PrefixHamming;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Prefix-Hamming metric]
 * <p>
 * :: The Prefix-Hamming is a metric on general strings.
 * <p>
 * @see com.simmachines.libsim.enc.string.PrefixHamming
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAPrefixHamming extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPrefixHamming(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAPrefixHamming(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPrefixHamming(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPrefixHamming(cloneHelper());
	}
	
	/** Calculates the Prefix-Hamming metric between this and other RAPrefixHamming object
	 *  @param other RAPrefixHamming object
	 *  @return Prefix-Hamming metric
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Double.valueOf(PrefixHamming.distance(getVector(),((RAPrefixHamming)other).getVector()));
	}

}