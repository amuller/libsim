package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestHistogramIntersection {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = {8,3,7};
		int[] v2 = {9,8,4};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.16666666666667);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = {8,32,7,0,45};
		int[] v2 = {97,78,41,4,78};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = {248,321,788,0,459};
		int[] v2 = {97,78,417,4,7865};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.42125550660793);
	}
	
	//no zero-vectors allowed
/*	
	@Test
	//jfquesada
	public void test4(){
		int[] v1 = new int[]{0, 0, 0, 0, 0};
		int[] v2 = new int[]{1, 1, 1, 1, 1};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 1.0);
	}
	
	@Test
	//jfquesada
	public void test5(){
		int[] v1 = new int[]{1, 1, 1, 1, 1};
		int[] v2 = new int[]{0, 0, 0, 0, 0};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 1.0);
	}
*/	
	@Test
	//jfquesada
	public void test6(){
		int[] v1 = new int[]{638, 398, 337, 529, 514};
		int[] v2 = new int[]{689, 869, 383, 706, 620};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.0);
	}
	
	@Test
	//jfquesada
	public void test7(){
		int[] v1 = new int[]{1541367828, 950213225, 52610973, 1431957942, 452032515};
		int[] v2 = new int[]{1572602206, 598716249, 536608579, 84359194, 2018058772};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.3837004754259582);
	}
	
	@Test
	//jfquesada
	public void test8(){
		int[] v1 = new int[]{1141454369, 589096141, 922770477, 822465917, 423607600};
		int[] v2 = new int[]{247243949, 375221325, 851955869, 530827397, 1139764455};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = HistogramIntersection.distance(v1, v2);
		Asserts.assertEquals(res, 0.3771196688335898);
	}
	
}
