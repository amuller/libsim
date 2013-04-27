package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.tree.LevTed;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [LevTed distance]
 * <p>
 * :: Multi-set distance.
 * <p>
 * @see com.simmachines.libsim.enc.tree.LevTed
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RALevTed extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RALevTed(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RALevTed(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RALevTed(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RALevTed(cloneHelper());
	}
	
	/** Calculates the LevTed distance between this and other RALevTed object
	 *  @param other RALevTed object
	 *  @return LevTed distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return LevTed.distance(getVector(),((RALevTed)other).getVector());
	}

}