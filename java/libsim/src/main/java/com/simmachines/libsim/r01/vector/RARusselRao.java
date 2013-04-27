package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.RusselRao;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Russel-Rao distance]
 * <p>
 * :: The Russel-Rao distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.RusselRao
 * @author Jose Daniel Salazar-Vargas
 */


public class RARusselRao extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARusselRao(){
			
	}
	
	/**Russel-Rao
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARusselRao(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARusselRao(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARusselRao(cloneHelper());
	}
	
	/** Calculates the Russel-Rao distance between this and other RARusselRao object
	 *  @param other RARusselRao object
	 *  @return Russel-Rao distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return RusselRao.distance(getVector(),((RARusselRao)other).getVector());
	}

}