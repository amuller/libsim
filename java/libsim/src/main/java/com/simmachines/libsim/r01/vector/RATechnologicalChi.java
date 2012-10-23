package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.TechnologicalChi;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Technological distance]
 * <p>
 * :: The technological distance between two firms is a distance between their patent portfolios.
 * <p>
 * @see com.simmachines.libsim.enc.vector.TechnologicalChi;
 * @author Jose Daniel Salazar-Vargas
 */


public class RATechnologicalChi extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RATechnologicalChi(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RATechnologicalChi(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RATechnologicalChi(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RATechnologicalChi(cloneHelper());
	}
	
	/** Calculates the Technological distance between this and other RATechnologicalChi object
	 *  @param other RATechnologicalChi object
	 *  @return Technological distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return TechnologicalChi.distance(getVector(),((RATechnologicalChi)other).getVector());
	}

}
