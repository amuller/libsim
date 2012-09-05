package com.simmachines.libsim.enc.set;

import java.nio.ByteBuffer;

import com.diapai.ramiel.Storable;
import com.diapai.ramiel.exception.RAException;

public class StorableInt implements Storable{
	
	private int integer;
	
	public StorableInt(){}
	
	
	public StorableInt(int integer){
		this.integer = integer;
	}
	
	public int getInt(){
		return integer;
	}
	
	@Override
	public void store(ByteBuffer buf) throws RAException {
		buf.putInt(integer);
	}
	
	
	@Override
	public void load(ByteBuffer buf) throws RAException {
		integer = buf.getInt();
	}

}
