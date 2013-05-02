package com.simmachines.libsim.enc.vector;

/**
 * [SpearmanRank correlation]
 * <p>
 * :: The Spearman rank correlation is a non-parametric measure of statistical dependence between two variables.
 * <p>
 * [Brief Description]
 * <p>
 * The Spearman rank is often denoted by the Greek letter \( \rho \) (rho) or as \( r_s \), is a non-parametric measure of statistical dependence between two variables. It assesses how well the relationship between two variables can be described using a monotonic function.
 * <p>
 * [Definition]
 * <p>
 
 
 The SpearmanRank correlation between two vectors \(a,b\) is given by:
 <p>
 \( \rho =1-\frac{6}{n(n^2-1)}\sum(a_i-b_i)^2 \)
 
  \( d =\frac{1-\rho}{2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.309 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Spearman's_rank_correlation_coefficient">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas 
 * 
 */


public class SpearmanRank {
	
	/**
	 * Received two integer vectors and calculates the SpearmanRank correlation.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The SpearmanRank correlation.
	 */
	
	public static double distance(int[] v1,int[] v2){
		double res = 0;
		for(int i=0;i<v1.length;i++){
			res += Math.pow(v1[i]-v2[i], 2);
		}
		return (6*((double)res)/(v1.length*(Math.pow(v1.length, 2)-1)))/2;
	}
	
}
