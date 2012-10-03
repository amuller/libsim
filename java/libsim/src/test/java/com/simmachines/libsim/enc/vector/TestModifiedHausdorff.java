package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestModifiedHausdorff {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{3,7,8};
		double[] v2 = new double[]{4,8,9};
		Asserts.assertEqualLength(v1, v2);
		double res = ModifiedHausdorff.distance(v1, v2);
		Asserts.assertEquals(res, 0.666666);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{-45,-32,0,7,8};
		double[] v2 = new double[]{-78,-78,-4,41,97};
		Asserts.assertEqualLength(v1, v2);
		double res = ModifiedHausdorff.distance(v1, v2);
		Asserts.assertEquals(res, 38.4);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{-459.298,-321.574,0.001,248.124,788.14};
		double[] v2 = new double[]{-7865.3594,-78.658,-4.02,97.145,417.0004};
		Asserts.assertEqualLength(v1, v2);
		double res = ModifiedHausdorff.distance(v1, v2);
		Asserts.assertEquals(res, 1550.95236);
	}
	
}
