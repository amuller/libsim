package com.simmachines.libsim.enc.set;

import java.util.HashSet;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestTanimoto {
	
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
		double res = Tanimoto.distance(s1, s2);
		Asserts.assertEquals(res, 0.8);
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
		double res = Tanimoto.distance(s1, s2);
		Asserts.assertEquals(res, 0.6);
	}
	
}
