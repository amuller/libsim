package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.tree.BDist;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [BDist distance]
 * <p>
 * :: Multi-set distance.
 * <p>
 * @see com.simmachines.libsim.enc.tree.BDist
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RABDist extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABDist(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABDist(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABDist(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABDist(cloneHelper());
	}
	
	/** Calculates the BDist distance between this and other RABDist object
	 *  @param other RABDist object
	 *  @return BDist distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return BDist.distance(getVector(),((RABDist)other).getVector());
	}

}