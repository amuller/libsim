package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.PenroseShape;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Penrose shape distance]
 * <p>
 * :: The Penrose shape distance is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.PenroseShape;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAPenroseShape extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPenroseShape(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAPenroseShape(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPenroseShape(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPenroseShape(cloneHelper());
	}
	
	/** Calculates the Penrose shape distance between this and other RAPenroseShape object
	 *  @param other RAPenroseShape object
	 *  @return Penrose shape distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return PenroseShape.distance(getVector(),((RAPenroseShape)other).getVector());
	}
	
}