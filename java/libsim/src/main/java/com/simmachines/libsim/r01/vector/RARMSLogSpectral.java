package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.RMSLogSpectral;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [RMSLogSpectral distance]
 * <p>
 * :: The RMS log spectral distance (or root-mean-square distance, mean quadratic distance) is an audio distance between two discrete spectra. 
 * <p>
 * @see com.simmachines.libsim.enc.vector.RMSLogSpectral;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RARMSLogSpectral extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RARMSLogSpectral(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RARMSLogSpectral(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RARMSLogSpectral(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RARMSLogSpectral(cloneHelper());
	}
	
	/** Calculates the RMSLogSpectral distance between this and other RARMSLogSpectral object
	 *  @param other RARMSLogSpectral object
	 *  @return RMSLogSpectral distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return RMSLogSpectral.distance(getVector(),((RARMSLogSpectral)other).getVector());
	}

}
