package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestChapmanOrderedNameCompoundSimilarity {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = ChapmanOrderedNameCompoundSimilarity.distance(str1,str2);
//		Asserts.assertEquals(res, 0.9553572);
	}
	
}
