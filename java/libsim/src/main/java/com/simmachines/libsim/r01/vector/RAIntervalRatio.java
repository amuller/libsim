package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.IntervalRatio;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [IntervalRatio distance]
 * <p>
 * :: The interval-ratio in an audio distance between two rhythms (music patterns) represented by two rhythm-difference vectors.
 * <p>
 * @see com.simmachines.libsim.enc.vector.IntervalRatio;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAIntervalRatio extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAIntervalRatio(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAIntervalRatio(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAIntervalRatio(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAIntervalRatio(cloneHelper());
	}
	
	/** Calculates the SpearmanRank distance between this and other RASpearmanRank object
	 *  @param other RASpearmanRank object
	 *  @return SpearmanRank distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return IntervalRatio.distance(getVector(),((RAIntervalRatio)other).getVector());
	}

}