package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestSmithWaterman {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = SmithWaterman.distance(str1,str2);
		Asserts.assertEquals(res, 0.9166667);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test String 1";
		String str2 = "Test String 2";
		double res = SmithWaterman.distance(str1,str2);
		Asserts.assertEquals(res, 0.92307692307692);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "String";
		String str2 = "Test String";
		double res = SmithWaterman.distance(str1,str2);
		Asserts.assertEquals(res, 1);
	}
	
	@Test
	//jdsalazar
	public void test4(){
		String str1 = "String";
		String str2 = "Array";
		double res = SmithWaterman.distance(str1,str2);
		Asserts.assertEquals(res, 0.2);
	}
	
}
