package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.vector.LP;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [LP distance]
 * <p>
 * :: The LP distance is a generalization of the Euclidean distance (L2).
 * <p>
 * @see com.simmachines.libsim.enc.vector.LP;
 * @author  Jose Daniel Salazar-Vargas
 */ 

public class RALP extends AbstractVector{
	
	
		/**
		 * norm parameter 
		 */
	
		private double p;
	
		/** 
		 * Default constructor required by R-01
		 */
		public RALP(){
				p = 2;
		}
		
		/**
		 * Copy constructor
		 * @param obj vector to copy
		 */ 
		public RALP(double obj[], double parameter){
				super(obj);
				p = parameter;
		}
		
		/**
		 * Parse a vector from a String
		 * @param line String that contains an encoded version of the object. 
		 */
		public RALP(String line){
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
				return new RALP(cloneHelper(),getP());
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
		
		
		/** Calculates the LP distance between this and other RALP object
		 *  @param other RALP object.
		 *  @return LP distance.
		 */ 
		
		@Override
				public Double distance(RA<Double> other) {
				return LP.distance(getVector(), ((RALP)other).getVector(), getP());
		}
		
}
