package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestTechnologicalCosine {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = new int[]{8,3,7};
		int[] v2 = new int[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = TechnologicalCosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.11523317145016);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = new int[]{8,-32,7,0,-45};
		int[] v2 = new int[]{97,-78,41,-4,-78};
		Asserts.assertEqualLength(v1, v2);
		double res = TechnologicalCosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.17597282565941);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = new int[]{248,-321,788,0,-459};
		int[] v2 = new int[]{97,-78,417,-4,-7865};
		Asserts.assertEqualLength(v1, v2);
		double res = TechnologicalCosine.distance(v1, v2);
		Asserts.assertEquals(res, 0.492780551664052);
	}
	
}
