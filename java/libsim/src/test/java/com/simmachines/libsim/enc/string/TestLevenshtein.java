package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestLevenshtein {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = Levenshtein.distance(str1,str2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Array";
		String str2 = "String";
		double res = Levenshtein.distance(str1,str2);
		Asserts.assertEquals(res,5);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "kitten";
		String str2 = "sitting";
		double res = Levenshtein.distance(str1,str2);
		Asserts.assertEquals(res,3);
	}
	
}
