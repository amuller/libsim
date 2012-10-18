package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestQGram {

	@Test
	//jdsalazar
	public void test1(){
		int q = 2;
		String str1 = "kitten";
		String str2 = "sitting";
		Asserts.assertGreaterThanZero(q);
		Asserts.validate(q<=str1.length(), "the q-gram (substring) length is greater than the string length");
		Asserts.validate(q<=str2.length(), "the q-gram (substring) length is greater than the string length");
		double res = QGram.distance(q,str1,str2);
		Asserts.assertEquals(res, 0.181818182);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int q = 3;
		String str1 = "cooked";
		String str2 = "cooking";
		Asserts.assertGreaterThanZero(q);
		Asserts.validate(q<=str1.length(), "the q-gram (substring) length is greater than the string length");
		Asserts.validate(q<=str2.length(), "the q-gram (substring) length is greater than the string length");
		double res = QGram.distance(q,str1,str2);
		Asserts.assertEquals(res, 0.222222222);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int q = 4;
		String str1 = "running";
		String str2 = "swim";
		Asserts.assertGreaterThanZero(q);
		Asserts.validate(q<=str1.length(), "the q-gram (substring) length is greater than the string length");
		Asserts.validate(q<=str2.length(), "the q-gram (substring) length is greater than the string length");
		double res = QGram.distance(q,str1,str2);
		Asserts.assertEquals(res, 1.2);
	}
	
}
