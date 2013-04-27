package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.HistogramIntersection;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [HistogramIntersection distance]
 * <p>
 * :: The histogram intersection quasi-distance is an image distance between two color histograms.
 * <p>
 * @see com.simmachines.libsim.enc.vector.HistogramIntersection
 * @author Jose Daniel Salazar-Vargas
 */ 



public class RAHistogramIntersection extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAHistogramIntersection(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAHistogramIntersection(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAHistogramIntersection(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAHistogramIntersection(cloneHelper());
	}
	
	/** Calculates the HistogramIntersection distance between this and other RAHistogramIntersection object
	 *  @param other RAHistogramIntersection object
	 *  @return HistogramIntersection distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return HistogramIntersection.distance(getVector(),((RAHistogramIntersection)other).getVector());
	}

}
