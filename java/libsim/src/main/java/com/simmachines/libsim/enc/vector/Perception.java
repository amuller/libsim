package com.simmachines.libsim.enc.vector;

import org.apache.commons.math.linear.RealMatrix;


/**
 * [Perception distance]
 * <p>
 * :: The Perception is a distance in applied social sciences between two specific stimuli (and their perception probabilities) from a set of stimuli.
 * <p>
 * [Brief Description]
 * <p>
 * Let \( \{s_1,\ldots,s_n\} \) be the set of stimuli, and let \( q_{ij} \) be the conditional probability 
 * that a subject will perceive a stimulus \( s_j \), when the stimulus \( s_i \) was shown; so, \( q_{ij} \geq 0 \),
 * and \( \sum_{j=1}^n q_{ij}=1 \). Let \( q_i \) be the probability of presenting the stimulus \( s_i \).
 * <p>
 * [Definition]
 * <p>
 
 
 The Perception distance between two stimuli \(s_i,s_j\) is given by:
 <p>
 \( d = \frac{1}{q_i+q_j} \sum_{k=1}^n |\frac{q_{ik}}{q_i}-\frac{q_{jk}}{q_j}| \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 28.3 :: Distances in Perception, Cognition and Language :: P.522 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Perception {

	/**
	 * Calculates the Perception distance between two stimuli.
	 * @param mat stimuli perception probability matrix.
	 * @param vec stimuli presentation probability vector.
	 * @param s1 stimulus number 1.
	 * @param s2 stimulus number 2.
	 * @return The Perception distance.
	 */
	public static double distance(RealMatrix mat, double vec[], int s1, int s2){		
		return distance(mat.getData()[s1], vec[s1], mat.getData()[s2], vec[s2]);
	}
	
	
	/**
	 * Calculates the Perception distance between two stimuli.
	 * @param v1 stimuli perception probability vector of stimulus number 1.
	 * @param v2 stimuli perception probability vector of stimulus number 2.
	 * @param p1 presentation probability of stimulus number 1.
	 * @param p2 presentation probability of stimulus number 2.
	 * @return The Perception distance.
	 */
	public static double distance(double v1[], double p1, double v2[], double p2){
		double sum = 0;
		for(int i=0;i<v1.length;i++){
			sum += Math.abs((v1[i]/p1)-(v2[i]/p2));
		}
		return sum/(p1+p2);
	}
	
}
