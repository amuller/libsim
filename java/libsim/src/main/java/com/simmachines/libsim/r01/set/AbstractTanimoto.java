package com.simmachines.libsim.r01.set;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.set.Set;
import com.simmachines.libsim.enc.set.Tanimoto;
import com.simmachines.libsim.r01.abst.AbstractSet;


/**
 * [Tanimoto distance]
 * <p>
 * :: Is a statistic used for comparing the similarity and diversity of sample sets.
 * <p>
 * @see com.simmachines.libsim.enc.set.Tanimoto
 * @author  Jose Daniel Salazar-Vargas
 */ 

public abstract class AbstractTanimoto extends AbstractSet {
	
	
	/**
	 * Default constructor is required in every RA object. 
	 */
	public AbstractTanimoto(){
		super();
	}
	
	public AbstractTanimoto(Set s){
		super(s);
	}
	
	
	/**
	 * Calculates the Tanimoto distance between this and other AbstractTanimoto object.
	 * @param other AbstractTanimoto object
	 * @return Tanimoto distance
	 */
	@Override
	public Double distance(RA<Double> other){
		return Tanimoto.distance(getSet(), ((AbstractTanimoto)other).getSet());
	}
	
	@Override
	public abstract Object clone();

}
