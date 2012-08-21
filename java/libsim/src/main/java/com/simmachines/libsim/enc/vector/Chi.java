package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;



public class Chi {

	/**
	 * [Chi distance]
	 * <p>
	 * :: Receives two double vectors and calculates the chi square distance
	 * <p>
	 * [Brief Description]
	 * <p>
	 * The Chi distance... 
	 * <p>
	 * [Definition]
	 * <p>
	 The Chi distance between two Vectors \(a, b \) is given by \( \operatorname{Chi_{a,b}(|a|,|b|) \) where: 
	 * <p>
	 * [Reference]
	 * <p>
	 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
	 * 2009
	 * <p>
	 * | 17.2 :: Relatives of Euclidean distance :: P.303 |
	 * <p>
	 * @see <a href="http://wikipedia-article">Wikipedia Article</a>
	 * 
	 * @author Juan Francisco Quesada-Brizuela author
	 * 
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
