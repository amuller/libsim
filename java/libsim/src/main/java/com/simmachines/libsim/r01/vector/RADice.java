package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.string.Dice;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Dice similarity]
 * <p>
 * :: The Dice similarity is a statistic used for comparing the similarity of two samples.
 * <p>
 * @see com.simmachines.libsim.enc.string.Dice;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RADice extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RADice(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RADice(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RADice(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RADice(cloneHelper());
	}
	
	/** Calculates the Dice similarity between this and other RADice object
	 *  @param other RADice object
	 *  @return Dice similarity
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Dice.distance(getVector(),((RADice)other).getVector());
	}
}