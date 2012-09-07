package com.simmachines.libsim.r01.set;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.set.CzekanowskyDice;
import com.simmachines.libsim.enc.set.Set;
import com.simmachines.libsim.r01.abst.AbstractSet;


/**
 * [CzekanowskyDice distance]
 * <p>
 * :: The Dice coefficient, is a similarity measure over sets.
 * <p>
 * @see com.simmachines.libsim.enc.set.CzekanowskyDice;
 * @author  Jose Daniel Salazar-Vargas
 */ 

public abstract class AbstractCzekanowskyDice extends AbstractSet{

	
	/**
	 * Default constructor is required in every RA object. 
	 */
	public AbstractCzekanowskyDice(){
		super();
	}
	
	public AbstractCzekanowskyDice(Set s){
		super(s);
	}
	
	
	/**
	 * Calculates the CzekanowskyDice distance between this and other AbstractCzekanowskyDice object.
	 * @param other AbstractCzekanowskyDice object
	 * @return CzekanowskyDice distance
	 */
	@Override
	public Double distance(RA<Double> other){
		return CzekanowskyDice.distance(getSet(), ((AbstractCzekanowskyDice)other).getSet());
	}
	
	@Override
	public abstract Object clone();
}
