package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.Storable;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.set.HashBitSet;
import com.simmachines.libsim.enc.set.Set;

public abstract class AbstractSet implements RA<Double>{
	
	protected Set set;
			
	public AbstractSet() {
		super();
		set = getNewInstance();
	}
	
	protected abstract Set getNewInstance();
	
	public AbstractSet(Set hs){		
		this.set = hs; 
	}
	
	@Override
	public void load(ByteBuffer buf) throws RAException {
		set.load(buf);
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {		
		set.store(buf);
	}
	
	
	
}
