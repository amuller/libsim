package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;


import org.junit.Test;

import com.diapai.ramiel.asserts.Asserts;

public class TestL2 {

	@Test
	public void test1() {
		double[] v1 = new double[]{1, 2, 3, 5, 6};
		double[] v2 = new double[]{7, 8, 9, 0, 1};
		double res = L2.distance(v1, v2);		
		assertTrue((res - 12.569805089976535) <= 0.0001);
	}
	
	
	
	

}
