package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Forbes;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Forbes distance]
 * <p>
 * :: The Forbes distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Forbes;
 * @author Jose Daniel Salazar-Vargas
 */

public class RAForbes extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAForbes(){
			
	}
	
	/**Forbes
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAForbes(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAForbes(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAForbes(cloneHelper());
	}
	
	/** Calculates the Forbes distance between this and other RAForbes object
	 *  @param other RAForbes object
	 *  @return Forbes distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Forbes.distance(getVector(),((RAForbes)other).getVector());
	}

}