package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.PenroseSize;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Penrose size distance]
 * <p>
 * :: The Penrose size distance is a distance in data analisis on \( \mathbb{R}^n \), it is proportional to the Manhattan metric. 
 * <p>
 * @see com.simmachines.libsim.enc.vector.PenroseSize
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAPenroseSize extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPenroseSize(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAPenroseSize(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPenroseSize(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPenroseSize(cloneHelper());
	}
	
	/** Calculates the Penrose size distance between this and other RAPenroseSize object
	 *  @param other RAPenroseSize object
	 *  @return Penrose size distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return PenroseSize.distance(getVector(),((RAPenroseSize)other).getVector());
	}
	
}