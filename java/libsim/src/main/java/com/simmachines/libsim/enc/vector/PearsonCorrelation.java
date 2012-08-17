package com.simmachines.libsim.enc.vector;

/**
 * [PearsonCorrelation distance]
 * <p>
 * :: The Pearson Correlation is a measure of the linear dependence between two variables.
 * <p>
 * @see com.simmachines.libsim.enc.vector.PearsonCorrelation;
 * @author  Jose Daniel Salazar-Vargas
 */ 

public class PearsonCorrelation {
	
	
	
	
	/**
	 * Receives a double vector and calculates the vector's mean value.
	 * @param v vector received.
	 * @return mean value.
	 */
	
	public static double Mean(double v[]){ 
        double sum=0;
		for(int i=0;i<v.length;i++){
            sum+=v[i];
        }
		return sum/v.length;
    }
	
	
	/**
	 * Receives a double vector and its mean value, and calculates the summatory: \( \sum (a_i-\overline{a})^2 \)
	 * @param v vector received.
	 * @param mean mean value of v.
	 * @return summatory result
	 */
	
	public static double sumDenom(double v[],double mean){   
        double sum=0;
        for(int i=0;i<v.length;i++){
        	 sum+=Math.pow((v[i]-mean), 2);
        }
        return sum;
    }
	
	
	/**
	 * Receives two double vectors and calculates the Pearson correlation distance.
	 * v1 and v2 must have the same size. 
	 * @param v1 vector number 1
	 * @param v2 vector number 2
	 * @return The Pearson correlation distance. 
	 */

	public static double distance(double v1[],double v2[]){
	    double sum=0;
		double meanV1=Mean(v1);
		double meanV2=Mean(v2);
		for(int i=0;i<v1.length;i++){
			sum+=(v1[i]-meanV1)*(v2[i]-meanV2);
		}
		return 1-(sum/Math.sqrt(sumDenom(v1,meanV1)*sumDenom(v2,meanV2)));
    }

}
