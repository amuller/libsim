package com.simmachines.libsim.enc.binary;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestAnderberg {


	
	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = new int[]{1,0,1};
		int[] v2 = new int[]{1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.75);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = new int[]{1,1,1,0};
		int[] v2 = new int[]{0,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.791666667);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = new int[]{1,0,1,1,0};
		int[] v2 = new int[]{1,1,0,1,1};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res,0.708333333);
	}
	
	@Test
	//jxwang
	public void test4(){
		int[] v1 = new int[]{1,0,1,1,0,1};
		int[] v2 = new int[]{1,1,0,1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.75);
	}
	
	@Test
	//jxwang
	public void test5(){
		int[] v1 = new int[]{1,0,1,1,0,1,1};
		int[] v2 = new int[]{1,1,0,1,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.7);
	} 
	
	@Test
	//jxwang
	public void test6(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.8);
	}
	
	@Test
	//jxwang
	public void test7(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.675);
	}
	
	@Test
	//jxwang
	public void test8(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0,1,1};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1,1,1};
		Asserts.assertEqualLength(v1, v2);
		double res = Anderberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.714285714);
	}
	
	
}
