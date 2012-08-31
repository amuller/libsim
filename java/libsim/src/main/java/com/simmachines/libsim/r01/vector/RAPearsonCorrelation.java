package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.PearsonCorrelation;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [PearsonCorrelation distance]
 * <p>
 * :: The Pearson Correlation is a measure of the linear dependence between two variables.
 * <p>
 * @see com.simmachines.libsim.enc.vector.PearsonCorrelation;
 * @author  Jose Daniel Salazar-Vargas
 */ 

public class RAPearsonCorrelation extends AbstractVector{
		/** 
		 * Default constructor required by R-01
		 */
		public RAPearsonCorrelation(){
				
		}
		
		/**
		 * Copy constructor
		 * @param obj vector to copy
		 */
		
		public RAPearsonCorrelation(double[] obj){
				super(obj);
		}
		
		/**
		 * Parse a vector from a String
		 * @param line String that contains an encoded version of the object. 
		 */
		public RAPearsonCorrelation(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes that implement RA. 
		 * @see java.lang.Object#clone()
		 */
		@Override
				public Object clone() {	
				return new RAPearsonCorrelation(cloneHelper());
		}
		
		/**
		 * Calculates the PearsonCorrelation distance between this and other RAPearsonCorrelation object.
		 * @param other RAPearsonCorrelation object
		 * @return PearsonCorrelation distance
		 */
		@Override
				public Double distance(RA<Double> other) {
				return PearsonCorrelation.distance(getVector(), ((RAPearsonCorrelation)other).getVector());
		}
		
}
