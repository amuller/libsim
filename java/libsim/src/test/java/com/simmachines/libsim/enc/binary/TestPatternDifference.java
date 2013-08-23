package com.simmachines.libsim.enc.binary;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestPatternDifference {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = new int[]{1,0,1};
		int[] v2 = new int[]{1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.44444444);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = new int[]{1,1,0,0};
		int[] v2 = new int[]{0,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.25);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = new int[]{1,0,0,1,1};
		int[] v2 = new int[]{1,1,0,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.16);
	}
	
	@Test
	//jxwang
	public void test4(){
		int[] v1 = new int[]{1,0,1,1,0,1};
		int[] v2 = new int[]{1,1,0,1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.44444);
	}
	
	@Test
	//jxwang
	public void test5(){
		int[] v1 = new int[]{1,0,1,1,0,1,1};
		int[] v2 = new int[]{1,1,0,1,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.32653061);
	} 
	
	@Test
	//jxwang
	public void test6(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.5625);
	}
	
	@Test
	//jxwang
	public void test7(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0,0};
		int[] v2 = new int[]{1,1,0,1,0,0,0,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.29629);
	}
	
	@Test
	//jxwang
	public void test8(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0,1,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = PatternDifference.distance(v1, v2);
		Asserts.assertEquals(res, 0.36);
	}
	
	
	
}
