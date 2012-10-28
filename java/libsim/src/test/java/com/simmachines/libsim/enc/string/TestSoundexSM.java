package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestSoundexSM {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = SoundexSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.95555555555556);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test String";
		String str2 = "Test Array";
		double res = SoundexSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.86666666666667);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "String";
		String str2 = "Array";
		double res = SoundexSM.distance(str1,str2);
		Asserts.assertEquals(res, 0.55555555555556);
	}
	
}
