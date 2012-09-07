package com.simmachines.libsim.r01.set;

import com.simmachines.libsim.enc.set.SHashSetInt;
import com.simmachines.libsim.enc.set.Set;

/**
 * [CzekanowskyDice distance]
 * <p>
 * :: The Dice coefficient, is a similarity measure over sets.
 * <p>
 * @see com.simmachines.libsim.enc.set.CzekanowskyDice;
 * @author  Jose Daniel Salazar-Vargas
 */ 
public class RACzekanowskyDiceHashSetInt extends AbstractCzekanowskyDice{

	/** 
	 * Default constructor required by R-01
	 */
	public RACzekanowskyDiceHashSetInt(){
		super();
	}
	
	/**
	 * Copy constructor
	 * @param obj set to copy
	 */
	public RACzekanowskyDiceHashSetInt(Set obj){
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
		return new RACzekanowskyDiceHashSetInt(cloneHelper());
	}
	
}
