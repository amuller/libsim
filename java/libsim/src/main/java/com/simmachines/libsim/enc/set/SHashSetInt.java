package com.simmachines.libsim.enc.set;

import java.nio.ByteBuffer;
import java.util.HashSet;

import com.diapai.ramiel.exception.RAException;


public class SHashSetInt implements Set{
	
	private HashSet<Integer> set;
	
	public SHashSetInt(){
		super();
	}
	
	public SHashSetInt(HashSet<Integer> set){
		this.set = set;
	}
	
	public HashSet<Integer> getSet(){
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
	
	public SHashSetInt deepCopy(){
		HashSet<Integer> res = new HashSet<Integer>();
		for(Integer x : getSet()){
			res.add(x);
		}
		return new SHashSetInt(res);
	}

	@Override
	public void load(ByteBuffer buf) throws RAException {
		set = new HashSet<Integer>();
		short size = buf.getShort();
		int i = 0;
		while(i < size){
			set.add(new Integer(buf.getInt()));
			i++;
		}
		
	}

	@Override
	public void store(ByteBuffer buf) throws RAException {
		buf.putShort((short)size());
		for(Integer x : getSet()){
			buf.putInt(x.intValue());
		}
		
	}

	@Override
	public Set intersect(Set other) {
		HashSet<Integer> res = new HashSet<Integer>();
		for(Integer x : ((SHashSetInt)other).getSet()){
			if(getSet().contains(x)){
				res.add(x);
			}
		}
		return new SHashSetInt(res);
	}

	@Override
	public Set union(Set other) {
		HashSet<Integer> res = new HashSet<Integer>();
		for(Integer x : getSet()){			
			res.add(x);	
		}
		for(Integer x : ((SHashSetInt)other).getSet()){			
			res.add(x);	
		}
		return new SHashSetInt(res);
	}

	@Override
	public Set difference(Set other){
		HashSet<Integer> res = new HashSet<Integer>();
		Set inters = intersect(other);
		for(Integer x : getSet()){	
			if(!((SHashSetInt)inters).getSet().contains(x)){
				res.add(x);
			}
		}
		return new SHashSetInt(res);
	}

	public int size(){	//length
		return getSet().size();
	}
	
	public boolean equals(Set s1){
		return getSet().equals(((SHashSetInt)s1).getSet());
	}
	
	@Override
	public int hashCode(){
		return set.hashCode();
	}

}
