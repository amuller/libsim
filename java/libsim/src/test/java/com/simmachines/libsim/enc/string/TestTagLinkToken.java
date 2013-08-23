package com.simmachines.libsim.enc.string;

import org.junit.Test;
//import com.simmachines.libsim.asserts.Asserts;

public class TestTagLinkToken {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = TagLinkToken.distance(str1,str2);
		// Asserts.assertEquals(res, 0.9166667);
		// TODO: check this result
	}
	
}
