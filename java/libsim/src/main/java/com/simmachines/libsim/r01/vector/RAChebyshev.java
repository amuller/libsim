package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Chebyshev;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Chebyshev distance]
 * <p>
 * :: The Chebyshev distance is a metric defined on a vector space between two vectors.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Chebyshev
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAChebyshev extends AbstractVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAChebyshev(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAChebyshev(double[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAChebyshev(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAChebyshev(cloneHelper());
	}
	
	/** Calculates the Chebyshev distance between this and other RAChebyshev object
	 *  @param other RAChebyshev object
	 *  @return Chebyshev distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Chebyshev.distance(getVector(),((RAChebyshev)other).getVector());
	}

}
