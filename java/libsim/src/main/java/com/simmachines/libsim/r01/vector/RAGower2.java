package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.binary.Gower2;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Gower-2 distance]
 * <p>
 * :: The Gower-2 distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.binary.Gower2
 * @author Jose Daniel Salazar-Vargas
 */

public class RAGower2 extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAGower2(){
			
	}
	
	/**Gower2
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAGower2(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAGower2(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAGower2(cloneHelper());
	}
	
	/** Calculates the Gower-2 distance between this and other RAGower2 object
	 *  @param other RAGower2 object
	 *  @return Gower-2 distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Gower2.distance(getVector(),((RAGower2)other).getVector());
	}

}