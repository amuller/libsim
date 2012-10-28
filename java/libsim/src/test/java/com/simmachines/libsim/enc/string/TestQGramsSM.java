package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestQGramsSM {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = QGramsSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.78571427);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test String 1";
		String str2 = "Test String 2";
		double res = QGramsSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.8);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "String";
		String str2 = "Test String";
		double res = QGramsSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.57142857142857);
	}
	
}
