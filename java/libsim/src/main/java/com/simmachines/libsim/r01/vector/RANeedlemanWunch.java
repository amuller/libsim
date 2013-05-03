package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.NeedlemanWunch;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Needleman-Wunch distance]
 * <p>
 * :: The Needleman–Wunsch algorithm performs a global alignment on two sequences.
 * <p>
 * @see com.simmachines.libsim.enc.string.NeedlemanWunch
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RANeedlemanWunch extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RANeedlemanWunch(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RANeedlemanWunch(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RANeedlemanWunch(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RANeedlemanWunch(cloneHelper());
	}
	
	/** Calculates the Needleman-Wunch distance between this and other RANeedlemanWunch object
	 *  @param other RANeedlemanWunch object
	 *  @return Needleman-Wunch distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return NeedlemanWunch.distance(getVector(),((RANeedlemanWunch)other).getVector());
	}
}