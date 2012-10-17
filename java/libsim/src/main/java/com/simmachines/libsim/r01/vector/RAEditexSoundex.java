package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.EditexSoundex;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [EditexSoundex distance]
 * <p>
 * :: The Editex distance between two words x and y is a cost-based editing metric, is the minimal cost of transforming x into y by substitution, deletion and insertion of letters. 
 * <p>
 * @see com.simmachines.libsim.enc.string.EditexSoundex;;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAEditexSoundex extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAEditexSoundex(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAEditexSoundex(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAEditexSoundex(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAEditexSoundex(cloneHelper());
	}
	
	/** Calculates the EditexSoundex distance between this and other RAEditexSoundex object
	 *  @param other RAEditexSoundex object
	 *  @return EditexSoundex distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Double.valueOf(EditexSoundex.distance(getVector(),((RAEditexSoundex)other).getVector()));
	}

}
