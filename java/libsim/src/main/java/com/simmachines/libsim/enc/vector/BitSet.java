package com.simmachines.libsim.enc.vector;

import java.util.HashSet;
import java.util.Iterator;

import com.simmachines.libsim.common.Set;

public class BitSet implements Set{
	
	public BitSet(){
		super();
	}
	
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
