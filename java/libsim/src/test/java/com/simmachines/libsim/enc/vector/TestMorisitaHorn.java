package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestMorisitaHorn {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = MorisitaHorn.distance(v1, v2);
		Asserts.assertEquals(res, 0.884661117717);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,0,45};
		double[] v2 = new double[]{97,78,41,4,78};
		Asserts.assertEqualLength(v1, v2);
		double res = MorisitaHorn.distance(v1, v2);
		Asserts.assertEquals(res, 0.81125161207014);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,788.14,0.001,459.298};
		double[] v2 = new double[]{97.145,78.658,417.0004,4.02,7865.3594};
		Asserts.assertEqualLength(v1, v2);
		double res = MorisitaHorn.distance(v1, v2);
		Asserts.assertEquals(res, 0.44417795356709);
	}
	
}
