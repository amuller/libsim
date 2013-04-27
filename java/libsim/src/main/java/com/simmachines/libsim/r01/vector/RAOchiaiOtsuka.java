package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.OchiaiOtsuka;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Ochiai-Otsuka distance]
 * <p>
 * :: The Ochiai-Otsuka distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.OchiaiOtsuka
 * @author Jose Daniel Salazar-Vargas
 */

public class RAOchiaiOtsuka extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAOchiaiOtsuka(){
			
	}
	
	/**OchiaiOtsuka
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAOchiaiOtsuka(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAOchiaiOtsuka(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAOchiaiOtsuka(cloneHelper());
	}
	
	/** Calculates the Ochiai-Otsuka distance between this and other RAOchiaiOtsuka object
	 *  @param other RAOchiaiOtsuka object
	 *  @return Ochiai-Otsuka distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return OchiaiOtsuka.distance(getVector(),((RAOchiaiOtsuka)other).getVector());
	}

}