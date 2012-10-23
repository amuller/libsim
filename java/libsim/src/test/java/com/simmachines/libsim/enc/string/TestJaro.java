package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestJaro {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = Jaro.distance(str1,str2);
		Asserts.assertEquals(res, 0.9444445);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test Array";
		String str2 = "Test String";
		double res = Jaro.distance(str1,str2);
		Asserts.assertEquals(res, 0.71515151515152);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "Array";
		String str2 = "String";
		double res = Jaro.distance(str1,str2);
		Asserts.assertEquals(res, 0.45555555555556);
	}
	
}
