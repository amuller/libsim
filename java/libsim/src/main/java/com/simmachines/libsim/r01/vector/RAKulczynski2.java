package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Kulczynski2;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Kulczynski-2 similarity]
 * <p>
 * :: The Kulczynski-2 is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Kulczynski2
 * @author Jose Daniel Salazar-Vargas
 */


public class RAKulczynski2 extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAKulczynski2(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAKulczynski2(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAKulczynski2(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAKulczynski2(cloneHelper());
	}
	
	/** Calculates the Kulczynski-2 similarity between this and other RAKulczynski2 object
	 *  @param other RAKulczynski2 object
	 *  @return Kulczynski-2 similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Kulczynski2.distance(getVector(),((RAKulczynski2)other).getVector());
	}

}