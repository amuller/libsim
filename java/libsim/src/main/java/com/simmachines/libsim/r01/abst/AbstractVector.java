package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;
import java.util.Arrays;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.constants.ByteConstants;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.asserts.Asserts;
/**
 * An abstract vector class that holds common vector functionality. 
 * @author amuller
 *
 */
public abstract class AbstractVector implements RA<Double> {

	protected double[] vector;
	/**
	 * Default constructor is required in every RA object. 
	 */
	public AbstractVector() {
		super();
	}
	
	public AbstractVector(double[] vector){
		this.vector = vector;
	}
	public AbstractVector(String line){
		String[] items = line.split("\\s");
		Asserts.validate(items.length < Short.MAX_VALUE, "Vector max len exceeded");
		vector = new double[items.length];
		int i = 0;
		while(i < items.length){
			vector[i] = Double.parseDouble(items[i]);
			i++;
		}
	}

	
	public int vectorLength(){
		return vector.length;
	}
	
	public double[] getVector(){
		return vector;
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(vector);
	}
	
	
	/**
	 * Calculates the buffer size based on the given number of dimensions. 
	 * @param dimensions Number of dimensions
	 * @return the size in bytes of the buffer. 
	 */
	public static int revealBufferSize(int dimensions){
		return ByteConstants.Short.getSize() + (ByteConstants.Double.getSize() * dimensions);
	}

	@Override
	public boolean equals(Object other) {
		return Arrays.equals(vector, ((AbstractVector) other).vector);
	}    
	
	@Override
	public void load(ByteBuffer buf) throws RAException {
		short size = buf.getShort();
		int i = 0;
		vector = new double[size];
		while(i < size){
			vector[i] = buf.getDouble();
			i++;
		}
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {		
		buf.putShort((short)vector.length);
		int i = 0;
		while(i < vector.length){
			buf.putDouble(vector[i]);
			i++;
		}	
	}
	
	/**
	 * Clones the vector and returns a new copy of it.
	 * @return
	 */
	protected double[] cloneHelper(){
		double[] newF = new double[this.vector.length];
		System.arraycopy(vector, 0, newF, 0, vector.length);
		return newF;
	}

	@Override
	public abstract Object clone();

}