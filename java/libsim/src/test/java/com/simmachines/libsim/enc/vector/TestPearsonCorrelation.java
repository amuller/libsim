package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPearsonCorrelation {

	@Test
	public void test1() {

		double[] v1 = new double[]{8,3,4};
		double[] v2 = new double[]{9,8,4};
		double res = PearsonCorrelation.distance(v1, v2);
		System.out.println("res = "+res);
		assertTrue((res - (0.5)) <= 0.0001);
	}
	
}
