package com.simmachines.libsim.enc.vector;



import hep.aida.bin.StaticBin1D;

import com.simmachines.libsim.asserts.Asserts;

/**
 * Name: chi- distance (chi square distance)
 * 
 * @author jfquesada
 *
 */
public class Chi {
	
	/**
	 * Receives two double vectors and calculates the chi square distance.
	 * v1 and v2 must have the same size. 
	 * @param v1 vector number 1
	 * @param v2 vector number 2
	 * @return The chi square distance. 
	 */
	public static double distance(double[] v1, double[] v2){
		Asserts.validate(v1.length == v2.length, "Lengths must match");
		double mean_v1 = mean(v1);
		double mean_v2 = mean(v2);
		double cons = (mean_v1 + mean_v2) / 
				(v1.length * (mean_v1 * mean_v2) * (mean_v1 * mean_v2));
		double res = 0;
		int i = 0;
		while(i < v1.length){
			double t = (v1[i] * mean_v2) - (v2[i] * mean_v1);
			t = t * t;
			res += cons * (t / (v1[i]+v2[1]));
			i++;
		}
		return Math.sqrt(res);
	}
	
	private static double mean(double[] vector){
		StaticBin1D sb =  new StaticBin1D();
		for(double d:vector){
			sb.add(d);
		}
		return sb.mean();
	}

}