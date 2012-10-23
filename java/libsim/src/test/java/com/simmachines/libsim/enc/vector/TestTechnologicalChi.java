package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestTechnologicalChi {

	@Test
	// jdsalazar
	public void test01() {
		int[] v1 = new int[] {2, 4, 6, 3};
		int[] v2 = new int[] {3, 5, 1, 4};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double res = TechnologicalChi.distance(v1, v2);
		Asserts.assertEquals(res, 0.7485665069492319);
	}
	
	@Test
	// jdsalazar
	public void test02() {
		int[] v1 = new int[] {20, 30, 1000, 200, 3, 50};
		int[] v2 = new int[] {10, 100, 500, 10, 1, 250};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double res = TechnologicalChi.distance(v1, v2);
		Asserts.assertEquals(res, 0.9239801894860852);
	}
	
	
	@Test
	// jdsalazar
	public void test03() {
		int[] v1 = new int[] {8,3,4};
		int[] v2 = new int[] {6,5,10};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double res = TechnologicalChi.distance(v1, v2);
		Asserts.assertEquals(res, 0.5263882104539921);
	}
	
}
