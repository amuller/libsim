package com.simmachines.libsim.enc.vector;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;


public class TestMahalanobis {

	@Test
	// jfquesada
	public void test01() {
		double[] v1 = new double[] {1, 12, 5};
		double[] v2 = new double[] {1, 12, 5};
		RealMatrix m1 = new Array2DRowRealMatrix(new double [][] { {10.70, -17.95, 1.55}, {-17.95, 44.20, 0.95}, {1.55, 0.95, 3.70} });
		Asserts.assertEqualLength(v1, v2);
		double res = Mahalanobis.distance(m1, v1, v2);
		Asserts.assertEquals(res, 0);
	}
	
	@Test
	// jfquesada
	public void test02() {
		double[] v1 = new double[] {1, 12, 5};
		double[] v2 = new double[] {0, 14, 7};
		RealMatrix m1 = new Array2DRowRealMatrix(new double[][] { {10.70, -17.95, 1.55}, {-17.95, 44.20, 0.95}, {1.55, 0.95, 3.70} });
		Asserts.assertEqualLength(v1, v2);
		double res = Mahalanobis.distance(m1, v1, v2);
		Asserts.assertEquals(res, 1.323220219);
	}
	
	@Test
	// jfquesada
	public void test03() {
		double[] v1 = new double[] {1, 12, 5};
		double[] v2 = new double[] {8, 0, 6};
		RealMatrix m1 = new Array2DRowRealMatrix(new double[][] { {10.70, -17.95, 1.55}, {-17.95, 44.20, 0.95}, {1.55, 0.95, 3.70} });
		Asserts.assertEqualLength(v1, v2);
		double res = Mahalanobis.distance(m1, v1, v2);
		Asserts.assertEquals(res, 2.141290741);
	}
	
	@Test
	// jfquesada
	public void test04() {
		double[] v1 = new double[] {1, 12, 5};
		double[] v2 = new double[] {2, 2, 3};
		RealMatrix m1 = new Array2DRowRealMatrix(new double[][] { {10.70, -17.95, 1.55}, {-17.95, 44.20, 0.95}, {1.55, 0.95, 3.70} });
		Asserts.assertEqualLength(v1, v2);
		double res = Mahalanobis.distance(m1, v1, v2);
		Asserts.assertEquals(res, 2.238505943);
	}
	
	@Test
	// jfquesada
	public void test05() {
		double[] v1 = new double[] {1, 12, 5};
		double[] v2 = new double[] {5, 1, 8};
		RealMatrix m1 = new Array2DRowRealMatrix(new double[][] { {10.70, -17.95, 1.55}, {-17.95, 44.20, 0.95}, {1.55, 0.95, 3.70} });
		Asserts.assertEqualLength(v1, v2);
		double res = Mahalanobis.distance(m1, v1, v2);
		Asserts.assertEquals(res, 2.748198002);
	}
}
