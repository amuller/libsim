package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Ellenberg;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Ellenberg similarity]
 * <p>
 * :: The Ellenberg is a similarity on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Ellenberg
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAEllenberg extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAEllenberg(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAEllenberg(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAEllenberg(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAEllenberg(cloneHelper());
	}
	
	/** Calculates the Ellenberg similarity between this and other RAEllenberg object
	 *  @param other RAEllenberg object
	 *  @return Ellenberg similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Ellenberg.distance(getVector(),((RAEllenberg)other).getVector());
	}

}