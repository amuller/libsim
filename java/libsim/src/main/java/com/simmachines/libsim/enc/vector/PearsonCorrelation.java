package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.common.CommonStats;

/**
 * [PearsonCorrelation distance]
 * <p>
 * :: The correlation similarity (or Pearson Correlation) is a similarity on  \( \mathbb{R}^n \).
 * <p>
 * [Brief Description]
 * <p>
 * The Pearson Correlation (or by its full name, Pearson product-moment correlation linear coefficient) is a measure of the correlation (linear dependence) between two variables X and Y, giving a value between +1 and -1 inclusive. The dissimilarity (1-s) is called the Pearson Correlation distance, giving a value between 0 and 2 inclusive.
 * <p>
 * [Definition]
 * <p>
 * 
 
 The PearsonCorrelation distance between two Vectors \( a, b \) is given by \( \operatorname{s}_{a,b}(|a|,|b|) \) where:
 <p>
\( \operatorname{s}_{a,b}(|a|,|b|) = 1-\frac{\sum(a_i-\overline{a})(b_i-\overline{b})}{\sqrt{(\sum (a_j-\overline{a})^2)(\sum (b_j-\overline{b})^2)}} \)
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.307 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Pearson_product-moment_correlation_coefficient">Wikipedia Article</a>
 * 
 * @author  Jose Daniel Salazar-Vargas
 * 
 */

public class PearsonCorrelation {
	
	
	
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
		double meanV1=CommonStats.mean(v1);
		double meanV2=CommonStats.mean(v2);
		for(int i=0;i<v1.length;i++){
			sum+=(v1[i]-meanV1)*(v2[i]-meanV2);
		}
		return 1-(sum/Math.sqrt(sumDenom(v1,meanV1)*sumDenom(v2,meanV2)));
    }

}
