package com.simmachines.libsim.enc.vector;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestPixel {

	@Test
	//jdsalazar
	public void test1(){
		double[][] m1 = {{1,0,1},{0,1,1},{1,1,1}};
		double[][] m2 = {{0,1,1},{0,0,1},{1,0,1}};
		Asserts.assertEqualLength(m1, m2);
		Asserts.assertIsBinary(m1);
		Asserts.assertIsBinary(m2);
		RealMatrix rm1 = new Array2DRowRealMatrix(m1);
		RealMatrix rm2 = new Array2DRowRealMatrix(m2);
		double res = Pixel.distance(rm1, rm2);
		Asserts.assertEquals(res, 8);
	}
	
	
	@Test
	//jdsalazar
	public void test2(){
		double[][] m1 = {{1,0,1,0,1},{0,0,0,1,1},{1,0,1,1,1},{1,1,1,1,1},{0,1,1,0,1}};
		double[][] m2 = {{1,1,1,1,0},{1,1,0,1,0},{1,1,1,0,1},{0,0,1,0,1},{1,0,1,1,1}};
		Asserts.assertEqualLength(m1, m2);
		Asserts.assertIsBinary(m1);
		Asserts.assertIsBinary(m2);
		RealMatrix rm1 = new Array2DRowRealMatrix(m1);
		RealMatrix rm2 = new Array2DRowRealMatrix(m2);
		double res = Pixel.distance(rm1, rm2);
		Asserts.assertEquals(res, 29);
	}
	
	
	@Test
	//jdsalazar
	public void test3(){
		double[][] m1 = {{1,0,1,0,1,1,1,0},{1,1,1,0,0,0,1,1},{1,0,0,1,0,1,1,1},{1,0,1,1,1,1,1,1},{1,0,1,0,1,1,0,1}};
		double[][] m2 = {{1,1,1,1,0,0,0,1},{1,0,0,1,1,0,1,0},{0,1,1,1,1,1,0,1},{1,1,1,0,0,1,0,1},{1,0,1,0,1,1,1,1}};
		Asserts.assertEqualLength(m1, m2);
		Asserts.assertIsBinary(m1);
		Asserts.assertIsBinary(m2);
		RealMatrix rm1 = new Array2DRowRealMatrix(m1);
		RealMatrix rm2 = new Array2DRowRealMatrix(m2);
		double res = Pixel.distance(rm1, rm2);
		Asserts.assertEquals(res, 42);
	}
	
}
