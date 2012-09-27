package com.simmachines.libsim.enc.vector;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;

/**
 * [Mahalanobis distance]
 * <p>
 * :: one-line-description
 * <p>
 * @see com.simmachines.libsim.enc.vector.Mahalanobis;
 * @author Juan Francisco Quesada-Brizuela author
 */ 
public class Mahalanobis {
		
		/**
		 * Calculates the Mahalanobis distance
		 * @param o1 vector 1
		 * @param o2 vector 2
		 * @param m1 input matrix
		 * @return  Mahalanobis distance
		 */ 
		public static double distance(double o1[], double o2[], RealMatrix m1) {
				double det = Math.pow((new LUDecompositionImpl(m1).getDeterminant()), 1/(o1.length));
				double[] tempSub = new double[o1.length];
				for(int i=0; i < o1.length; i++){
					tempSub[i] = (o1[i]-o2[i]);
				}
				double[] temp = new double[o1.length];
				for(int i=0; i < temp.length; i++){
					temp[i] = tempSub[i]*det;
				}
				RealMatrix m2 = new Array2DRowRealMatrix(new double[][] { temp });
				RealMatrix m3 = m2.multiply(new LUDecompositionImpl(m1).getSolver().getInverse());
				RealMatrix m4 = m3.multiply((new Array2DRowRealMatrix(new double[][] { temp })).transpose());
				return Math.sqrt(m4.getEntry(0, 0));
				//return m4.getEntry(0, 0);
		}
		
}
