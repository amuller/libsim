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
		
		public RAPearsonCorrelation(double[] vector){
				super(vector);
		}
		
		/**
		 * Parse a vector from a tab separated list of values. 
		 * @param line
		 */
		public RAPearsonCorrelation(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes. 
		 */
		@Override
				public Object clone() {	
				return new RAPearsonCorrelation(cloneHelper());
		}
		
		
		@Override
				public Double distance(RA<Double> other) {
				return PearsonCorrelation.distance(getVector(), ((RAPearsonCorrelation)other).getVector());
		}
		
}
