package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;

import com.simmachines.libsim.enc.string.Levenshtein;
import com.simmachines.libsim.r01.abst.AbstractIntVector;


/**
 * [Levenshtein distance]
 * <p>
 * ::Compares the similarity between two strings based on edit operations.
 * <p>
 * @see com.simmachines.libsim.enc.string.Levenshtein 
 * @author Arnoldo J. Muller Molina
 * 
 */

public class RALevenshtein extends AbstractIntVector {
	
	/**
	 * Default constructor required by R-01
	 */
	public RALevenshtein() {

	}

	/**
	 * Copy constructor
	 * 
	 * @param An
	 *            integer vector.
	 */
	public RALevenshtein(int[] vector) {
		super(vector);
	}

	/**
	 * Parse a vector from a String
	 * 
	 * @param String
	 *            that contains an encoded version of the object.
	 */
	public RALevenshtein(String line) {
		super(line);
	}

	/**
	 * Calculates the Levenshtein distance between:
	 * 
	 * @param First
	 *            sequence of symbols.
	 * @param Second
	 *            sequence of symbols.
	 * @return The minimum number of inserts, deletes and renames required to
	 *         convert one sequence of symbols into the other.
	 */
	@Override
	public Double distance(RA<Double> other) {
		return Double.valueOf(Levenshtein.distance(super.getVector(),
				((AbstractIntVector) other).getVector()));
	}

	/**
	 * Clone must be implemented by all classes that implement RA.
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {
		return new RALevenshtein(cloneHelper());
	}

}
