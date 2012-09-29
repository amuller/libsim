package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestCosine {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.11523317145016);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.17597282565941);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.49267550457359);
	}
	
	@Test
	//jfquesada
	public void test4(){
		double[] v1 = new double[]{3, 5, 8};
		double[] v2 = new double[]{4, 7, 1};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.316123494);
	}
	
	@Test
	//jfquesada
	public void test5(){
		double[] v1 = new double[]{3, -5, 8};
		double[] v2 = new double[]{4, 7, 1};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 1.186511774);
	}
	
	@Test
	//jfquesada
	public void test6(){
		double[] v1 = new double[]{3, 5, 8};
		double[] v2 = new double[]{3, 5, 8};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.0);
	}
	
	@Test
	//jfquesada
	public void test7(){
		double[] v1 = new double[]{-3, -5, -8};
		double[] v2 = new double[]{0, 0, 0};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jfquesada
	public void test8(){
		double[] v1 = new double[]{-3, -5, -8};
		double[] v2 = new double[]{3, 5, 8};
		Asserts.assertEqualLength(v1, v2);
		double res = Cosine.distance(v1, v2);
		Asserts.assertEquals(res, 2);
	}
}
