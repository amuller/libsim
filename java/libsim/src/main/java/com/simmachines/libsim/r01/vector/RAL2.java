package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.L2;
import com.simmachines.libsim.r01.abst.AbstractVector;

public class RAL2 extends AbstractVector{
	
	public RAL2(){
		
	}
	
	/**
	 * Parse a vector from a tab separated list of values. 
	 * @param line
	 */
	public RAL2(String line){
		super(line);
	}
	
	public RAL2(double[] vector){
		super(vector);
	}

	/**
	 * Clone must be implemented by all classes. 
	 */
	@Override
	public Object clone() {	
		return new RAL2(cloneHelper());
	}
	

	@Override
	public Double distance(RA<Double> other) {
		return L2.distance(getVector(), ((RAL2)other).getVector());
	}

	

}
