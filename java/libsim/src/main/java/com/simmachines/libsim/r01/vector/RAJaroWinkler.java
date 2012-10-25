package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.JaroWinkler;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Jaro-Winkler distance]
 * <p>
 * :: The Jaro-Winkler distance is a measure of similarity between two strings.
 * <p>
 * @see com.simmachines.libsim.enc.string.JaroWinkler;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAJaroWinkler extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAJaroWinkler(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAJaroWinkler(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAJaroWinkler(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAJaroWinkler(cloneHelper());
	}
	
	/** Calculates the Jaro-Winkler distance between this and other RAJaroWinkler object
	 *  @param other RAJaroWinkler object
	 *  @return Jaro-Winkler distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return JaroWinkler.distance(getVector(),((RAJaroWinkler)other).getVector());
	}

}
