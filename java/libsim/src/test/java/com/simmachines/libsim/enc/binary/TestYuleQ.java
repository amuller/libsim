package com.simmachines.libsim.enc.binary;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.enc.binary.YuleQ;

public class TestYuleQ {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = new int[]{1,0,1};
		int[] v2 = new int[]{1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = new int[]{1,1,0,0};
		int[] v2 = new int[]{0,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 0.5);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = new int[]{1,0,0,1,1};
		int[] v2 = new int[]{1,1,0,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 0.3333333);
	}
	

	@Test
	//jxwang
	public void test4(){
		int[] v1 = new int[]{1,0,1,1,0,1};
		int[] v2 = new int[]{1,1,0,1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jxwang
	public void test5(){
		int[] v1 = new int[]{1,0,1,1,0,1,1};
		int[] v2 = new int[]{1,1,0,1,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	} 
	
	@Test
	//jxwang
	public void test6(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jxwang
	public void test7(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 0.818181818);
	}
	
	@Test
	//jxwang
	public void test8(){
		int[] v1 = new int[]{1,0,1,1,0,1,1,0,1,0};
		int[] v2 = new int[]{1,1,0,1,1,0,0,1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = YuleQ.distance(v1, v2);
		Asserts.assertEquals(res, 0.75);
	}
	
	
}
