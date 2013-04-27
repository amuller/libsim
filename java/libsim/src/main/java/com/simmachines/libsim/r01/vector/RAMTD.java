package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.tree.MTD;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [MTD distance]
 * <p>
 * :: Multi-set distance.
 * <p>
 * @see com.simmachines.libsim.enc.tree.MTD
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAMTD extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMTD(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMTD(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMTD(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMTD(cloneHelper());
	}
	
	/** Calculates the MTD distance between this and other RAMTD object
	 *  @param other RAMTD object
	 *  @return MTD distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return MTD.distance(getVector(),((RAMTD)other).getVector());
	}

}