package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Block;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Block distance]
 * <p>
 * :: The Block refers to city block distance, which is also known as rectilinear distance, \(L_1\) distance or \( \ell_1\) norm, Manhattan distance, or Manhattan length.
 * <p>
 * @see com.simmachines.libsim.enc.string.Block;
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class RABlock extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABlock(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABlock(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABlock(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABlock(cloneHelper());
	}
	
	/** Calculates the Block distance between this and other RABlock object
	 *  @param other RABlock object
	 *  @return Block distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Block.distance(getVector(),((RABlock)other).getVector());
	}
}