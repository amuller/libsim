package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPearsonCorrelation {

	@Test
	//jdsalazar
	public void test1() {

		double[] v1 = new double[]{8,3,4};
		double[] v2 = new double[]{9,8,4};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue((res - 0.5) <= 0.0001);
	}
	
	@Test
	//jdsalazar
	public void test2() {

		double[] v1 = new double[]{17,8,11};
		double[] v2 = new double[]{12,7,8};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue((res - 0.010256681389212985) <= 0.0001);
	}
	
}
