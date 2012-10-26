package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.CosineSM;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Cosine similarity]
 * <p>
 * :: The Cosine is a measure of similarity between two vectors (in this case strings) by measuring the cosine of the angle between them.
 * <p>
 * @see com.simmachines.libsim.enc.string.CosineSM;
 * @author Jose Daniel Salazar-Vargas
 */


public class RACosineSM extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RACosineSM(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RACosineSM(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RACosineSM(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RACosineSM(cloneHelper());
	}
	
	/** Calculates the Cosine similarity between this and other RACosineSM object
	 *  @param other RACosineSM object
	 *  @return Cosine similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return CosineSM.distance(getVector(),((RACosineSM)other).getVector());
	}
}
