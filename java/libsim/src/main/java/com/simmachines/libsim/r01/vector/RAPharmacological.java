package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Pharmacological;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Pharmacological distance]
 * <p>
 * :: The pharmological is a distance for protein data between two kinases represented by their affinity vectors.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Pharmacological;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAPharmacological extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPharmacological(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAPharmacological(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPharmacological(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPharmacological(cloneHelper());
	}
	
	/** Calculates the Pharmacological distance between this and other RAPharmacological object
	 *  @param other RAPharmacological object
	 *  @return Pharmacological distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Pharmacological.distance(getVector(),((RAPharmacological)other).getVector());
	}

}
