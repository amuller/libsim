package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.binary.YuleQ;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Yule-Q distance]
 * <p>
 * :: The Yule-Q distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.binary.YuleQ
 * @author Jose Daniel Salazar-Vargas
 */

public class RAYuleQ extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAYuleQ(){
			
	}
	
	/**YuleQ
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAYuleQ(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAYuleQ(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAYuleQ(cloneHelper());
	}
	
	/** Calculates the Yule-Q distance between this and other RAYuleQ object
	 *  @param other RAYuleQ object
	 *  @return Yule-Q distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return YuleQ.distance(getVector(),((RAYuleQ)other).getVector());
	}

}
