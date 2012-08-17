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

}
