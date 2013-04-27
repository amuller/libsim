package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.RogerTanimoto;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Roger-Tanimoto distance]
 * <p>
 * :: The Roger-Tanimoto distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.RogerTanimoto
 * @author Jose Daniel Salazar-Vargas
 */

public class RARogerTanimoto extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARogerTanimoto(){
			
	}
	
	/**RogerTanimoto
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARogerTanimoto(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARogerTanimoto(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARogerTanimoto(cloneHelper());
	}
	
	/** Calculates the Roger-Tanimoto distance between this and other RARogerTanimoto object
	 *  @param other RARogerTanimoto object
	 *  @return Roger-Tanimoto distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return RogerTanimoto.distance(getVector(),((RARogerTanimoto)other).getVector());
	}

}