package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestCultural {

	@Test
	//jdsalazar
	public void test1(){
		double[] v = new double[]{3,7,5,9,6};
		double[] v1 = new double[]{8,3,7,2,5};
		double[] v2 = new double[]{9,8,4,6,1};
		Asserts.assertHasFiveEntries(v1);
		Asserts.assertHasFiveEntries(v2);
		Asserts.assertGreaterThanZero(v);
		double res = Cultural.distance(v, v1, v2);
		Asserts.assertEquals(res, 2.02984126984127);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v = new double[]{64,3,49,92,18};
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		Asserts.assertHasFiveEntries(v1);
		Asserts.assertHasFiveEntries(v2);
		Asserts.assertGreaterThanZero(v);
		double res = Cultural.distance(v, v1, v2);
		Asserts.assertEquals(res, 182.67294162230109);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v = new double[]{421.36,188.94,749.22,654.247,481.177};
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		Asserts.assertHasFiveEntries(v1);
		Asserts.assertHasFiveEntries(v2);
		Asserts.assertGreaterThanZero(v);
		double res = Cultural.distance(v, v1, v2);
		Asserts.assertEquals(res, 22908.21461937366);
	}
	
}
