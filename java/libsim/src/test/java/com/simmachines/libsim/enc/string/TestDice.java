package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestDice {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = Dice.distance(str1,str2);
		Asserts.assertEquals(res, 0.5);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "Test String 1";
		String str2 = "Test String 2";
		double res = Dice.distance(str1,str2);
		Asserts.assertEquals(res, 0.666666666);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "Array";
		String str2 = "String";
		double res = Dice.distance(str1,str2);
		Asserts.assertEquals(res, 0);
	}
	
}
