package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestRMSLogSpectral {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double res = RMSLogSpectral.distance(v1, v2);
		Asserts.assertEquals(res, 0.65550710577346);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,1,45};
		double[] v2 = new double[]{97,78,41,4,78};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double res = RMSLogSpectral.distance(v1, v2);
		Asserts.assertEquals(res, 1.57284417518002);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,788.14,0.001,459.298};
		double[] v2 = new double[]{97.145,78.658,417.0004,4.02,7865.3594};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterThanZero(v1);
		Asserts.assertGreaterThanZero(v2);
		double res = RMSLogSpectral.distance(v1, v2);
		Asserts.assertEquals(res, 4.00524567790615);
	}
	
}
