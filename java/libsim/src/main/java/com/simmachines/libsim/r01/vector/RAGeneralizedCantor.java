package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.string.GeneralizedCantor;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Generalized Cantor metric]
 * <p>
 * :: The Generalized Cantor metric is an ultrametric between finite or infinite strings.
 * <p>
 * @see com.simmachines.libsim.enc.string.GeneralizedCantor;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAGeneralizedCantor extends AbstractIntVector{
	
	/**
	 * fixed number from the interval \(0,1\).
	 */

	private double a;
	
	/** 
	 * Default constructor required by R-01
	 */
	public RAGeneralizedCantor(){
		a = 0.5;	
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAGeneralizedCantor(int[] obj, double parameter){
			super(obj);
			a = parameter;
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAGeneralizedCantor(String line){
			super(line);
	}
	
	public double getA(){
		return a;
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAGeneralizedCantor(cloneHelper(),getA());
	}
	
	
	/**
	 * Necessary Override for complete storage
	 */
	
	@Override
	public void store(ByteBuffer buf) throws RAException{		
		super.store(buf);
		buf.putDouble(a);
	}
	
	
	/**
	 * Necessary Override for complete load
	 */
	
	@Override
	public void load(ByteBuffer buf) throws RAException{		
		super.load(buf);
		a = buf.getDouble();
	}
	
	
	
	/** Calculates the Generalized Cantor metric between this and other RAGeneralizedCantor object
	 *  @param other RAGeneralizedCantor object
	 *  @return Generalized Cantor metric
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return GeneralizedCantor.distance(getA(), getVector(),((RAGeneralizedCantor)other).getVector());
	}

}