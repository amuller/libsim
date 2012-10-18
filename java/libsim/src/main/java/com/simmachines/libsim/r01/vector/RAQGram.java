package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;
import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.string.QGram;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [QGram distance]
 * <p>
 * :: The q-gram is a similarity between strings using the q-gram function. 
 * <p>
 * @see com.simmachines.libsim.enc.string.QGram;
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RAQGram extends AbstractIntVector{
	
	/**
	 * length of the q-gram (substring).
	 */

	private int q;
	
	
	
	/** 
	 * Default constructor required by R-01
	 */
	public RAQGram(){
		q = 2;
	}
	
	/**
	 * Copy constructor
	 * @param obj vector to copy.
	 */ 
	public RAQGram(int[] obj, int parameter){
			super(obj);
			q = parameter;
	}
	
	/**
	 * Parse a vector from a String
	 * @param line String that contains an encoded version of the object. 
	 */
	public RAQGram(String line){
			super(line);
	}
	
	
	public int getQ(){
		return q;
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAQGram(cloneHelper(), getQ());
	}
	
	
	/**
	 * Necessary Override for complete storage
	 */
	
	@Override
	public void store(ByteBuffer buf) throws RAException{		
		super.store(buf);
		buf.putInt(q);
	}
	
	
	/**
	 * Necessary Override for complete load
	 */
	
	@Override
	public void load(ByteBuffer buf) throws RAException{		
		super.load(buf);
		q = buf.getInt();
	}
	
	
	/** Calculates the QGram distance between this and other RAQGram object
	 *  @param other RAQGram object
	 *  @return QGram distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return QGram.distance(getQ(), getVector(),((RAQGram)other).getVector());
	}

}
