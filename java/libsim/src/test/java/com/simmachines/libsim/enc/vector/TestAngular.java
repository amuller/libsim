package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestAngular {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 0.48480288506896);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 0.60231338113778);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 1.0387190997679);
	}
	
	@Test
	//jfquesada
	public void test4(){
		double[] v1 = new double[]{5, 8, 4, 1};
		double[] v2 = new double[]{10, 90, 4, 3};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 0.564233312);
	}
	
	@Test
	//jfquesada
	public void test5(){
		double[] v1 = new double[]{-1, 50, -607, -4, 55};
		double[] v2 = new double[]{0, 47, 0, 48, -4};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 1.523689502);
	}
	
	@Test
	//jfquesada
	public void test6(){
		double[] v1 = new double[]{10.233, 37.87, -30.806};
		double[] v2 = new double[]{11.69, -24.556, 72.158};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 2.479339066);
	}
	
	@Test
	//jfquesada
	public void test7(){
		double[] v1 = new double[]{542.479, 709.32, -571.142, 305.37, 4.213};
		double[] v2 = new double[]{-27.638, -362.329, 278.404, -855.669, -905.833};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 2.066171131);
	}
	
	@Test
	//jfquesada
	public void test8(){
		double[] v1 = new double[]{3, 5, 8};
		double[] v2 = new double[]{0, 0, 0};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 1.570796327);
	}
	
	@Test
	//jfquesada
	public void test9(){
		double[] v1 = new double[]{3, 5, 8};
		double[] v2 = new double[]{3, 5, 8};
		Asserts.assertEqualLength(v1, v2);
		double res = Angular.distance(v1, v2);
		Asserts.assertEquals(res, 0);
	}
	
}
