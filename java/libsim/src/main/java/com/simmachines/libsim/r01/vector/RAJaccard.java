package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Jaccard;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Jaccard similarity]
 * <p>
 * :: The Jaccard similarity is a statistic used for comparing the similarity and diversity of two samples.
 * <p>
 * @see com.simmachines.libsim.enc.string.Jaccard
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAJaccard extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAJaccard(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAJaccard(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAJaccard(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAJaccard(cloneHelper());
	}
	
	/** Calculates the Jaccard similarity between this and other RAJaccard object
	 *  @param other RAJaccard object
	 *  @return Jaccard similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Jaccard.distance(getVector(),((RAJaccard)other).getVector());
	}
}
