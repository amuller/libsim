package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.YuleY;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Yule-Y distance]
 * <p>
 * :: The Yule-Y distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.YuleY
 * @author Jose Daniel Salazar-Vargas
 */

public class RAYuleY extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAYuleY(){
			
	}
	
	/**YuleY
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAYuleY(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAYuleY(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAYuleY(cloneHelper());
	}
	
	/** Calculates the Yule-Y distance between this and other RAYuleY object
	 *  @param other RAYuleY object
	 *  @return Yule-Y distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return YuleY.distance(getVector(),((RAYuleY)other).getVector());
	}

}