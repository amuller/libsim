package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Mountford;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Mountford distance]
 * <p>
 * :: The Mountford distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.Mountford;
 * @author Jose Daniel Salazar-Vargas
 */

public class RAMountford extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAMountford(){
			
	}
	
	/**Mountford
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAMountford(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAMountford(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAMountford(cloneHelper());
	}
	
	/** Calculates the Mountford distance between this and other RAMountford object
	 *  @param other RAMountford object
	 *  @return Mountford distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Mountford.distance(getVector(),((RAMountford)other).getVector());
	}

}
