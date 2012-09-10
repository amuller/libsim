package com.simmachines.libsim.enc.set;

import java.util.HashSet;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestCzekanowskyDice {

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
		double res = CzekanowskyDice.distance(s1, s2);
		Asserts.assertEquals(res, 0.666666667);
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
		h2.add(new Integer(523));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		double res = CzekanowskyDice.distance(s1, s2);
		Asserts.assertEquals(res, 0.428571429);
	}
	
	@Test
	//jfquesada
	public void test3(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h2.add(new Integer(1));
		h2.add(new Integer(2));
		h2.add(new Integer(3));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		double res = CzekanowskyDice.distance(s1, s2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jfquesada
	public void test4(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(1));
		h1.add(new Integer(2));
		h2.add(new Integer(3));
		h2.add(new Integer(2));
		h2.add(new Integer(4));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		double res = CzekanowskyDice.distance(s1, s2);
		Asserts.assertEquals(res, 0.6);
	}
	
	@Test
	//jfquesada
	public void test5(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(3));
		h1.add(new Integer(5));
		h1.add(new Integer(7));
		
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		double res = CzekanowskyDice.distance(s1, s2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jfquesada
	public void test6(){
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Integer> h2 = new HashSet<Integer>();
		h1.add(new Integer(3));
		h1.add(new Integer(4));
		h1.add(new Integer(8));
		h1.add(new Integer(9));
		h1.add(new Integer(7));
		
		h2.add(new Integer(3));
		h2.add(new Integer(8));
		h2.add(new Integer(5));
		h2.add(new Integer(6));
		h2.add(new Integer(11));
		h2.add(new Integer(12));
		h2.add(new Integer(13));
		SHashSetInt s1 = new SHashSetInt(h1);
		SHashSetInt s2 = new SHashSetInt(h2);
		double res = CzekanowskyDice.distance(s1, s2);
		Asserts.assertEquals(res, 0.6666666666666667);
	}
	
}
