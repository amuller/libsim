package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestL2 {


	/*
	@TesT
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void test3() {
		double[] v1 = new double[] {1, 2, 3, 5, 6};
		double[] v2 = new double[] {7, 8, 9, 0, 1};
		double res = L2.distance(v1, v2);
		
		assertTrue((res - 12.569805089976535) <= 0.0001);
	}
	
	@Test
	public void test4 () {
		double[] v1 = new double[] {20, 30, 1000, 200, 3, 50};
		double[] v2 = new double[] {10, 100, 500, 10, 1, 250};
		double res = L2.distance(v1, v2);
		
		assertTrue((res - 575.4163709871314) <= 0.0001);
	}

	@Test
	public void test1() {

		double[] v1 = new double[]{1, 2, 3, 5, 6};
		double[] v2 = new double[]{7, 8, 9, 0, 1};
		double res = L2.distance(v1, v2);		
		assertTrue((res - 12.569805089976535) <= 0.0001);
	}
	

	
	@Test
	public void test2() {
		double[] v1 = new double[]{0.2,0.7,0.001,0.5,0.10};
		double[] v2 = new double[]{0.1,0.05,0.01,2,0.01};
		double res = L2.distance(v1, v2);
		assertTrue((res - 1.6403295400619962) <= 0.0001);
	}

	
}
