package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Motyka;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Motyka similarity]
 * <p>
 * :: The Motyka is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Motyka;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAMotyka extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMotyka(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMotyka(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMotyka(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMotyka(cloneHelper());
	}
	
	/** Calculates the Motyka similarity between this and other RAMotyka object
	 *  @param other RAMotyka object
	 *  @return Motyka similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Motyka.distance(getVector(),((RAMotyka)other).getVector());
	}

}