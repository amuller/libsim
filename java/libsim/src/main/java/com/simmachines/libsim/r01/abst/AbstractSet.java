package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.set.Set;


/**
 * An abstract set class that holds common set functionality. 
 * @author Jose Daniel Salazar-Vargas
 *
 */
public abstract class AbstractSet implements RA<Double>{
	
	protected Set set;
			
	/**
	 * Default constructor is required in every RA object. 
	 */
	public AbstractSet() {
		super();
		set = getNewInstance();
	}
	
	/**
	 * Instantiates a new Set object.
	 * @return new Set instance.
	 */
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
	
	@Override
	public abstract Object clone();
	
	
	/**
	 * Clones the set and returns a new copy of it.
	 * @return A new, deep copied set.
	 * @see com.simmachines.libsim.enc.set.Set
	 */
	public Set cloneHelper(){
		return set.deepCopy();
	}
	
	
	/**
	 * Size of the set (count of all the set's elements).
	 * @return The size of the set.
	 * @see com.simmachines.libsim.enc.set.Set
	 */
	public int setSize(){
		return set.size();
	}
	
	@Override
	public boolean equals(Object other){
		return set.equals(other);
	}
	
	@Override
	public int hashCode(){
		return set.hashCode();
	}
	
}
