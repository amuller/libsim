package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;

import org.apache.commons.math.linear.RealMatrix;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
/**
 * An abstract matrix class that holds common matrix functionality. 
 * @author Jose Daniel Salazar-Vargas
 *
 */
public abstract class AbstractMatrix implements RA<Double> {

	protected RealMatrix matrix;
	/**
	 * Default constructor is required in every RA object. 
	 */
	public AbstractMatrix() {
		super();
		matrix = getNewInstance();
	}
	
	
	/**
	 * Instantiates a new RealMatrix object.
	 * @return new RealMatrix instance.
	 */
	protected abstract RealMatrix getNewInstance();
	
	public AbstractMatrix(RealMatrix matrix){
		this.matrix = matrix;
	}

	/**
	 * Returns the number of rows in the matrix.
	 * @return the number of rows in the matrix.
	 * @see org.apache.commons.math.linear.RealMatrix
	 */
	public int getRowDimension(){
		return matrix.getRowDimension();
	}
	
	
	/**
	 * Returns the number of columns in the matrix.
	 * @return the number of columns in the matrix.
	 * @see org.apache.commons.math.linear.RealMatrix
	 */
	public int getColumnDimension(){
		return matrix.getColumnDimension();
	}
	
	public RealMatrix getMatrix(){
		return matrix;
	}

	@Override
	public int hashCode() {
		return matrix.hashCode();
	}
	


	@Override
	public boolean equals(Object other) {
		return matrix.equals(other);
	}    
	
	@Override
	public abstract void load(ByteBuffer buf) throws RAException;
	
	
		
	public double[][] preLoad(ByteBuffer buf) throws RAException {
		int row = buf.getInt();
		int column = buf.getInt();
		double res[][] = new double[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				res[i][j] = buf.getDouble();
			}
		}
		return res;	
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {		
		buf.putInt(matrix.getRowDimension());
		buf.putInt(matrix.getColumnDimension());
		for(int i=0;i<matrix.getRowDimension();i++){
			for(int j=0;j<matrix.getColumnDimension();j++){
				buf.putDouble(matrix.getEntry(i, j));
			}
		}
		
		
	}
	
	/**
	 * Clones the matrix and returns a new copy of it.
	 * @return a new, deep copied matrix.
	 * @see org.apache.commons.math.linear.RealMatrix
	 */
	protected RealMatrix cloneHelper(){
		return matrix.copy();
	}

	@Override
	public abstract Object clone();

}