package com.simmachines.libsim.enc.set;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;


public class TestSHashBitSet {
	
	
	public static void print(HashSet<Double> h){
		Iterator<Double> i = h.iterator();
		while(i.hasNext()){
			System.out.println(i.next().doubleValue());
		}
		System.out.println("----------------------");
	}

	@SuppressWarnings("unchecked")
	@Test
	//jdsalazar
	public void test1(){
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(1));
		h1.add(new Double(2));
		h1.add(new Double(3));
		h2.add(new Double(3));
		h2.add(new Double(4));
		h2.add(new Double(5));
		SHashSet<Double> s1 = new SHashSet<Double>(h1);
		SHashSet<Double> s2 = new SHashSet<Double>(h2);
		print(((SHashSet<Double>)s1.intersect(s2)).getSet());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	//jdsalazar
	public void test2(){
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(-93.24856));
		h1.add(new Double(-872.169));
		h1.add(new Double(3.564));
		h2.add(new Double(-872.169));
		h2.add(new Double(-93.24856));
		h2.add(new Double(4748.95));
		SHashSet<Double> s1 = new SHashSet<Double>(h1);
		SHashSet<Double> s2 = new SHashSet<Double>(h2);
		print(((SHashSet<Double>)s1.intersect(s2)).getSet());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	//jdsalazar
	public void test3(){
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(1));
		h1.add(new Double(2));
		h1.add(new Double(3));
		h2.add(new Double(3));
		h2.add(new Double(4));
		h2.add(new Double(5));
		SHashSet<Double> s1 = new SHashSet<Double>(h1);
		SHashSet<Double> s2 = new SHashSet<Double>(h2);
		print(((SHashSet<Double>)s1.union(s2)).getSet());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	//jdsalazar
	public void test4(){
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(-93.24856));
		h1.add(new Double(-872.169));
		h1.add(new Double(3.564));
		h2.add(new Double(-872.169));
		h2.add(new Double(-93.24856));
		h2.add(new Double(4748.95));
		SHashSet<Double> s1 = new SHashSet<Double>(h1);
		SHashSet<Double> s2 = new SHashSet<Double>(h2);
		print(((SHashSet<Double>)s1.union(s2)).getSet());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	//jdsalazar
	public void test5(){
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(1));
		h1.add(new Double(2));
		h1.add(new Double(3));
		h2.add(new Double(3));
		h2.add(new Double(4));
		h2.add(new Double(5));
		SHashSet<Double> s1 = new SHashSet<Double>(h1);
		SHashSet<Double> s2 = new SHashSet<Double>(h2);
		print(((SHashSet<Double>)s1.difference(s2)).getSet());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	//jdsalazar
	public void test6(){
		HashSet<Double> h1 = new HashSet<Double>();
		HashSet<Double> h2 = new HashSet<Double>();
		h1.add(new Double(-93.24856));
		h1.add(new Double(-872.169));
		h1.add(new Double(3.564));
		h2.add(new Double(-872.169));
		h2.add(new Double(-93.24856));
		h2.add(new Double(4748.95));
		SHashSet<Double> s1 = new SHashSet<Double>(h1);
		SHashSet<Double> s2 = new SHashSet<Double>(h2);
		print(((SHashSet<Double>)s1.difference(s2)).getSet());
	}
	
}
