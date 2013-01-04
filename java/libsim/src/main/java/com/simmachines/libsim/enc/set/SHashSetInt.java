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
	
	public SHashSetInt(int... elems){
		super();
		HashSet<Integer> s = new HashSet<Integer>(elems.length);
		for(int i : elems){
			s.add(i);
		}
		this.set = s;
	}
	
	public HashSet<Integer> getSet(){
		return this.set;
	}
	
	
	/**
	 * Calculates the intersection between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.intersect
	 */
	
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
	
	/**
	 * Calculates the union between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.union
	 */
	
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
	
	/**
	 * Calculates difference between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.difference
	 */
	
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
	
	
	/**
	 * Calculates difference between this and other set.
	 * @see com.simmachines.libsim.enc.set.Set.difference
	 */
	
	@Override
	public Set symmetricDifference(Set other){
		Set inters = intersect(other);
		Set union = union(other);
		return union.difference(inters);
	}
	
	
	/**
	 * Deep copy of the set.  
	 * @return A new, deep copied set.
	 * @see com.simmachines.libsim.enc.set.Set;
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

	
	/**
	 * Size of the set (count of all the set's elements).
	 * @return The size of the set.
	 * @see com.simmachines.libsim.enc.set.Set;
	 */
	public int size(){	
		return getSet().size();
	}
	
	
	@Override
	public boolean equals(Object other){
		return getSet().equals(((SHashSetInt)other).getSet());
	}
	
	
	@Override
	public int hashCode(){
		return set.hashCode();
	}

}
