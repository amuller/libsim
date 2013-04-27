package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Gleason;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Gleason similarity]
 * <p>
 * :: The Gleason is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Gleason
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAGleason extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAGleason(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAGleason(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAGleason(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAGleason(cloneHelper());
	}
	
	/** Calculates the Gleason similarity between this and other RAGleason object
	 *  @param other RAGleason object
	 *  @return Gleason similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Gleason.distance(getVector(),((RAGleason)other).getVector());
	}

}