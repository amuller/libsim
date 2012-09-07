package com.simmachines.libsim.enc.set;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;


public class TestSHashSetInt {
	
	
	public static void print(HashSet<Integer> h){
		Iterator<Integer> i = h.iterator();
		while(i.hasNext()){
			System.out.println(i.next().intValue());
		}
		System.out.println("----------------------");
	}

	@Test
	//jdsalazar
	public void test1(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(1));
		h1.add(new Integer(2));
		h1.add(new Integer(3));
		h2.add(new Integer(3));
		h2.add(new Integer(4));
		h2.add(new Integer(5));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		print(((SHashSetInt)s1.intersect(s2)).getSet());
	}
	
	
	@Test
	//jdsalazar
	public void test2(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(-93));
		h1.add(new Integer(-872));
		h1.add(new Integer(3));
		h2.add(new Integer(-872));
		h2.add(new Integer(-93));
		h2.add(new Integer(4748));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		print(((SHashSetInt)s1.intersect(s2)).getSet());
	}
	
	
	@Test
	//jdsalazar
	public void test3(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(1));
		h1.add(new Integer(2));
		h1.add(new Integer(3));
		h2.add(new Integer(3));
		h2.add(new Integer(4));
		h2.add(new Integer(5));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		print(((SHashSetInt)s1.union(s2)).getSet());
	}
	
	
	@Test
	//jdsalazar
	public void test4(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(-93));
		h1.add(new Integer(-872));
		h1.add(new Integer(3));
		h2.add(new Integer(-872));
		h2.add(new Integer(-93));
		h2.add(new Integer(4748));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		print(((SHashSetInt)s1.union(s2)).getSet());
	}
	
	
	@Test
	//jdsalazar
	public void test5(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(1));
		h1.add(new Integer(2));
		h1.add(new Integer(3));
		h2.add(new Integer(3));
		h2.add(new Integer(4));
		h2.add(new Integer(5));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		print(((SHashSetInt)s1.difference(s2)).getSet());
	}
	
	
	@Test
	//jdsalazar
	public void test6(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(-93));
		h1.add(new Integer(-872));
		h1.add(new Integer(3));
		h2.add(new Integer(-872));
		h2.add(new Integer(-93));
		h2.add(new Integer(4748));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		print(((SHashSetInt)s1.difference(s2)).getSet());
	}
	
}
