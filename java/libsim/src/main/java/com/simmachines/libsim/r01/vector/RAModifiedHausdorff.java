package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.ModifiedHausdorff;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [ModifiedHausdorff distance]
 * <p>
 * :: The modified Hausdorff distance is defined as the maximum of point-set distances averaged over two binary images, seen as non-empty finite subsets of a finite metric space.
 * <p>
 * @see com.simmachines.libsim.enc.vector.ModifiedHausdorff
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAModifiedHausdorff extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAModifiedHausdorff(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAModifiedHausdorff(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAModifiedHausdorff(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAModifiedHausdorff(cloneHelper());
	}
	
	/** Calculates the ModifiedHausdorff distance between this and other RAModifiedHausdorff object
	 *  @param other RAModifiedHausdorff object
	 *  @return ModifiedHausdorff distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return ModifiedHausdorff.distance(getVector(),((RAModifiedHausdorff)other).getVector());
	}

}
