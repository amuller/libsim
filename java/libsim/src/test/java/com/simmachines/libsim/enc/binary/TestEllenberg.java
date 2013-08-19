package com.simmachines.libsim.enc.binary;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;
import com.simmachines.libsim.enc.vector.Ellenberg;

public class TestEllenberg {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Ellenberg.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,0,45};
		double[] v2 = new double[]{97,0,41,4,78};
		double res = Ellenberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.793103448);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,0,0.001,0};
		double[] v2 = new double[]{0,78.658,417.0004,4.02,0};
		double res = Ellenberg.distance(v1, v2);
		Asserts.assertEquals(res, 0.233065771);
	}
	
}