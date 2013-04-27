package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.KumarHassebrook;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Kumar-Hassebrook distance]
 * <p>
 * :: The Kumar-Hassebrook Similarity is a correlation similarity on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.KumarHassebrook
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAKumarHassebrook extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAKumarHassebrook(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAKumarHassebrook(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAKumarHassebrook(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAKumarHassebrook(cloneHelper());
	}
	
	/** Calculates the Kumar-Hassebrook distance between this and other RAKumarHassebrook object
	 *  @param other RAKumarHassebrook object
	 *  @return Kumar-Hassebrook distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return KumarHassebrook.distance(getVector(),((RAKumarHassebrook)other).getVector());
	}

}