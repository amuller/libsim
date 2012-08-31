package com.simmachines.libsim.r01.set;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.set.Set;
import com.simmachines.libsim.r01.abst.AbstractSet;

public abstract class AbstractTanimoto extends AbstractSet {
	
	public AbstractTanimoto(){
		super();
	}
	
	public AbstractTanimoto(Set s){
		super(s);
	}
	
	
	public Double distance(RA<Double> other){
		//...
		return null;
	}
	
	
	public Object clone(){
		throw new UnsupportedOperationException();
	}

}
