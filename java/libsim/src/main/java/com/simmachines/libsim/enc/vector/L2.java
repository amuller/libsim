package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;

/**
 * [L2 distance]
 * <p>
 * :: The Euclidean distance is the "ordinary" distance between two points, and is given by the Pythagorean formula. 
 * <p>
 * [Brief Description]
 * <p>
 * The Euclidean distance between points (\p\) and (\q\) is the length of the line segment connecting them ( \( \overline{pq} \) ).
 * <p>
 * [Definition]
 * <p>
 
 
 The L2 distance between two vectors \(a,b\) is given by \( \operatorname{d_E}_{a,b}(|a|,|b|) \) where:
 <p>
 \( d_E=\sqrt{(a_1-b_1)^2+\cdots+(a_n-b_n)^2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 5 :: Metric on Normed Structures :: P.94 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Euclidean_distance">Wikipedia Article</a>
 * 
 * @author  Arnoldo Jose Muller-Molina
 * 
 */
public class L2 {
	
	/**
	 * Receives two double vectors and calculates the euclidean (L2) distance.
	 * v1 and v2 must have the same size. 
	 * @param v1 vector number 1
	 * @param v2 vector number 2
	 * @return The euclidean distance. 
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.validate(v1.length == v2.length, "Lengths must match");
		double res = 0;
		int i = 0;
		while(i < v1.length){
			double t = v1[i] - v2[i];
			t = t * t;
			res += t;
			i++;
		}
		return Math.sqrt(res);
	}

}
