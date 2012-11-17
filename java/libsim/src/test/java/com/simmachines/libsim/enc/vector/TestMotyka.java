package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestMotyka {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Motyka.distance(v1, v2);
		Asserts.assertEquals(res, 0.38461538461539);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,0,45};
		double[] v2 = new double[]{97,78,41,4,78};
		double res = Motyka.distance(v1, v2);
		Asserts.assertEquals(res, 0.23589743589744);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,788.14,0.001,459.298};
		double[] v2 = new double[]{97.145,78.658,417.0004,4.02,7865.3594};
		double res = Motyka.distance(v1, v2);
		Asserts.assertEquals(res, 0.10235136375463);
	}
	
}
