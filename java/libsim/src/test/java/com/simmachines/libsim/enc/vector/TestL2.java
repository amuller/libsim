package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestL2 {
/*
	@Test
	public void test1() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void test2() {
		double[] v1 = new double[]{0.2,0.7,0.001,0.5,0.10};
		double[] v2 = new double[]{0.1,0.05,0.01,2,0.01};
		double res = L2.distance(v1, v2);
		assertTrue((res - 1.6403295400619962) <= 0.0001);
	}
	
	

}
