package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Dispersion;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Dispersion distance]
 * <p>
 * :: The Dispersion distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Dispersion;
 * @author Jose Daniel Salazar-Vargas
 */

public class RADispersion extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RADispersion(){
			
	}
	
	/**Dispersion
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RADispersion(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RADispersion(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RADispersion(cloneHelper());
	}
	
	/** Calculates the Dispersion distance between this and other RADispersion object
	 *  @param other RADispersion object
	 *  @return Dispersion distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Dispersion.distance(getVector(),((RADispersion)other).getVector());
	}

}