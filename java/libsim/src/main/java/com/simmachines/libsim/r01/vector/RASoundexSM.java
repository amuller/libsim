package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.SoundexSM;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Soundex distance]
 * <p>
 * :: Soundex is a phonetic algorithm for indexing names by sound, as pronounced in English.
 * <p>
 * @see com.simmachines.libsim.enc.string.SoundexSM;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RASoundexSM extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASoundexSM(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASoundexSM(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASoundexSM(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASoundexSM(cloneHelper());
	}
	
	/** Calculates the Soundex distance between this and other RASoundexSM object
	 *  @param other RASoundexSM object
	 *  @return Soundex distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SoundexSM.distance(getVector(),((RASoundexSM)other).getVector());
	}
}
