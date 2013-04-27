package com.simmachines.libsim.r01.set;

import com.simmachines.libsim.enc.set.SHashSetInt;
import com.simmachines.libsim.enc.set.Set;


/**
 * [Tanimoto distance]
 * <p>
 * :: Is a statistic used for comparing the similarity and diversity of sample sets.
 * <p>
 * @see com.simmachines.libsim.enc.set.Tanimoto
 * @author  Jose Daniel Salazar-Vargas
 */ 

public class RATanimotoHashSetInt extends AbstractTanimoto {
	
	/** 
	 * Default constructor required by R-01
	 */
	public RATanimotoHashSetInt(){
		super();
	}
	
	/**
	 * Copy constructor
	 * @param obj set to copy
	 */
	public RATanimotoHashSetInt(Set obj){
		super(obj);
	}
	
	/**
	 * Instantiates a new Set object.
	 * @return new Set instance.
	 * @see com.simmachines.libsim.r01.abst.AbstractSet
	 */
	@Override
	protected Set getNewInstance() {
		return new SHashSetInt();
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone(){
		return new RATanimotoHashSetInt(cloneHelper());
	}


}
