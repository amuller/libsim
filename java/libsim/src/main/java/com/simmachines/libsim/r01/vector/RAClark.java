package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Clark;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Clark distance]
 * <p>
 * :: The Clark distance is a distance in data analisis on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Clark;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAClark extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAClark(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAClark(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAClark(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAClark(cloneHelper());
	}
	
	/** Calculates the Clark distance between this and other RAClark object
	 *  @param other RAClark object
	 *  @return Clark distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Clark.distance(getVector(),((RAClark)other).getVector());
	}
	
}