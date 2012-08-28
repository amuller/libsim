package com.simmachines.libsim.r01.abst;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;

import com.diapai.ramiel.Storable;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.set.HashBitSet;

public abstract class AbstractBitSet implements Storable{
	protected HashBitSet set;
	protected HashSet<Double> hs;
	
	
	public AbstractBitSet() {
		super();
		set = new HashBitSet();
	}
	
	public AbstractBitSet(HashSet<Double> hs){
		this.hs = hs;
		set = new HashBitSet();
	}
	
	@Override
	public void load(ByteBuffer buf) throws RAException {
		hs = new HashSet<Double>();
		short size = buf.getShort();
		int i = 0;
		while(i < size){
			hs.add(new Double(buf.getDouble()));
			i++;
		}
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {		
		Iterator<Double> i = hs.iterator();
		buf.putShort((short)hs.size());
		while(i.hasNext()){
			buf.putDouble(i.next().doubleValue());
		}	
	}
	
}
