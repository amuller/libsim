package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestBag {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "kitten";
		String str2 = "sitting";
		int res = Bag.distance(str1,str2);
		Asserts.assertEquals(res, 3);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		String str1 = "cooked";
		String str2 = "cooking";
		int res = Bag.distance(str1,str2);
		Asserts.assertEquals(res, 3);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		String str1 = "running";
		String str2 = "swimming";
		int res = Bag.distance(str1,str2);
		Asserts.assertEquals(res, 5);
	}
	
}
