package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;

import com.simmachines.libsim.enc.string.Levenshtein;
import com.simmachines.libsim.r01.abst.AbstractIntVector;

/**
 * [Levenshtein distance]<p> 
 * :: Compares the similarity between two strings based on edit operations.<p>
 * [Reference]<p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer | 2009 <p>
 * (11.1 Distances on General Strings :: P.202)  
 * 
 * @author Arnoldo J. Muller Molina
 * 
 */
public class RALevenshtein extends AbstractIntVector {
	
	public RALevenshtein(){
		
	}
	
	public RALevenshtein(int[] vector){
		super(vector);
	}
		

	@Override
	public Double distance(RA<Double> other) {
		return Double.valueOf(Levenshtein.distance(super.getVector(), ((AbstractIntVector)other).getVector()));
	}
	
	/**
	 * Clone must be implemented by all classes. 
	 */
	@Override
	public Object clone() {	
		return new RAL2(cloneHelper());
	}
	

	

}
