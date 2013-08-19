package com.simmachines.libsim.enc.binary;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestBaroniUrbaniBuser {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = new int[]{1,0,1};
		int[] v2 = new int[]{1,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = BaroniUrbaniBuser.distance(v1, v2);
		Asserts.assertEquals(res, 0.6666666);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = new int[]{1,1,0,0};
		int[] v2 = new int[]{0,1,0,1};
		Asserts.assertEqualLength(v1, v2);
		double res = BaroniUrbaniBuser.distance(v1, v2);
		Asserts.assertEquals(res, 0.5);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = new int[]{1,0,0,1,1};
		int[] v2 = new int[]{1,1,0,1,0};
		Asserts.assertEqualLength(v1, v2);
		double res = BaroniUrbaniBuser.distance(v1, v2);
		Asserts.assertEquals(res, 0.369398063);
	}
	
}
