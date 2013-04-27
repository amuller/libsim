package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.ChapmanOrderedNameCompoundSimilarity;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Chapman-Ordered-Name-Compound similarity]
 * <p>
 * @see com.simmachines.libsim.enc.string.ChapmanOrderedNameCompoundSimilarity
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAChapmanOrderedNameCompoundSimilarity extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAChapmanOrderedNameCompoundSimilarity(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAChapmanOrderedNameCompoundSimilarity(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAChapmanOrderedNameCompoundSimilarity(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAChapmanOrderedNameCompoundSimilarity(cloneHelper());
	}
	
	/** Calculates the Chapman-Ordered-Name-Compound similarity between this and other RAChapmanOrderedNameCompoundSimilarity object
	 *  @param other RAChapmanOrderedNameCompoundSimilarity object
	 *  @return Chapman-Ordered-Name-Compound similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return ChapmanOrderedNameCompoundSimilarity.distance(getVector(),((RAChapmanOrderedNameCompoundSimilarity)other).getVector());
	}
}