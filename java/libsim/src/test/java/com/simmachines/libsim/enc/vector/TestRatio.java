package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestRatio {
	
	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.77987421383648);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.36500232354004);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.06756524042459);
	}
	
	@Test
	//jfquesada
	public void test4(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 1, 1, 1, 1};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.0);
	}
	
	@Test
	//jfquesada
	public void test5(){
		double[] v1 = new double[]{1, 1, 1, 1, 1};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.0);
	}
	
	@Test
	//jfquesada
	public void test6(){
		double[] v1 = new double[]{638, 398, 337, 529, 514};
		double[] v2 = new double[]{689, 869, 383, 706, 620};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.8565283357643065);
	}
	
	@Test
	//jfquesada
	public void test7(){
		double[] v1 = new double[]{-2, 6, -4, -8, 5};
		double[] v2 = new double[]{-6, 4, -5, -7, 3};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.8300653594771242);
	}
	
	@Test
	//jfquesada
	public void test8(){
		double[] v1 = new double[]{19415.212429584662, 191257.52282304363, 913239.9167389673, 566196.942598401, 153677.14241202734};
		double[] v2 = new double[]{208269.3339067423, 664207.5606130534, 76527.14625467494, 767410.7016052309, 602059.2951081641};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.3774017527299669);
	}
	
	@Test
	//jfquesada
	public void test9(){
		double[] v1 = new double[]{9.629962536879205E8, -1.6826823387640044E8, -1.172045780576203E8, 6.409943660337736E7, 3.0154528518528813E8};
		double[] v2 = new double[]{3.2714922830083424E8, 5.708280820465017E7, -6.131738568306583E8, -6.433943832389486E8, 8.06844862750207E8};
		Asserts.assertEqualLength(v1, v2);
		double res = Ratio.distance(v1, v2);
		Asserts.assertEquals(res, 0.2845167401830553);
	}
}
