package com.simmachines.libsim.enc.vector;

/**
 * [RMSLogSpectral distance]
 * <p>
 * :: The RMS log spectral distance (or root-mean-square distance, mean quadratic distance) is an audio distance between two discrete spectra.
 * <p>
 * [Definition]
 * <p>
 
 
 The RMSLogSpectral distance between two vectors \(a,b\) is given by:
 <p>
 \( LSD(a,b) = \sqrt{\frac{1}{n}\sum_{i=1}^n{(\ln{a_i}-\ln{b_i})}^2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 21.2 :: Audio distances :: P.365 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class RMSLogSpectral {

	/**
	 * Received two double vectors (discrete spectra) and calculates the RMSLogSpectral distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The RMSLogSpectral distance.
	 */
	
	public static double distance(double[] v1,double[] v2){
		double res=0;
		for(int i=0;i<v1.length;i++){
			res += Math.pow(Math.log(v1[i])-Math.log(v2[i]),2);
		}
		return Math.sqrt(res/v1.length);
	}
	
}
