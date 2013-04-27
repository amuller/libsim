package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Canberra;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Canberra distance]
 * <p>
 * :: The Canberra distance is a numerical measure of the distance between pairs of points in a vector space.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Canberra
 * @author Jose Daniel Salazar-Vargas
 */ 


public class RACanberra extends AbstractVector{
		/** 
		 * Default constructor required by R-01
		 */
		public RACanberra(){
				
		}
		
		/**
		 * Copy constructor
		 * @param obj vector to copy.
		 */ 
		public RACanberra(double[] obj){
				super(obj);
		}
		
		/**
		 * Parse a vector from a String
		 * @param line String that contains an encoded version of the object. 
		 */
		public RACanberra(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes that implement RA. 
		 * @see java.lang.Object#clone()
		 */
		public Object clone() {	
				return new RACanberra(cloneHelper());
		}
		
		/** Calculates the Canberra distance between this and other RACanberra object
		 *  @param other RACanberra object
		 *  @return Canberra distance
		 */ 
		@Override
				public Double distance(RA<Double> other) {
				return Canberra.distance(getVector(),((RACanberra)other).getVector());
		}
		
}
