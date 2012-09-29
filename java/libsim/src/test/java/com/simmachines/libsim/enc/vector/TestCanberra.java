package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestCanberra {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 0.78609625668449);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 3.24242688206103);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 3.2418346975244);
	}
	
	@Test
	//jfquesada
	public void test4(){
		double[] v1 = new double[]{1, 5, 8, 4};
		double[] v2 = new double[]{3, 10, 9, 6};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 1.092156863);
	}
	
	@Test
	//jfquesada
	public void test5(){
		double[] v1 = new double[]{-5, 15, 5, -1};
		double[] v2 = new double[]{3, -8, -3, 1};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 4);
	}
	
	@Test
	//jfquesada
	public void test6(){
		double[] v1 = new double[]{-5, -8, -3, -4};
		double[] v2 = new double[]{-3, -10, -2, -8};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 0.894444444);
	}
	
	@Test
	//jfquesada
	public void test7(){
		double[] v1 = new double[]{-3.5, -47.83, 3.97, 50.2};
		double[] v2 = new double[]{10.95, 88.52, -8.4, 38.7};
		Asserts.assertEqualLength(v1, v2);
		double res = Canberra.distance(v1, v2);
		Asserts.assertEquals(res, 3.12935883);
	}
}
