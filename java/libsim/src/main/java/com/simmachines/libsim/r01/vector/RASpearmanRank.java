package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.SpearmanRank;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [SpearmanRank distance]
 * <p>
 * :: The Spearman rank correlation is a non-parametric measure of statistical dependence between two variables.
 * <p>
 * @see com.simmachines.libsim.enc.vector.SpearmanRank;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RASpearmanRank extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RASpearmanRank(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RASpearmanRank(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RASpearmanRank(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RASpearmanRank(cloneHelper());
	}
	
	/** Calculates the SpearmanRank distance between this and other RASpearmanRank object
	 *  @param other RASpearmanRank object
	 *  @return SpearmanRank distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return SpearmanRank.distance(getVector(),((RASpearmanRank)other).getVector());
	}

}
