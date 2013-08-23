package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestRoberts {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Roberts.distance(v1, v2);
		Asserts.assertEquals(res, 0.65440577940578);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,32,7,1,45};
		double[] v2 = new double[]{97,78,41,4,78};
		double res = Roberts.distance(v1, v2);
		Asserts.assertEquals(res, 0.34320884745626);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,321.574,788.14,0.001,459.298};
		double[] v2 = new double[]{97.145,78.658,417.0004,4.02,7865.3594};
		double res = Roberts.distance(v1, v2);
		Asserts.assertEquals(res, 0.13199605617728);
	}

	//jxwang+jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double res = Roberts.distance(v1, v2);
		double ref = 0.0;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = Roberts.distance(v1, v2);
		double ref = 0.0;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{8, 6, 9, 0, 8, 8, 5, 1, 8, 2};
		double[] v2 = new double[]{1, 2, 1, 4, 5, 7, 3, 8, 3, 1};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4189197530864198;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{8, 6, 9, 0, 8, 8, 5, 1, 8, 2};
		double[] v2 = new double[]{1, 2, 1, 4, 5, 7, 3, 8, 3, 1};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4189197530864198;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{8, 6, 9, 0, 8, 8, 5, 1, 8, 2};
		double[] v2 = new double[]{1, 2, 1, 4, 5, 7, 3, 8, 3, 1};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4189197530864198;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{294, 605, 211, 175, 478, 555, 237, 850, 237, 364};
		double[] v2 = new double[]{601, 435, 718, 239, 429, 965, 137, 148, 798, 533};
		double res = Roberts.distance(v1, v2);
		double ref = 0.5283483101208519;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{294, 605, 211, 175, 478, 555, 237, 850, 237, 364};
		double[] v2 = new double[]{601, 435, 718, 239, 429, 965, 137, 148, 798, 533};
		double res = Roberts.distance(v1, v2);
		double ref = 0.5283483101208519;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{294, 605, 211, 175, 478, 555, 237, 850, 237, 364};
		double[] v2 = new double[]{601, 435, 718, 239, 429, 965, 137, 148, 798, 533};
		double res = Roberts.distance(v1, v2);
		double ref = 0.5283483101208519;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{931716, 67208, 467327, 86914, 19472, 894356, 766242, 663749, 890752, 372984};
		double[] v2 = new double[]{336765, 499217, 422284, 907254, 718963, 365024, 108596, 698838, 332542, 835097};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4219688902584921;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{931716, 67208, 467327, 86914, 19472, 894356, 766242, 663749, 890752, 372984};
		double[] v2 = new double[]{336765, 499217, 422284, 907254, 718963, 365024, 108596, 698838, 332542, 835097};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4219688902584921;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{931716, 67208, 467327, 86914, 19472, 894356, 766242, 663749, 890752, 372984};
		double[] v2 = new double[]{336765, 499217, 422284, 907254, 718963, 365024, 108596, 698838, 332542, 835097};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4219688902584921;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}



	@Test
	//jxwang+jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{7.364858839218932, 1.681033056213912, 2.8205103995348124, 7.865764610173953, 7.543475655590937, 3.836304327223318, 0.3980625841027918, 9.95213480624082, 2.4765494337157157, 1.9170983244374507};
		double[] v2 = new double[]{8.623578326570145, 0.9236829039477923, 3.8147511690775127, 7.432668906179073, 2.4559386526899676, 0.8467132881508443, 4.718289570673527, 6.507787746430772, 5.627200321051045, 4.187219974430247};
		double res = Roberts.distance(v1, v2);
		double ref = 0.6186511550296465;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{7.364858839218932, 1.681033056213912, 2.8205103995348124, 7.865764610173953, 7.543475655590937, 3.836304327223318, 0.3980625841027918, 9.95213480624082, 2.4765494337157157, 1.9170983244374507};
		double[] v2 = new double[]{8.623578326570145, 0.9236829039477923, 3.8147511690775127, 7.432668906179073, 2.4559386526899676, 0.8467132881508443, 4.718289570673527, 6.507787746430772, 5.627200321051045, 4.187219974430247};
		double res = Roberts.distance(v1, v2);
		double ref = 0.6186511550296465;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{7.364858839218932, 1.681033056213912, 2.8205103995348124, 7.865764610173953, 7.543475655590937, 3.836304327223318, 0.3980625841027918, 9.95213480624082, 2.4765494337157157, 1.9170983244374507};
		double[] v2 = new double[]{8.623578326570145, 0.9236829039477923, 3.8147511690775127, 7.432668906179073, 2.4559386526899676, 0.8467132881508443, 4.718289570673527, 6.507787746430772, 5.627200321051045, 4.187219974430247};
		double res = Roberts.distance(v1, v2);
		double ref = 0.6186511550296465;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{162.729843078934, 734.2260085830886, 462.67531468064095, 696.4679473590778, 349.11498684325295, 570.622455358849, 804.9217042605105, 827.5395540568117, 586.0563475658403, 978.3796108596092};
		double[] v2 = new double[]{928.1241590331782, 998.3313100250298, 127.95816096201939, 416.39458296751786, 656.6812400126654, 14.378883532849883, 801.0188518494133, 32.632879761448905, 211.7639912016973, 155.58885237703046};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4701879189234213;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{162.729843078934, 734.2260085830886, 462.67531468064095, 696.4679473590778, 349.11498684325295, 570.622455358849, 804.9217042605105, 827.5395540568117, 586.0563475658403, 978.3796108596092};
		double[] v2 = new double[]{928.1241590331782, 998.3313100250298, 127.95816096201939, 416.39458296751786, 656.6812400126654, 14.378883532849883, 801.0188518494133, 32.632879761448905, 211.7639912016973, 155.58885237703046};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4701879189234213;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{162.729843078934, 734.2260085830886, 462.67531468064095, 696.4679473590778, 349.11498684325295, 570.622455358849, 804.9217042605105, 827.5395540568117, 586.0563475658403, 978.3796108596092};
		double[] v2 = new double[]{928.1241590331782, 998.3313100250298, 127.95816096201939, 416.39458296751786, 656.6812400126654, 14.378883532849883, 801.0188518494133, 32.632879761448905, 211.7639912016973, 155.58885237703046};
		double res = Roberts.distance(v1, v2);
		double ref = 0.4701879189234213;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{628055.3894550349, 758111.1441554433, 112463.58267434209, 673135.9238536886, 496857.7428377833, 409566.67227684153, 227846.18071636287, 452349.841677829, 191562.66677040447, 237734.33584185844};
		double[] v2 = new double[]{372156.2695029629, 167672.67691225317, 791105.1109882209, 738033.4607354106, 223107.04386183966, 463774.29978737194, 779626.7321563041, 826600.7818191625, 887140.4758374646, 311172.2446065307};
		double res = Roberts.distance(v1, v2);
		double ref = 0.5082172121969708;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{628055.3894550349, 758111.1441554433, 112463.58267434209, 673135.9238536886, 496857.7428377833, 409566.67227684153, 227846.18071636287, 452349.841677829, 191562.66677040447, 237734.33584185844};
		double[] v2 = new double[]{372156.2695029629, 167672.67691225317, 791105.1109882209, 738033.4607354106, 223107.04386183966, 463774.29978737194, 779626.7321563041, 826600.7818191625, 887140.4758374646, 311172.2446065307};
		double res = Roberts.distance(v1, v2);
		double ref = 0.5082172121969708;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{628055.3894550349, 758111.1441554433, 112463.58267434209, 673135.9238536886, 496857.7428377833, 409566.67227684153, 227846.18071636287, 452349.841677829, 191562.66677040447, 237734.33584185844};
		double[] v2 = new double[]{372156.2695029629, 167672.67691225317, 791105.1109882209, 738033.4607354106, 223107.04386183966, 463774.29978737194, 779626.7321563041, 826600.7818191625, 887140.4758374646, 311172.2446065307};
		double res = Roberts.distance(v1, v2);
		double ref = 0.5082172121969708;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

}
