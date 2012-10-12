package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;




/**
 * [Cultural distance]
 * <p>
 * :: The cultural is an applied social science distance from the cultural dimensions theory, that describes the effects of a society's culture on the values of its members, and how these values relate to behavior, using a structure derived from factor analysis.
 * <p>
 * [Brief Description]
 * <p>
 * The variance vector has five entries, each one is the variance for one of the next indexes:
 * 1. Power distance (preferences for equality)
 * 2. Uncertainty avoidance (risk aversion)
 * 3. Individualism versus collectivism
 * 4. Masculinity versus femininity (gender specialization)
 * 5. Confucian dynamism (long-term versus short-term orientation)
 * <p>
 * [Definition]
 * <p>
 
 
 The Cultural distance between two vectors \(a,b\) is given by:
 <p>
 \( d=\sum_{i=1}^5 \frac{(a_i-b_i)^2}{5V_i} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 28.1 :: Distances in Psychology and Sociology :: P.513 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Hofstede's_cultural_dimensions_theory">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Cultural {
	
	
	public static final int CULTURAL_DIM = 5;
	
	public static double[] culturalVectorHelper(double powerDistance, double uncertainlyAvoidance, double individualismVsCollectivism, double mascVsFem, double confusianDynamism){
		return new double[]{powerDistance,  uncertainlyAvoidance, individualismVsCollectivism, mascVsFem, confusianDynamism };
	}

	/**
	 * Received two double vectors and calculates the Cultural distance.
	 * @param var variance vector.
	 * @param v1 country number 1.
	 * @param v2 country number 2.
	 * @return The Cultural distance.
	 */
	
	public static double distance(double[] var,double[] v1,double[] v2){
		
		Asserts.validate(v1.length == CULTURAL_DIM, "Invalid vector length: v1" );
		Asserts.validate(v2.length == CULTURAL_DIM, "Invalid vector length: v2" );
		Asserts.validate(var.length == CULTURAL_DIM, "Invalid vector length: var");
		
		double sum = 0;
		for(int i=0;i<CULTURAL_DIM;i++){
			sum += Math.pow(v1[i]-v2[i], 2)/(CULTURAL_DIM*var[i]);
		}
		return sum;
	}
	
	
}
