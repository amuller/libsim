package com.simmachines.libsim.r01.set;

import com.diapai.ramiel.Storable;
import com.simmachines.libsim.enc.set.SHashSet;
import com.simmachines.libsim.enc.set.Set;

public class RATanimotoHashSet<O extends Storable> extends AbstractTanimoto {
	
	
	public RATanimotoHashSet(){
		super();
	}
	
	public RATanimotoHashSet(Set s){
		super(s);
	}
	
	@Override
	protected Set getNewInstance() {
		return new SHashSet<O>();
	}
	
	public Object clone(){
		return new RATanimotoHashSet<O>(cloneHelper());
	}


}
