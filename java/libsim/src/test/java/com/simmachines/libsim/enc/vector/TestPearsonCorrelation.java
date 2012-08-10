package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPearsonCorrelation {

	@Test
	public void test1() {

		double[] v1 = new double[]{1, 2, 3, 5, 6};
		double[] v2 = new double[]{7, 8, 9, 0, 1};
		double res = PearsonCorrelation.distance(v1, v2);
		System.out.println("res = "+res);
		assertTrue((res - res) <= 0.0001);
	}
	
}
