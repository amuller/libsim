package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestBaire {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = Baire.distance(str1,str2);
		Asserts.assertEquals(res, 0.083333333);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test Array";
		String str2 = "Test String";
		double res = Baire.distance(str1,str2);
		Asserts.assertEquals(res, 0.166666667);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "Array";
		String str2 = "String";
		double res = Baire.distance(str1,str2);
		Asserts.assertEquals(res, 1);
	}
	
}
