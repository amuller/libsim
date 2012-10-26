package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestLevenshteinSM {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = LevenshteinSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.9166667);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Array";
		String str2 = "String";
		double res = LevenshteinSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.16666666666667);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "kitten";
		String str2 = "sitting";
		double res = LevenshteinSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.57142857142857);
	}
	
}
