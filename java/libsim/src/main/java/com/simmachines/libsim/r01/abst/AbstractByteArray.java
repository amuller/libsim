package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.Storable;
import com.diapai.ramiel.constants.ByteConstants;
import com.diapai.ramiel.exception.RAException;

/**
 * Easy RAmiel (R-01) space implementation helper. 
 * Not as efficient as writing directly into ByteBuffers but it is close enough. 
 * interface but much more convenient.
 * Subclasses need to implement the store, load and clone methods described below. 
 * @author amuller
 */
public abstract class AbstractByteArray<N extends Comparable<N>>  implements RA<N> , Storable{

	@Override
	public void store(ByteBuffer buf) throws RAException {
		byte[] buffer = store();
		buf.putInt(buffer.length);
		buf.put(buffer);		
	}
	
	/**
	 * Return the final buffer size of a class that inherits EasyRA. 
	 * @param bufferSize
	 * @return
	 */
	public static int revealBufferSize(int bufferSize){
		return ByteConstants.Int.getSize() + bufferSize;
	}

	@Override
	public void load(ByteBuffer buf) throws RAException {
		// TODO Auto-generated method stub
		int size = buf.getInt();		
		byte[] data = new byte[size];
		buf.get(data);
		load(data);
	}
	/**
	 * Clone the current object, we require this method to be implemented.
	 */
	public abstract Object clone();
	
	/**
	 * Store (serialize) the object into a byte array. 
	 * @return serialized version of the object. 
	 * @throws RAException
	 */
	protected abstract byte[] store() throws RAException;
	
	/**
	 * De-serialize the object from a string of bytes. 
	 * @param buffer Buffer that contains the serialized object. 
	 * @throws RAException
	 */
	protected abstract void load(byte[] buffer) throws RAException;
 
}
