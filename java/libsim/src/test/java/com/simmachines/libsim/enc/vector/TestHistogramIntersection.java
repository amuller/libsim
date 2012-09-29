package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestHistogramIntersection {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = {8,3,7};
		int[] v2 = {9,8,4};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.16666666666667);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = {8,32,7,0,45};
		int[] v2 = {97,78,41,4,78};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = {248,321,788,0,459};
		int[] v2 = {97,78,417,4,7865};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.42125550660793);
	}
	
}
