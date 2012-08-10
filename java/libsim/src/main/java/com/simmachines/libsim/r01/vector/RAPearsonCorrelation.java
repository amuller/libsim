package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.PearsonCorrelation;
import com.simmachines.libsim.r01.abst.AbstractVector;


public class RAPearsonCorrelation extends AbstractVector{

	public RAPearsonCorrelation(){
		
	}
	
	/**
	 * Parse a vector from a tab separated list of values. 
	 * @param line
	 */
	public RAPearsonCorrelation(String line){
		super(line);
	}
	
	public RAPearsonCorrelation(double[] vector){
		super(vector);
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
