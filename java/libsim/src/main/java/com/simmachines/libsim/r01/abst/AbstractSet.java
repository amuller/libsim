package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
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
	
	public Set getSet(){
		return set;
	}
	
	@Override
	public void load(ByteBuffer buf) throws RAException {
		set.load(buf);
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {		
		set.store(buf);
	}
	
	public Object clone(){
		throw new UnsupportedOperationException();
	}
	
	public Set cloneHelper(){
		return set.deepCopy();
	}
	
	public int setSize(){
		return set.size();
	}
	
	public boolean equals(Set other){
		return set.equals(other);
	}
	
	@Override
	public int hashCode(){
		return set.hashCode();
	}
	
}
