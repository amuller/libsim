package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.MorisitaHorn;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Morisita-Horn similarity]
 * <p>
 * :: The Morisita-Horn similarity is a correlation similarity in data analisis on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.MorisitaHorn;
 * @author Jose Daniel Salazar-Vargas
 */


public class RAMorisitaHorn extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMorisitaHorn(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMorisitaHorn(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMorisitaHorn(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMorisitaHorn(cloneHelper());
	}
	
	/** Calculates the Morisita-Horn similarity between this and other RAMorisitaHorn object
	 *  @param other RAMorisitaHorn object
	 *  @return Morisita-Horn similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return MorisitaHorn.distance(getVector(),((RAMorisitaHorn)other).getVector());
	}

}