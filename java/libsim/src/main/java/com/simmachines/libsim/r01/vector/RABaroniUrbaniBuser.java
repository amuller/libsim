package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.BaroniUrbaniBuser;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [BaroniUrbaniBuser distance]
 * <p>
 * :: The Baroni-Urbani-Buser is a similarity for numerical data on \( \mathbb{R}^n \).
 * <p>
 * @see com.simmachines.libsim.enc.vector.BaroniUrbaniBuser;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RABaroniUrbaniBuser extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABaroniUrbaniBuser(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABaroniUrbaniBuser(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABaroniUrbaniBuser(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABaroniUrbaniBuser(cloneHelper());
	}
	
	/** Calculates the BaroniUrbaniBuser distance between this and other RABaroniUrbaniBuser object
	 *  @param other RABaroniUrbaniBuser object
	 *  @return BaroniUrbaniBuser distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return BaroniUrbaniBuser.distance(getVector(),((RABaroniUrbaniBuser)other).getVector());
	}

}
