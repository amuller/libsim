package com.simmachines.libsim.r01.vector;


import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Chi;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [Chi distance]
 * <p>
 * :: Receives two double vectors and calculates the chi square distance
 * <p>
 * 
 * @see com.simmachines.libsim.enc.vector.Chi
 * @author Juan Francisco Quesada-Brizuela
 */

public class RAChi extends AbstractVector{
	
		/** 
		 * Default constructor required by R-01
		 */
		public RAChi(){
				
		}
		
		/**
		 * Copy constructor
		 * @param obj double vector
		 */ 
		public RAChi(double[] obj){
				super(obj);
		}
		
		/**
		 * Parse a vector from a String
		 * @param line String that contains an encoded version of the object. 
		 */
		public RAChi(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes that implement RA. 
		 * @see java.lang.Object#clone()
		 */
		public Object clone() {	
				return new RAChi(cloneHelper());
		}
		
		
		
		
		/** Calculates the Chi distance between this and other RAChi object
		 *  @param other RAChi object
		 *  @return Chi distance
		 */ 
		@Override
				public Double distance(RA<Double> other) {
			
				return Double.valueOf(Chi.distance(super.getVector(),
						((AbstractVector) other).getVector()));
		}
		
}
