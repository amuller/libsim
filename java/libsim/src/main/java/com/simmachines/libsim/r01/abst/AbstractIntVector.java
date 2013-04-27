package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;
import java.util.Arrays;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.constants.ByteConstants;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.asserts.Asserts;

public abstract class AbstractIntVector implements RA<Double>{
	
	
	protected int[] vector;
	/**
	 * Default constructor is required in every RA object. 
	 */
	public AbstractIntVector() {
		super();
	}
	
	public AbstractIntVector(int[] vector){
		this.vector = vector;
	}
	public AbstractIntVector(String line){
		String[] items = line.split("\\s");
		Asserts.validate(items.length < Short.MAX_VALUE, "Vector max len exceeded");
		vector = new int[items.length];
		int i = 0;
		while(i < items.length){
			vector[i] = Integer.parseInt(items[i]);
			i++;
		}
	}

	
	public int vectorLength(){
		return vector.length;
	}
	
	public int[] getVector(){
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
		return ByteConstants.Short.getSize() + (ByteConstants.Int.getSize() * dimensions);
	}

	@Override
	public boolean equals(Object other) {
		return Arrays.equals(vector, ((AbstractIntVector) other).vector);
	}
	
	@Override
	public void load(ByteBuffer buf) throws RAException {
		
		short size = buf.getShort();
		int i = 0;
		vector = new int[size];
		while(i < size){
			vector[i] = buf.getInt();
			i++;
		}
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {		
		buf.putShort((short)vector.length);
		int i = 0;
		while(i < vector.length){
			buf.putInt(vector[i]);
			i++;
		}	
	}
	
	/**
	 * Clones the vector and returns a new copy of it.
	 */
	protected int[] cloneHelper(){
		int[] newF = new int[this.vector.length];
		System.arraycopy(vector, 0, newF, 0, vector.length);
		return newF;
	}

	@Override
	public abstract Object clone();

}
