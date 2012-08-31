package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.L2;
import com.simmachines.libsim.r01.abst.AbstractVector;


/**
 * [L2 distance]
 * <p>
 * :: The Euclidean distance is the "ordinary" distance between two points, and is given by the Pythagorean formula.
 * <p>
 * @see com.simmachines.libsim.enc.vector.L2;
 * @author Arnoldo Jose Muller-Molina
 */

public class RAL2 extends AbstractVector{
	
	/** 
	 * Default constructor required by R-01
	 */
	
	public RAL2(){
		
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAL2(String line){
		super(line);
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy
	 */
	
	public RAL2(double[] obj){
		super(obj);
	}

	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {	
		return new RAL2(cloneHelper());
	}
	

	/**
	 * Calculates the L2 distance between this and other RAL2 object.
	 * @param other RAL2 object
	 * @return L2 distance
	 */
	@Override
	public Double distance(RA<Double> other) {
		return L2.distance(getVector(), ((RAL2)other).getVector());
	}

	

}
