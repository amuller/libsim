package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestPerception {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{0.2,0.5,0.3};
		double p1 = 0.3;
		double[] v2 = new double[]{0.4,0.1,0.5};
		double p2 = 0.5;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertSumAllEntriesEqualToOne(v1);
		Asserts.assertSumAllEntriesEqualToOne(v2);
		double res = Perception.distance(v1, p1, v2, p2);
		Asserts.assertEquals(res, 2);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{0.2,0.1,0.3,0.4};
		double p1 = 0.33;
		double[] v2 = new double[]{0.2,0.1,0.6,0.1};
		double p2 = 0.25;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertSumAllEntriesEqualToOne(v1);
		Asserts.assertSumAllEntriesEqualToOne(v2);
		double res = Perception.distance(v1, p1, v2, p2);
		Asserts.assertEquals(res, 4.47230929989551);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{0.22,0.17,0.26,0.28,0.07};
		double p1 = 0.12;
		double[] v2 = new double[]{0.41,0.16,0.11,0.05,0.27};
		double p2 = 0.39;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertSumAllEntriesEqualToOne(v1);
		Asserts.assertSumAllEntriesEqualToOne(v2);
		double res = Perception.distance(v1, p1, v2, p2);
		Asserts.assertEquals(res, 11.73956762192056);
	}
	
}
