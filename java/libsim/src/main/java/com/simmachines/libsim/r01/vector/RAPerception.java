package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.vector.Perception;
import com.simmachines.libsim.r01.abst.AbstractVector;


/**
 * [Perception distance]
 * <p>
 * :: The Perception is a distance in applied social sciences between two specific stimuli (and their perception probabilities) from a set of stimuli.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Perception;
 * @author Jose Daniel Salazar-Vargas
 */ 

public class RAPerception extends AbstractVector{
	
	
	/**
	 * presentation probability of this stimulus 
	 */

	private double p;

	/** 
	 * Default constructor required by R-01
	 */
	public RAPerception(){
			p = 0.5;
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy
	 */ 
	public RAPerception(double obj[], double parameter){
			super(obj);
			p = parameter;
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAPerception(String line){
			super(line);
	}
	
	
	public double getP(){
		return p;
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPerception(cloneHelper(),getP());
	}
	
	/**
	 * Necessary Override for complete storage
	 */
	
	@Override
	public void store(ByteBuffer buf) throws RAException{		
		super.store(buf);
		buf.putDouble(p);
	}
	
	
	/**
	 * Necessary Override for complete load
	 */
	
	@Override
	public void load(ByteBuffer buf) throws RAException{		
		super.load(buf);
		p = buf.getDouble();
	}
	
	
	/** Calculates the Perception distance between this and other RAPerception object
	 *  @param other RAPerception object.
	 *  @return Perception distance.
	 */ 
	
	@Override
			public Double distance(RA<Double> other) {
			return Perception.distance(getVector(), getP(), ((RAPerception)other).getVector(), ((RAPerception)other).getP());
	}
	
}
