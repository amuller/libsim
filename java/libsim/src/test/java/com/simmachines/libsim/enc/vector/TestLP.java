package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestLP {

	@Test
	//jdsalazar
	public void test1() {
		double[] v1 = new double[]{8,3,4};
		double[] v2 = new double[]{5,9,7};
		double p = 3;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(p, 1);
		double res = LP.distance(v1, v2,p);
		Asserts.assertEquals(res, 6.46330407009565);
	}
	
	@Test
	//jdsalazar
	public void test2() {
		double[] v1 = new double[]{821,-345,498,-6,-230,-754};
		double[] v2 = new double[]{543,-965,-718,852,-329,97};
		double p = 5.7;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(p, 1);
		double res = LP.distance(v1, v2,p);
		Asserts.assertEquals(res, 1271.46862280352653);
	}
	
	
	@Test
	//jdsalazar
	public void test3() {
		double[] v1 = new double[]{821.04,-345.001,498.15,-6.658,-230.14,-754.34};
		double[] v2 = new double[]{543.27,-965.364,-718.2,852.004,-329.036,97.412};
		double p = 9.435;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(p, 1);
		double res = LP.distance(v1, v2,p);
		Asserts.assertEquals(res, 1225.56826706042989);
	}
	
}
