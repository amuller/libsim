package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Jaro;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Jaro distance]
 * <p>
 * :: The Jaro Similarity is a distance between two strings used in Record Linkage.
 * <p>
 * @see com.simmachines.libsim.enc.string.Jaro
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAJaro extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAJaro(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAJaro(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAJaro(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAJaro(cloneHelper());
	}
	
	/** Calculates the Jaro distance between this and other RAJaro object
	 *  @param other RAJaro object
	 *  @return Jaro distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Jaro.distance(getVector(),((RAJaro)other).getVector());
	}

}
