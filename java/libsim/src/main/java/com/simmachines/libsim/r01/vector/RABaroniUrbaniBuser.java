package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.BaroniUrbaniBuser;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Baroni-Urbani-Buser distance]
 * <p>
 * :: The Baroni-Urbani-Buser distance is a distance for binary data on \(\{0,1\}^n\).
 * <p>
 * @see com.simmachines.libsim.enc.vector.BaroniUrbaniBuser
 * @author Jose Daniel Salazar-Vargas
 */

public class RABaroniUrbaniBuser extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RABaroniUrbaniBuser(){
			
	}
	
	/**BaroniUrbaniBuser
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RABaroniUrbaniBuser(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RABaroniUrbaniBuser(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RABaroniUrbaniBuser(cloneHelper());
	}
	
	/** Calculates the Baroni-Urbani-Buser distance between this and other RABaroniUrbaniBuser object
	 *  @param other RABaroniUrbaniBuser object
	 *  @return Baroni-Urbani-Buser distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return BaroniUrbaniBuser.distance(getVector(),((RABaroniUrbaniBuser)other).getVector());
	}

}