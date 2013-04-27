package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.vector.Cultural;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Cultural distance]
 * <p>
 * :: The cultural is an applied social science distance from the cultural dimensions theory, that describes the effects of a society's culture on the values of its members, and how these values relate to behavior, using a structure derived from factor analysis.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Cultural
 * @author  Jose Daniel Salazar-Vargas
 */ 


public class RACultural extends AbstractVector{
	
	
	/**
	 * variance vector
	 */

	private double var[];

	/** 
	 * Default constructor required by R-01
	 */
	public RACultural(){
			var = new double[]{0,0,0,0,0};
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy
	 */ 
	public RACultural(double obj[], double variance[]){
			super(obj);
			var = variance;
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RACultural(String line){
			super(line);
	}
	
	
	public double[] getVariance(){
		return var;
	}
	
	
	/**
	 * Clones the variance vector and returns a new copy of it.
	 * @return a new copy of the variance vector.
	 */
	protected double[] cloneVarianceHelper(){
		double[] newF = new double[this.var.length];
		System.arraycopy(var, 0, newF, 0, var.length);
		return newF;
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RACultural(cloneHelper(),cloneVarianceHelper());
	}
	
	/**
	 * Necessary Override for complete storage
	 */
	
	@Override
	public void store(ByteBuffer buf) throws RAException{		
		super.store(buf);
		buf.putShort((short)var.length);
		int i = 0;
		while(i < var.length){
			buf.putDouble(var[i]);
			i++;
		}
	}
	
	
	/**
	 * Necessary Override for complete load
	 */
	
	@Override
	public void load(ByteBuffer buf) throws RAException{		
		super.load(buf);
		short size = buf.getShort();
		int i = 0;
		var = new double[size];
		while(i < size){
			var[i] = buf.getDouble();
			i++;
		}
	}
	
	
	/** Calculates the Cultural distance between this and other RACultural object
	 *  @param other RACultural object.
	 *  @return Cultural distance.
	 */ 
	
	@Override
			public Double distance(RA<Double> other) {
			return Cultural.distance(getVariance(), getVector(), ((RACultural)other).getVector());
	}
}
