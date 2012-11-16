package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.tree.DMRW;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [DMRW distance]
 * <p>
 * :: Multi-set distance.
 * <p>
 * @see com.simmachines.libsim.enc.tree.DMRW;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RADMRW extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RADMRW(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RADMRW(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RADMRW(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RADMRW(cloneHelper());
	}
	
	/** Calculates the DMRW distance between this and other RADMRW object
	 *  @param other RADMRW object
	 *  @return DMRW distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return DMRW.distance(getVector(),((RADMRW)other).getVector());
	}

}