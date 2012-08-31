package com.simmachines.libsim.enc.set;

import java.util.HashSet;
import java.util.Iterator;


public class HashBitSet implements Set{
	
	public HashBitSet(){
		super();
	}
	
	/**
	 * Calculates the intersection between two sets.
	 * @see com.simmachines.libsim.enc.set.Set.intersect
	 */
	
	public HashSet<Double> intersect(HashSet<Double> c1,HashSet<Double> c2){
		HashSet<Double> i = new HashSet<Double>();
		Iterator<Double> iter = c2.iterator();
		Double x;
		while(iter.hasNext()){
			x=iter.next();
			if(c1.contains(x)){
				i.add(x);
			}
		}
		return i;
	}
	
	
	/**
	 * Calculates the union between two sets.
	 * @see com.simmachines.libsim.enc.set.Set.union
	 */
	
	public HashSet<Double> union(HashSet<Double> c1,HashSet<Double> c2){
		HashSet<Double> i = new HashSet<Double>();
		Iterator<Double> iter = c1.iterator();
		while(iter.hasNext()){			
			i.add(iter.next());	
		}
		iter = c2.iterator();
		while(iter.hasNext()){			
			i.add(iter.next());	
		}
		return i;
	}
	
	
	/**
	 * Calculates difference between two sets.
	 * @see com.simmachines.libsim.enc.set.Set.difference
	 */
	
	public HashSet<Double> difference(HashSet<Double> c1,HashSet<Double> c2){
		HashSet<Double> i = new HashSet<Double>();
		HashSet<Double> inters = intersect(c1,c2);	
		Iterator<Double> iter = c1.iterator();
		Double x;
		while(iter.hasNext()){
			x = iter.next();	
			if(!inters.contains(x)){
				i.add(x);
			}
		}
		return i;
	}
}
