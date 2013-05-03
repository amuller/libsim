package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.vector.Mahalanobis;
import com.simmachines.libsim.r01.abst.AbstractVector;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;

/**
 * [Mahalanobis distance]
 * <p>
 * :: The Mahalanobis distance (or statistical distance) is a distance on \( \mathbb{R}^n \)
 *  based on correlations between variables by which different patterns can be identified and analyzed.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Mahalanobis
 * @author Juan Francisco Quesada-Brizuela
 */ 


public class RAMahalanobis extends AbstractVector{
	
	
		/**
		 * function parameter 
		 */
	
		private RealMatrix matrix;
	
		/** 
		 * Default constructor required by R-01
		 */
		public RAMahalanobis(){
				matrix = new Array2DRowRealMatrix();
		}
		
		/**
		 * Copy constructor
		 * @param obj vector to copy
		 */ 
		public RAMahalanobis(double obj[], RealMatrix parameter){
				super(obj);
				matrix = parameter;
		}
		
		/**
		 * Parse a vector from a String
		 * @param line String that contains an encoded version of the object. 
		 */
		public RAMahalanobis(String line){
				super(line);
		}
		
		
		public RealMatrix getMatrix(){
			return matrix;
		}
		
		
		/**
		 * Clone must be implemented by all classes that implement RA. 
		 * @see java.lang.Object#clone()
		 */
		public Object clone() {	
				return new RAMahalanobis(cloneHelper(),getMatrix());
		}
		
		/**
		 * Necessary Override for complete storage
		 */
		
		@Override
		public void store(ByteBuffer buf) throws RAException{		
			super.store(buf);
			double[][] data = matrix.getData();
			int rows = data.length;
			int cols = data[0].length;
			buf.putInt(rows);
			buf.putInt(cols);
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					buf.putDouble(data[i][j]);
				}
			}
		}
		
		
		/**
		 * Necessary Override for complete load
		 */
		
		@Override
		public void load(ByteBuffer buf) throws RAException{		
			super.load(buf);
			int rows = buf.getInt();
			int cols = buf.getInt();
			double[][] data = new double[rows][cols];
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					data[i][j] = buf.getDouble();
				}
			}
			matrix = new Array2DRowRealMatrix(data);
		}
		
		
		/** Calculates the Mahalanobis distance between this and other RAMahalanobis object
		 *  @param other RAMahalanobis object.
		 *  @return Mahalanobis distance.
		 */ 
		
		@Override
				public Double distance(RA<Double> other) {
				return Mahalanobis.distance(getMatrix(), getVector(), ((RAMahalanobis)other).getVector());
		}
		
}
