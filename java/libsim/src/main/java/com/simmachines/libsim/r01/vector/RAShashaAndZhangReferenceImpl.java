package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.tree.ShashaAndZhangReferenceImpl;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [ShashaAndZhangReferenceImpl distance]
 * <p>
 * :: Multi-set distance.
 * <p>
 * @see com.simmachines.libsim.enc.tree.ShashaAndZhangReferenceImpl
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAShashaAndZhangReferenceImpl extends AbstractIntVector{
	/** 
	 * Default constructor required by R-01
	 */
	public RAShashaAndZhangReferenceImpl(){
			
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAShashaAndZhangReferenceImpl(int[] obj){
			super(obj);
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAShashaAndZhangReferenceImpl(String line){
			super(line);
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAShashaAndZhangReferenceImpl(cloneHelper());
	}
	
	/** Calculates the ShashaAndZhangReferenceImpl distance between this and other RAShashaAndZhangReferenceImpl object
	 *  @param other RAShashaAndZhangReferenceImpl object
	 *  @return ShashaAndZhangReferenceImpl distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return ShashaAndZhangReferenceImpl.distance(getVector(),((RAShashaAndZhangReferenceImpl)other).getVector());
	}

}