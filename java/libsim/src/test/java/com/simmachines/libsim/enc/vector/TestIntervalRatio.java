package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestIntervalRatio {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = {1,2,3};
		int[] v2 = {2,3,1};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		System.out.println(res);
		Asserts.assertEquals(res, 3.83333333);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = {5,4,3,2,1};
		int[] v2 = {4,1,3,5,2};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		System.out.println(res);
		Asserts.assertEquals(res, 6.95);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = {3,5,2,1,4};
		int[] v2 = {1,2,3,4,5};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		System.out.println(res);
		Asserts.assertEquals(res, 6.81666666);
	}
	
}
