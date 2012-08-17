package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;

import org.junit.Test;

import com.simmachines.libsim.common.CommonCheck;

public class TestChi {

	@Test
	// jfquesada
	public void test01() {
		double[] v1 = new double[] {2, 4, 6, 3};
		double[] v2 = new double[] {3, 5, 1, 4};
		double res = Chi.distance(v1, v2);
		
		assertTrue(CommonCheck.Check2Doubles(res, 0.7485665069492319));
	}
	
	@Test
	// jfquesada
	public void test02() {
		double[] v1 = new double[] {20, 30, 1000, 200, 3, 50};
		double[] v2 = new double[] {10, 100, 500, 10, 1, 250};
		double res = Chi.distance(v1, v2);
		
		assertTrue(CommonCheck.Check2Doubles(res, 0.9239801894860852));
	}
	
	
	@Test
	// jdsalazar
	public void test03() {
		double[] v1 = new double[] {8,3,4};
		double[] v2 = new double[] {6,5,10};
		double res = Chi.distance(v1, v2);
		assertTrue(CommonCheck.Check2Doubles(res, 0.5263882104539921));
	}
	
	
	@Test
	// jdsalazar
	public void test04() {
		double[] v1 = new double[] {0.02,0.54,0.48, 5.974,47.682};
		double[] v2 = new double[] {4.28,0.003,1.2658,768.41,0.57921};
		double res = Chi.distance(v1, v2);
		System.out.println(res);
		assertTrue(CommonCheck.Check2Doubles(res, 3.748114800039307));
	}

}