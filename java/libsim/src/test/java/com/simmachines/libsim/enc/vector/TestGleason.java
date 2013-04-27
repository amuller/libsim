package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestGleason {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Gleason.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,0,45};
		double[] v2 = new double[]{97,0,41,4,78};
		double res = Gleason.distance(v1, v2);
		Asserts.assertEquals(res, 0.884615385);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,0,0.001,0};
		double[] v2 = new double[]{0,78.658,417.0004,4.02,0};
		double res = Gleason.distance(v1, v2);
		Asserts.assertEquals(res, 0.378026504);
	}
	
}