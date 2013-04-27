package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Kulczynski1;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Kulczynski-1 distance]
 * <p>
 * :: The Kulczynski-1 is a distance on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Kulczynski1
 * @author Jose Daniel Salazar-Vargas
 */


public class RAKulczynski1 extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAKulczynski1(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAKulczynski1(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAKulczynski1(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAKulczynski1(cloneHelper());
	}
	
	/** Calculates the Kulczynski-1 distance between this and other RAKulczynski1 object
	 *  @param other RAKulczynski1 object
	 *  @return Kulczynski-1 distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Kulczynski1.distance(getVector(),((RAKulczynski1)other).getVector());
	}

}