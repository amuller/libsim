package com.simmachines.libsim.enc.vector;


/**
 * [Pharmacological distance]
 * <p>
 * :: The pharmological is a distance for protein data between two kinases represented by their affinity vectors.
 * <p>
 * [Brief Description]
 * <p>
 * Given a set $\{a_1 , \dots , a_n \}$ of drugs in use, the affinity vector of kinase $x$
 * is defined as $(− \ln B_1(x), \dots , − \ln B_n(x))$, where $B_i(x)$ is the binding constant
 * for the reaction of $x$ with drug $a_i$ , and $B_i(x)=1$ if no interaction
 * was observed. The binding constants are the average of several experiments
 * where the concentration of binded kinase is measured at equilibrium. 

 * <p>
 * [Definition]
 * <p>
 
 
 The Pharmacological distance between two affinity vectors \(a,b\) is given by:
 <p>
 \( d=(\sum_{i=1}^n (\ln B_i(a)-\ln B_i(b))^2)^{1/2} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 23.3 :: Distances for protein data :: P.403 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Pharmacological {
	
	/**
	 * Received two affinity vectors and calculates the Pharmacological distance.
	 * The affinity vector of kinase x is defined as: 
	 * \( (-lnB_1(x), \ldots , =lnB_n(x)) \) 
	 * <p> where \( B_i(x) \) is the binding
	 * constant for the reaction of \( x \)  with drug \( a_i \), and \( B_i(x) = 1 \) 
	 * <p> if no interaction was observed. 
	 * @param v1 affinity vector number 1.
	 * @param v2 affinity vector number 2.
	 * @return The Pharmacological distance.
	 */
	public static double distance(double v1[],double v2[]){		
		double res = 0;
		for(int i=0;i<v1.length;i++){
			res += Math.pow(v1[i] - v2[i], 2);
		}
		return Math.sqrt(res);
	}
	
}
