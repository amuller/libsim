package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Faith;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Faith distance]
 * <p>
 * :: The Faith distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Faith;
 * @author Jose Daniel Salazar-Vargas
 */

public class RAFaith extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAFaith(){
			
	}
	
	/**Faith
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAFaith(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAFaith(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAFaith(cloneHelper());
	}
	
	/** Calculates the Faith distance between this and other RAFaith object
	 *  @param other RAFaith object
	 *  @return Faith distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Faith.distance(getVector(),((RAFaith)other).getVector());
	}

}