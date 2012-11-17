package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestSorensen {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Sorensen.distance(v1, v2);
		Asserts.assertEquals(res, 0.23076923076923);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,0,45};
		double[] v2 = new double[]{97,78,41,4,78};
		double res = Sorensen.distance(v1, v2);
		Asserts.assertEquals(res, 0.52820512820513);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,788.14,0.001,459.298};
		double[] v2 = new double[]{97.145,78.658,417.0004,4.02,7865.3594};
		double res = Sorensen.distance(v1, v2);
		Asserts.assertEquals(res, 0.79529570062979);
	}
	
}
