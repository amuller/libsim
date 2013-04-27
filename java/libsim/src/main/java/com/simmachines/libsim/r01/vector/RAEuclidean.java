package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Euclidean;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Euclidean distance]
 * <p>
 * ::The Euclidean distance is the "ordinary" distance between two points, and is given by the Pythagorean formula.
 * <p>
 * @see com.simmachines.libsim.enc.string.Euclidean
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RAEuclidean extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAEuclidean(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAEuclidean(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAEuclidean(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAEuclidean(cloneHelper());
	}
	
	/** Calculates the Euclidean distance between this and other RAEuclidean object
	 *  @param other RAEuclidean object
	 *  @return Euclidean distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Euclidean.distance(getVector(),((RAEuclidean)other).getVector());
	}
}
