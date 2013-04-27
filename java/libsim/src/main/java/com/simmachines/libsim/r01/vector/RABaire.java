package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Baire;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Baire metric]
 * <p>
 * :: The Baire metric is an ultrametric between finite or infinite strings.
 * <p>
 * @see com.simmachines.libsim.enc.string.Baire
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RABaire extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABaire(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABaire(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABaire(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABaire(cloneHelper());
	}
	
	/** Calculates the Baire metric between this and other RABaire object
	 *  @param other RABaire object
	 *  @return Baire metric
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Baire.distance(getVector(),((RABaire)other).getVector());
	}

}