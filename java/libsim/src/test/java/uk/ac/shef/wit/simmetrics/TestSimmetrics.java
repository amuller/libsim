package uk.ac.shef.wit.simmetrics;

import junit.textui.TestRunner;

import org.junit.Test;

public class TestSimmetrics {

	@Test
	public void test(){
		junit.textui.TestRunner runner = new junit.textui.TestRunner();
		TestRunner.run(runner.getTest(uk.ac.shef.wit.simmetrics.TestSuite.class.getName()));
	}
	
}
