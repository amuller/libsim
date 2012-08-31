package com.simmachines.libsim.r01.set;

import com.simmachines.libsim.enc.set.HashBitSet;
import com.simmachines.libsim.enc.set.Set;

public class RATanimotoHashSet<O> extends AbstractTanimoto {
	
	
	public RATanimotoHashSet(){
		super();
	}
	
	
	
	@Override
	protected Set getNewInstance() {
		return new HashBitSet<O>();
	}

}
