package com.simmachines.libsim.enc.vector;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;

/**
 * [Mahalanobis distance]
 * <p>
 * :: The Mahalanobis distance (or statistical distance) is a distance on \( \mathbb{R}^n \)
 *  based on correlations between variables by which different patterns can be identified and analyzed.
 * <p>
 * [Brief Description]
 * <p>
 * The Mahalanobis distance gauges similarity of an unknown sample set to a known one. It differs from
 *  Euclidean distance in that it takes into account the correlations of the data set and is scale-invariant. 
 *  In other words, it is a multivariate effect size.
 * <p>
 * [Definition]
 * <p>
 
 
 The Mahalanobis distance between two vectors \( a, b \) is given by:
 <p>
 \( \|a-b\|_M = \sqrt{(detM)^{\frac{1}{n}}(a-b)M^{-1}(a-b)^T} \),
 * <p>
 * where \(M\) is a positive-definite matrix (usually, the covariance matrix of a finite set consisting of \(observation\) \(vectors\)).
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.2 :: Relatives of Euclidean distance :: P.303 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Mahalanobis_distance">Wikipedia Article</a>
 * 
 * @author Juan Francisco Quesada-Brizuela
 * 
 */


public class Mahalanobis {
		
	/**
	 * Received two double vectors and one matrix value and calculates the Mahalanobis distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @param m1 is a positive-definite matrix (usually, the covariance matrix of a finite set consisting of \(observation\) \(vectors\)).
	 * @return the Mahalanobis distance.
	 */
		public static double distance(RealMatrix m1, double v1[], double v2[]) {
				double det = Math.pow((new LUDecompositionImpl(m1).getDeterminant()), 1/(v1.length));
				double[] tempSub = new double[v1.length];
				for(int i=0; i < v1.length; i++){
					tempSub[i] = (v1[i]-v2[i]);
				}
				double[] temp = new double[v1.length];
				for(int i=0; i < temp.length; i++){
					temp[i] = tempSub[i]*det;
				}
				RealMatrix m2 = new Array2DRowRealMatrix(new double[][] { temp });
				RealMatrix m3 = m2.multiply(new LUDecompositionImpl(m1).getSolver().getInverse());
				RealMatrix m4 = m3.multiply((new Array2DRowRealMatrix(new double[][] { temp })).transpose());
				return Math.sqrt(m4.getEntry(0, 0));

		}
		
}
