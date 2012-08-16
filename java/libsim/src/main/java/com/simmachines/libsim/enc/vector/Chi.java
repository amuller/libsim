package com.simmachines.libsim.enc.vector;

import hep.aida.bin.StaticBin1D;
import com.simmachines.libsim.asserts.Asserts;

/**
 * [Chi distance]
 * <p>
 * :: Receives two double vectors and calculates the chi square distance
 * <p>
 * 
 * @see com.simmachines.libsim.enc.vector.Chi;
 * @author Juan Francisco Quesada-Brizuela author
 */
public class Chi {

	/**
	 * Calculates the Chi distance
	 * 
	 * @param o1
	 *            vector number 1
	 * @param o2
	 *            vector number 2
	 * @return The chi square distance
	 */
	public static double distance(double[] o1, double[] o2) {
		Asserts.validate(o1.length == o2.length, "Lengths must match");
		double mean_v1 = mean(o1);
		double mean_v2 = mean(o2);
		double cons = (mean_v1 + mean_v2)
				/ (o1.length * (mean_v1 * mean_v2) * (mean_v1 * mean_v2));
		double res = 0;
		int i = 0;
		while (i < o1.length) {
			double t = (o1[i] * mean_v2) - (o2[i] * mean_v1);
			t = t * t;
			res += cons * (t / (o1[i] + o2[1]));
			i++;
		}
		return Math.sqrt(res);
	}

	private static double mean(double[] vector) {
		StaticBin1D sb = new StaticBin1D();
		for (double d : vector) {
			sb.add(d);
		}
		return sb.mean();
	}

}
