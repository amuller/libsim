package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;

/**
 * [Chi distance]
 * <p>
 * :: The Chi distance (or symmetric \(x^2\)-distance) is a distance on \( \mathbb{R}^n \) in data analysis; is a relative of the Euclidean distance.
 * <p>
 * [Definition]
 * <p>
 
 
 The Chi distance between two vectors \(a,b\) is given by:
 <p>
 \( d = \sqrt{\sum{\frac{\overline{a}+\overline{b}}{n(\overline{a}\cdot \overline{b})^2}\cdot \frac{(a_i\overline{b}-b_i\overline{a})^2}{a_i+b_i}}} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.2 :: Relatives of Euclidean distance :: P.303 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Chi-square_test">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Chi {

	
	/**
	 * Received two double vectors and calculates the Chi distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Chi distance.
	 */
	public static double distance(double[] o1, double[] o2) {
		double mean_v1 = CommonStats.mean(o1);
		double mean_v2 = CommonStats.mean(o2);
		double cons = (mean_v1 + mean_v2)
				/ (((double)o1.length) * (mean_v1 * mean_v2) * (mean_v1 * mean_v2));	//casting (double) a o1.length
		double res = 0;
		int i = 0;
		while (i < o1.length) {
			double t = (o1[i] * mean_v2) - (o2[i] * mean_v1);
			t = t * t;
			t = (t / (o1[i] + o2[i]));
			res += (cons * t);
			i++;
		}
		return Math.sqrt(res);
	}
}
