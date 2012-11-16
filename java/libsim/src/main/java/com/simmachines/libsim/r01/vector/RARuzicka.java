package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Ruzicka;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Ruzicka distance]
 * <p>
 * :: The Ruzicka distance is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Ruzicka;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RARuzicka extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARuzicka(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARuzicka(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARuzicka(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARuzicka(cloneHelper());
	}
	
	/** Calculates the Ruzicka distance between this and other RARuzicka object
	 *  @param other RARuzicka object
	 *  @return Ruzicka distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Ruzicka.distance(getVector(),((RARuzicka)other).getVector());
	}

}
