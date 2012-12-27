package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestGeneralizedCantor {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double parameter = 0.23;
		double res = GeneralizedCantor.distance(parameter,str1,str2);
		Asserts.assertEquals(res, 0.00000002191462443202032);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test Array";
		String str2 = "Test String";
		double parameter = 0.69;
		double res = GeneralizedCantor.distance(parameter,str1,str2);
		Asserts.assertEquals(res, 0.107918163081);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "Array";
		String str2 = "String";
		double parameter = 0.99;
		double res = GeneralizedCantor.distance(parameter,str1,str2);
		Asserts.assertEquals(res, 0.99);
	}
	
}
