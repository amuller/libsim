package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestPharmacological {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 5.91607978309962);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 110.89634800118532);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 7420.86983265412896);
	}
	
	@Test
	//jfquesada
	public void test4(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 1, 1, 1, 1};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 2.23606797749979);
	}
	
	@Test
	//jfquesada
	public void test5(){
		double[] v1 = new double[]{1, 1, 1, 1, 1};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 2.23606797749979);
	}
	
	@Test
	//jfquesada
	public void test6(){
		double[] v1 = new double[]{638, 398, 337, 529, 514};
		double[] v2 = new double[]{689, 869, 383, 706, 620};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 518.7706622391054);
	}
	
	@Test
	//jfquesada
	public void test7(){
		double[] v1 = new double[]{-2, 6, -4, -8, 5};
		double[] v2 = new double[]{-6, 4, -5, -7, 3};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 5.0990195135927845);
	}
	
	@Test
	//jfquesada
	public void test8(){
		double[] v1 = new double[]{19415.212429584662, 191257.52282304363, 913239.9167389673, 566196.942598401, 153677.14241202734};
		double[] v2 = new double[]{208269.3339067423, 664207.5606130534, 76527.14625467494, 767410.7016052309, 602059.2951081641};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		double ref = 1095887.4985170974;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	@Test
	//jfquesada
	public void test9(){
		double[] v1 = new double[]{9.629962536879205E8, -1.6826823387640044E8, -1.172045780576203E8, 6.409943660337736E7, 3.0154528518528813E8};
		double[] v2 = new double[]{3.2714922830083424E8, 5.708280820465017E7, -6.131738568306583E8, -6.433943832389486E8, 8.06844862750207E8};
		Asserts.assertEqualLength(v1, v2);
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1.2070398607956738E9);
	}
	
	@Test
	//jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double res = Pharmacological.distance(v1, v2);
		double ref = 7.416198487095663;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = Pharmacological.distance(v1, v2);
		double ref = 7.416198487095663;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{9, 0, 7, 0, 7, 9, 3, 1, 4, 6};
		double[] v2 = new double[]{9, 5, 9, 6, 3, 4, 9, 5, 5, 2};
		double res = Pharmacological.distance(v1, v2);
		double ref = 13.228756555322953;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{9, 0, 7, 0, 7, 9, 3, 1, 4, 6};
		double[] v2 = new double[]{9, 5, 9, 6, 3, 4, 9, 5, 5, 2};
		double res = Pharmacological.distance(v1, v2);
		double ref = 13.228756555322953;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{9, 0, 7, 0, 7, 9, 3, 1, 4, 6};
		double[] v2 = new double[]{9, 5, 9, 6, 3, 4, 9, 5, 5, 2};
		double res = Pharmacological.distance(v1, v2);
		double ref = 13.228756555322953;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{225, 409, 457, 150, 911, 511, 46, 71, 624, 183};
		double[] v2 = new double[]{105, 990, 434, 116, 481, 67, 677, 560, 884, 638};
		double res = Pharmacological.distance(v1, v2);
		double ref = 1283.5844343088615;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{225, 409, 457, 150, 911, 511, 46, 71, 624, 183};
		double[] v2 = new double[]{105, 990, 434, 116, 481, 67, 677, 560, 884, 638};
		double res = Pharmacological.distance(v1, v2);
		double ref = 1283.5844343088615;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{225, 409, 457, 150, 911, 511, 46, 71, 624, 183};
		double[] v2 = new double[]{105, 990, 434, 116, 481, 67, 677, 560, 884, 638};
		double res = Pharmacological.distance(v1, v2);
		double ref = 1283.5844343088615;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{630665, 770623, 842345, 374581, 758958, 27495, 651919, 223576, 167276, 886831};
		double[] v2 = new double[]{92901, 84318, 38972, 921072, 202252, 440822, 77306, 339670, 646861, 333933};
		double res = Pharmacological.distance(v1, v2);
		double ref = 1750537.6115725134;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{630665, 770623, 842345, 374581, 758958, 27495, 651919, 223576, 167276, 886831};
		double[] v2 = new double[]{92901, 84318, 38972, 921072, 202252, 440822, 77306, 339670, 646861, 333933};
		double res = Pharmacological.distance(v1, v2);
		double ref = 1750537.6115725134;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{630665, 770623, 842345, 374581, 758958, 27495, 651919, 223576, 167276, 886831};
		double[] v2 = new double[]{92901, 84318, 38972, 921072, 202252, 440822, 77306, 339670, 646861, 333933};
		double res = Pharmacological.distance(v1, v2);
		double ref = 1750537.6115725134;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{3, 1, 0, 4, -6, 6, 5, 9, 0, -8};
		double[] v2 = new double[]{9, 2, 0, 3, 4, 3, -1, 8, -3, 6};
		double res = Pharmacological.distance(v1, v2);
		double ref = 19.72308292331602;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{3, 1, 0, 4, -6, 6, 5, 9, 0, -8};
		double[] v2 = new double[]{9, 2, 0, 3, 4, 3, -1, 8, -3, 6};
		double res = Pharmacological.distance(v1, v2);
		double ref = 19.72308292331602;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{3, 1, 0, 4, -6, 6, 5, 9, 0, -8};
		double[] v2 = new double[]{9, 2, 0, 3, 4, 3, -1, 8, -3, 6};
		double res = Pharmacological.distance(v1, v2);
		double ref = 19.72308292331602;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{526, 346, -308, 134, 850, -269, -272, 850, -856, 185};
		double[] v2 = new double[]{-895, 996, -125, -236, -84, -767, 532, 534, -291, -134};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2213.5374403881224;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{526, 346, -308, 134, 850, -269, -272, 850, -856, 185};
		double[] v2 = new double[]{-895, 996, -125, -236, -84, -767, 532, 534, -291, -134};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2213.5374403881224;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{526, 346, -308, 134, 850, -269, -272, 850, -856, 185};
		double[] v2 = new double[]{-895, 996, -125, -236, -84, -767, 532, 534, -291, -134};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2213.5374403881224;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{-448314, 914428, 912532, -778402, 739673, -930615, 452359, -673750, -846107, 200428};
		double[] v2 = new double[]{-403405, 42704, 494061, -472700, 997457, -683863, -846622, -24735, 264541, 905744};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2235489.2371935053;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{-448314, 914428, 912532, -778402, 739673, -930615, 452359, -673750, -846107, 200428};
		double[] v2 = new double[]{-403405, 42704, 494061, -472700, 997457, -683863, -846622, -24735, 264541, 905744};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2235489.2371935053;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test20(){
		double[] v1 = new double[]{-448314, 914428, 912532, -778402, 739673, -930615, 452359, -673750, -846107, 200428};
		double[] v2 = new double[]{-403405, 42704, 494061, -472700, 997457, -683863, -846622, -24735, 264541, 905744};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2235489.2371935053;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{7.555838031796539, 1.3987257238849016, 5.157790811549003, 2.5442496923358613, 4.812267670731268, 0.7225640796829969, 1.1003166207587245, 5.5557446490577655, 7.463172732626056, 1.0665379332516567};
		double[] v2 = new double[]{7.080420648251938, 5.802875186833526, 6.2455536577307935, 0.7166412607027473, 2.5124847994663115, 8.813887910609797, 8.433199274669628, 7.385259106712273, 1.2476401153784533, 0.12705053857139714};
		double res = Pharmacological.distance(v1, v2);
		double ref = 13.839733769440468;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{7.555838031796539, 1.3987257238849016, 5.157790811549003, 2.5442496923358613, 4.812267670731268, 0.7225640796829969, 1.1003166207587245, 5.5557446490577655, 7.463172732626056, 1.0665379332516567};
		double[] v2 = new double[]{7.080420648251938, 5.802875186833526, 6.2455536577307935, 0.7166412607027473, 2.5124847994663115, 8.813887910609797, 8.433199274669628, 7.385259106712273, 1.2476401153784533, 0.12705053857139714};
		double res = Pharmacological.distance(v1, v2);
		double ref = 13.839733769440468;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{7.555838031796539, 1.3987257238849016, 5.157790811549003, 2.5442496923358613, 4.812267670731268, 0.7225640796829969, 1.1003166207587245, 5.5557446490577655, 7.463172732626056, 1.0665379332516567};
		double[] v2 = new double[]{7.080420648251938, 5.802875186833526, 6.2455536577307935, 0.7166412607027473, 2.5124847994663115, 8.813887910609797, 8.433199274669628, 7.385259106712273, 1.2476401153784533, 0.12705053857139714};
		double res = Pharmacological.distance(v1, v2);
		double ref = 13.839733769440468;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{579.9038267883344, 725.5140261559268, 813.9428965606909, 215.73348926215107, 870.0510224488556, 186.70488012245545, 900.4978380295041, 9.650356759145161, 418.4988284824366, 844.587524746395};
		double[] v2 = new double[]{409.0629841604363, 719.2363489864708, 957.6739790582386, 852.7579270760389, 324.66782637141023, 480.17804626169345, 813.3867337825765, 307.94038211473253, 567.4072181811749, 672.3372496236827};
		double res = Pharmacological.distance(v1, v2);
		double ref = 993.8124775369779;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{579.9038267883344, 725.5140261559268, 813.9428965606909, 215.73348926215107, 870.0510224488556, 186.70488012245545, 900.4978380295041, 9.650356759145161, 418.4988284824366, 844.587524746395};
		double[] v2 = new double[]{409.0629841604363, 719.2363489864708, 957.6739790582386, 852.7579270760389, 324.66782637141023, 480.17804626169345, 813.3867337825765, 307.94038211473253, 567.4072181811749, 672.3372496236827};
		double res = Pharmacological.distance(v1, v2);
		double ref = 993.8124775369779;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{579.9038267883344, 725.5140261559268, 813.9428965606909, 215.73348926215107, 870.0510224488556, 186.70488012245545, 900.4978380295041, 9.650356759145161, 418.4988284824366, 844.587524746395};
		double[] v2 = new double[]{409.0629841604363, 719.2363489864708, 957.6739790582386, 852.7579270760389, 324.66782637141023, 480.17804626169345, 813.3867337825765, 307.94038211473253, 567.4072181811749, 672.3372496236827};
		double res = Pharmacological.distance(v1, v2);
		double ref = 993.8124775369779;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{5311.971957231986, 969838.4669147353, 832663.384287972, 48963.35240494554, 35242.24376649599, 892825.4090499423, 483556.0470240916, 53456.08024833648, 497542.41033004754, 225241.83311631696};
		double[] v2 = new double[]{116866.61617976813, 945169.4223279699, 783931.3461809703, 390076.4516430273, 514503.526205468, 391879.8293238419, 448661.23005451274, 225063.0823386256, 439645.4755184985, 128924.70358430353};
		double res = Pharmacological.distance(v1, v2);
		double ref = 809765.0678005908;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{5311.971957231986, 969838.4669147353, 832663.384287972, 48963.35240494554, 35242.24376649599, 892825.4090499423, 483556.0470240916, 53456.08024833648, 497542.41033004754, 225241.83311631696};
		double[] v2 = new double[]{116866.61617976813, 945169.4223279699, 783931.3461809703, 390076.4516430273, 514503.526205468, 391879.8293238419, 448661.23005451274, 225063.0823386256, 439645.4755184985, 128924.70358430353};
		double res = Pharmacological.distance(v1, v2);
		double ref = 809765.0678005908;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{5311.971957231986, 969838.4669147353, 832663.384287972, 48963.35240494554, 35242.24376649599, 892825.4090499423, 483556.0470240916, 53456.08024833648, 497542.41033004754, 225241.83311631696};
		double[] v2 = new double[]{116866.61617976813, 945169.4223279699, 783931.3461809703, 390076.4516430273, 514503.526205468, 391879.8293238419, 448661.23005451274, 225063.0823386256, 439645.4755184985, 128924.70358430353};
		double res = Pharmacological.distance(v1, v2);
		double ref = 809765.0678005908;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{4.307353274393707, 1.3365037705294658, 8.517380748500369, 5.186911198553879, 6.997024214515754, 0.08733692349508493, 8.15249077103916, 4.328049349922969, -4.621925483218581, -1.3775236202694496};
		double[] v2 = new double[]{9.487762859925454, 6.084709980473992, 5.7877734792167, 8.66562057320682, -0.49576171401811475, -4.114920193572134, -4.347952171806123, 5.6695373868011405, -3.1586840168058794, 1.0001374170145083};
		double res = Pharmacological.distance(v1, v2);
		double ref = 17.566732701623604;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{4.307353274393707, 1.3365037705294658, 8.517380748500369, 5.186911198553879, 6.997024214515754, 0.08733692349508493, 8.15249077103916, 4.328049349922969, -4.621925483218581, -1.3775236202694496};
		double[] v2 = new double[]{9.487762859925454, 6.084709980473992, 5.7877734792167, 8.66562057320682, -0.49576171401811475, -4.114920193572134, -4.347952171806123, 5.6695373868011405, -3.1586840168058794, 1.0001374170145083};
		double res = Pharmacological.distance(v1, v2);
		double ref = 17.566732701623604;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{4.307353274393707, 1.3365037705294658, 8.517380748500369, 5.186911198553879, 6.997024214515754, 0.08733692349508493, 8.15249077103916, 4.328049349922969, -4.621925483218581, -1.3775236202694496};
		double[] v2 = new double[]{9.487762859925454, 6.084709980473992, 5.7877734792167, 8.66562057320682, -0.49576171401811475, -4.114920193572134, -4.347952171806123, 5.6695373868011405, -3.1586840168058794, 1.0001374170145083};
		double res = Pharmacological.distance(v1, v2);
		double ref = 17.566732701623604;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test33(){
		double[] v1 = new double[]{-459.91020189450984, -891.7624647177225, 680.512107085065, -255.5677981605371, -163.6010971738695, -222.66413686428243, 592.2530446462879, 744.6928152228019, -862.3619344134316, -298.94167891715506};
		double[] v2 = new double[]{45.322784599606706, -824.4156645223362, -524.3952152027454, -265.50149874286234, -908.1711763504909, 254.87374213367576, -407.5789881020906, 628.4217536726788, -852.1134152810911, 532.3595008014706};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2049.0175844880014;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test34(){
		double[] v1 = new double[]{-459.91020189450984, -891.7624647177225, 680.512107085065, -255.5677981605371, -163.6010971738695, -222.66413686428243, 592.2530446462879, 744.6928152228019, -862.3619344134316, -298.94167891715506};
		double[] v2 = new double[]{45.322784599606706, -824.4156645223362, -524.3952152027454, -265.50149874286234, -908.1711763504909, 254.87374213367576, -407.5789881020906, 628.4217536726788, -852.1134152810911, 532.3595008014706};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2049.0175844880014;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test35(){
		double[] v1 = new double[]{-459.91020189450984, -891.7624647177225, 680.512107085065, -255.5677981605371, -163.6010971738695, -222.66413686428243, 592.2530446462879, 744.6928152228019, -862.3619344134316, -298.94167891715506};
		double[] v2 = new double[]{45.322784599606706, -824.4156645223362, -524.3952152027454, -265.50149874286234, -908.1711763504909, 254.87374213367576, -407.5789881020906, 628.4217536726788, -852.1134152810911, 532.3595008014706};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2049.0175844880014;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test36(){
		double[] v1 = new double[]{-416489.10635193845, -856313.7809424968, -430672.9013167726, 606068.7622318144, 354258.0083094289, -615777.4324047423, 110401.0987982974, -691833.7889542344, -495051.03830509377, -879232.1293490101};
		double[] v2 = new double[]{303955.7450410699, -46122.50131998163, 152941.77637317486, -393404.6523306791, 706218.5798742204, -813585.0501136236, 172967.56591211582, -246754.833643665, -484233.89138687745, 311429.04838719044};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2073115.7419619267;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test37(){
		double[] v1 = new double[]{-416489.10635193845, -856313.7809424968, -430672.9013167726, 606068.7622318144, 354258.0083094289, -615777.4324047423, 110401.0987982974, -691833.7889542344, -495051.03830509377, -879232.1293490101};
		double[] v2 = new double[]{303955.7450410699, -46122.50131998163, 152941.77637317486, -393404.6523306791, 706218.5798742204, -813585.0501136236, 172967.56591211582, -246754.833643665, -484233.89138687745, 311429.04838719044};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2073115.7419619267;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test38(){
		double[] v1 = new double[]{-416489.10635193845, -856313.7809424968, -430672.9013167726, 606068.7622318144, 354258.0083094289, -615777.4324047423, 110401.0987982974, -691833.7889542344, -495051.03830509377, -879232.1293490101};
		double[] v2 = new double[]{303955.7450410699, -46122.50131998163, 152941.77637317486, -393404.6523306791, 706218.5798742204, -813585.0501136236, 172967.56591211582, -246754.833643665, -484233.89138687745, 311429.04838719044};
		double res = Pharmacological.distance(v1, v2);
		double ref = 2073115.7419619267;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	@Test
	//jfquesada
		public void auto_test39(){
			double[] v1 = new double[]{0, 0, 0, 0, 0};
			double[] v2 = new double[]{1, 2, 3, 4, 5};
			double res = Pharmacological.distance(v1, v2);
			double ref = 7.416198487095663;
			Asserts.assertDistance(ref);
			Asserts.assertEquals(res, ref);
		}
}
