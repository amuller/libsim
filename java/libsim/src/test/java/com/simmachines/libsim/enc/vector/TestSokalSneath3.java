package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestSokalSneath3 {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = new int[]{1,0,1};
		int[] v2 = new int[]{1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = SokalSneath3.distance(v1, v2);
		Asserts.assertEquals(res, 2);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = new int[]{1,1,1,1};
		int[] v2 = new int[]{0,1,0,0};
		Asserts.assertEqualLength(v1, v2);
		double res = SokalSneath3.distance(v1, v2);
		Asserts.assertEquals(res, 3);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = new int[]{1,0,1,1,0};
		int[] v2 = new int[]{1,1,0,1,1};
		Asserts.assertEqualLength(v1, v2);
		double res = SokalSneath3.distance(v1, v2);
		Asserts.assertEquals(res, 1.5);
	}
	
}
