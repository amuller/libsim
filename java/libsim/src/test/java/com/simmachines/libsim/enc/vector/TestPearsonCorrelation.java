package com.simmachines.libsim.enc.vector;

import static org.junit.Assert.*;

import org.junit.Test;

import com.simmachines.libsim.common.CommonChecks;

public class TestPearsonCorrelation {

	@Test
	//jdsalazar
	public void test1() {

		double[] v1 = new double[]{8,3,4};
		double[] v2 = new double[]{9,8,4};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue(CommonChecks.equals(res, 0.5));
	}
	
	@Test
	//jdsalazar
	public void test2() {

		double[] v1 = new double[]{17,8,11};
		double[] v2 = new double[]{12,7,8};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue(CommonChecks.equals(res, 0.010256681389212985));
	}
	
	@Test
	//jfquesada
	public void test03() {
		double[] v1 = new double[]{5, 3, 7, 4, 9, 3, 4, 2};
		double[] v2 = new double[]{2, 6, 3, 8, 4, 8, 2, 4};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue(CommonChecks.equals(res, 1.3546783878));
	}
	
	@Test
	//jfquesada
	public void test04() {
		double[] v1 = new double[]{502, 300, 60, 2539, 345, 233, 464, 3792};
		double[] v2 = new double[]{283, 286, 376, 8263, 2737, 9273, 726, 927};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue(CommonChecks.equals(res, 0.8703377566));
	}
	
	@Test
	//jfquesada
	public void test05() {
		double[] v1 = new double[]{0.05, 3, 0.7, 0.24, 9.3, 3, 4.1, 2.003};
		double[] v2 = new double[]{0.2, 0.06, 3, 2.8, 4.3, 3.8, 0.42, 4.9};
		double res = PearsonCorrelation.distance(v1, v2);
		assertTrue(CommonChecks.equals(res, 0.7226769102));
	}
}
