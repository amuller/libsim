package com.simmachines.libsim.enc.set;

import java.nio.ByteBuffer;
import java.util.HashSet;

import com.diapai.ramiel.Storable;
import com.diapai.ramiel.exception.RAException;


public class SHashSet<O extends Storable> implements Set{
	
	private HashSet<O> set;
	
	public SHashSet(){
		super();
	}
	
	public SHashSet(HashSet<O> set){
		this.set = set;
	}
	
	public HashSet<O> getSet(){
		return this.set;
	}
	
	
	/**
	 * Calculates the intersection between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.intersect
	 */
	
/*	public SHashSet<O> intersect(SHashSet<O> other){
		HashSet<O> res = new HashSet<O>();
		for(O x : other.getSet()){
			if(getSet().contains(x)){
				res.add(x);
			}
		}
		return new SHashSet<O>(res);
	}
*/
	
	/**
	 * Calculates the union between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.union
	 */
	
/*	public SHashSet<O> union(SHashSet<O> other){
		HashSet<O> res = new HashSet<O>();
		for(O x : getSet()){			
			res.add(x);	
		}
		for(O x : other.getSet()){			
			res.add(x);	
		}
		return new SHashSet<O>(res);
	}
*/	
	
	/**
	 * Calculates difference between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.difference
	 */
	
	
/*	public SHashSet<O> difference(SHashSet<O> other){
		HashSet<O> res = new HashSet<O>();
		SHashSet<O> inters = intersect(other);
		for(O x : getSet()){	
			if(!inters.getSet().contains(x)){
				res.add(x);
			}
		}
		return new SHashSet<O>(res);
	}
*/	
	
	public SHashSet<O> deepCopy(){
		HashSet<O> res = new HashSet<O>();
		for(O x : getSet()){
			res.add(x);
		}
		return new SHashSet<O>(res);
	}

	@Override
	public void load(ByteBuffer buf) throws RAException {
		set = new HashSet<O>();
		short size = buf.getShort();
		int i = 0;
		O x;
		while(i < size){
			x = getInstance();
			x.load(buf);
			set.add(x);
			i++;
		}
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {
		buf.putShort((short)size());
		for(O x : getSet()){
			x.store(buf);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set intersect(Set other) {
		HashSet<O> res = new HashSet<O>();
		for(O x : ((SHashSet<O>)other).getSet()){
			if(getSet().contains(x)){
				res.add(x);
			}
		}
		return new SHashSet<O>(res);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set union(Set other) {
		HashSet<O> res = new HashSet<O>();
		for(O x : getSet()){			
			res.add(x);	
		}
		for(O x : ((SHashSet<O>)other).getSet()){			
			res.add(x);	
		}
		return new SHashSet<O>(res);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set difference(Set other){
		HashSet<O> res = new HashSet<O>();
		Set inters = intersect(other);
		for(O x : getSet()){	
			if(!((SHashSet<O>)inters).getSet().contains(x)){
				res.add(x);
			}
		}
		return new SHashSet<O>(res);
	}

	public int size(){	//length
		int res = 0;
		while(getSet().iterator().hasNext()){
			res++;
		}
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public boolean equals(Set s1){
		return getSet().equals(((SHashSet<O>)s1).getSet());
	}
	
	@Override
	public int hashCode(){
		return set.hashCode();
	}

}
