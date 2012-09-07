package com.simmachines.libsim.r01.set;

import com.simmachines.libsim.enc.set.SHashSetInt;
import com.simmachines.libsim.enc.set.Set;

public class RATanimotoHashSetInt extends AbstractTanimoto {
	
	
	public RATanimotoHashSetInt(){
		super();
	}
	
	public RATanimotoHashSetInt(Set s){
		super(s);
	}
	
	@Override
	protected Set getNewInstance() {
		return new SHashSetInt();
	}
	
	public Object clone(){
		return new RATanimotoHashSetInt(cloneHelper());
	}


}
