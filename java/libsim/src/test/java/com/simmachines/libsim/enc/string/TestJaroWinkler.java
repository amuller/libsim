package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestJaroWinkler {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = JaroWinkler.distance(str1,str2);
		Asserts.assertEquals(res, 0.9777778);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test Array";
		String str2 = "Test String";
		double res = JaroWinkler.distance(str1,str2);
		Asserts.assertEquals(res, 0.85757575757576);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "Array";
		String str2 = "String";
		double res = JaroWinkler.distance(str1,str2);
		Asserts.assertEquals(res, 0.45555555555556);
	}
	
}
