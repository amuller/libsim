package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Intersection;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Intersection distance]
 * <p>
 * :: The Intersection is a distance on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Intersection
 * @author Jose Daniel Salazar-Vargas
 */


public class RAIntersection extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAIntersection(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAIntersection(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAIntersection(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAIntersection(cloneHelper());
	}
	
	/** Calculates the Intersection distance between this and other RAIntersection object
	 *  @param other RAIntersection object
	 *  @return Intersection distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Intersection.distance(getVector(),((RAIntersection)other).getVector());
	}

}