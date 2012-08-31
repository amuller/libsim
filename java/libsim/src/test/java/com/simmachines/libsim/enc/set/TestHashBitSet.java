package com.simmachines.libsim.enc.set;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;


public class TestHashBitSet {
	
	
	public static void print(HashSet<Double> h){
		Iterator<Double> i = h.iterator();
		while(i.hasNext()){
			System.out.println(i.next().doubleValue());
		}
		System.out.println("----------------------");
	}

	@Test
	//jdsalazar
	public void test1(){
		HashBitSet hbs = new HashBitSet();
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(1));
		h1.add(new Double(2));
		h1.add(new Double(3));
		h2.add(new Double(3));
		h2.add(new Double(4));
		h2.add(new Double(5));
		
		print(hbs.intersect(h1,h2));
	}
	
	
	@Test
	//jdsalazar
	public void test2(){
		HashBitSet hbs = new HashBitSet();
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(-93.24856));
		h1.add(new Double(-872.169));
		h1.add(new Double(3.564));
		h2.add(new Double(-872.169));
		h2.add(new Double(-93.24856));
		h2.add(new Double(4748.95));
		
		print(hbs.intersect(h1,h2));
	}
	
	
	@Test
	//jdsalazar
	public void test3(){
		HashBitSet hbs = new HashBitSet();
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(1));
		h1.add(new Double(2));
		h1.add(new Double(3));
		h2.add(new Double(3));
		h2.add(new Double(4));
		h2.add(new Double(5));
		
		print(hbs.union(h1,h2));
	}
	
	
	@Test
	//jdsalazar
	public void test4(){
		HashBitSet hbs = new HashBitSet();
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(-93.24856));
		h1.add(new Double(-872.169));
		h1.add(new Double(3.564));
		h2.add(new Double(-872.169));
		h2.add(new Double(-93.24856));
		h2.add(new Double(4748.95));
		
		print(hbs.union(h1,h2));
	}
	
	
	@Test
	//jdsalazar
	public void test5(){
		HashBitSet hbs = new HashBitSet();
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(1));
		h1.add(new Double(2));
		h1.add(new Double(3));
		h2.add(new Double(3));
		h2.add(new Double(4));
		h2.add(new Double(5));
		
		print(hbs.difference(h1,h2));
	}
	
	
	@Test
	//jdsalazar
	public void test6(){
		HashBitSet hbs = new HashBitSet();
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(-93.24856));
		h1.add(new Double(-872.169));
		h1.add(new Double(3.564));
		h2.add(new Double(-872.169));
		h2.add(new Double(-93.24856));
		h2.add(new Double(4748.95));
		
		print(hbs.difference(h1,h2));
	}
	
}
