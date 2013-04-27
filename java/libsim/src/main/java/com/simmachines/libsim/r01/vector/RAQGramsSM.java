package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.QGramsSM;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [QGram distance]
 * <p>
 * :: The q-gram is a similarity between strings using the q-gram function. 
 * <p>
 * @see com.simmachines.libsim.enc.string.QGram
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAQGramsSM extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAQGramsSM(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAQGramsSM(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAQGramsSM(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAQGramsSM(cloneHelper());
	}
	
	/** Calculates the QGrams distance between this and other RAQGramsSM object
	 *  @param other RAQGramsSM object
	 *  @return QGrams distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return QGramsSM.distance(getVector(),((RAQGramsSM)other).getVector());
	}
}
