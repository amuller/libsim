package com.simmachines.libsim.enc.vector;

public class PearsonCorrelation {
	
	
	
	
	/**
	 * Receives a double vector and calculates the vector's mean value.
	 * @param v vector received.
	 * @return mean value.
	 */
	
	public static double Prom(double v[]){ 
        double sum=0;
		for(int i=0;i<v.length;i++){
            sum+=v[i];
        }
		return sum/v.length;
    }
	
	
	/**
	 * Receives a double vector and calculates the sumatories (individually) in the denominator's square-roots.
	 * @param v vector receved.
	 * @param prom mean value of v.
	 * @return sumatory result
	 */
	
	public static double sumDenom(double v[],double prom){   
        double sum=0;
        for(int i=0;i<v.length;i++){
        	 sum+=Math.pow((v[i]-prom), 2);
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
		double promV1=Prom(v1);
		double promV2=Prom(v2);
		for(int i=0;i<v1.length;i++){
			sum+=(v1[i]-promV1)*(v2[i]-promV2);
		}
		return 1-(sum/Math.sqrt(sumDenom(v1,promV1)*sumDenom(v2,promV2)));
    }

}
