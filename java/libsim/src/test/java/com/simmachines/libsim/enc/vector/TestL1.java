package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestL1 {

	@Test
	//jfquesada
	public void test1() {
		double[] v1 = new double[]{1, 1};
		double[] v2 = new double[]{2, 3};
		double res = L1.distance(v1, v2);		
		double ref = 3;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	
	@Test
	//jfquesada
	public void test2() {
		double[] v1 = new double[]{5, 10};
		double[] v2 = new double[]{3, 4};
		double res = L1.distance(v1, v2);		
		double ref = 8;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	
	@Test
	//jfquesada
	public void test3() {
		double[] v1 = new double[]{1, 2, 3, 4};
		double[] v2 = new double[]{3, 2, -1, 5};
		double res = L1.distance(v1, v2);		
		double ref = 7;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	
	@Test
	//jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double res = L1.distance(v1, v2);
		double ref = 15;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = L1.distance(v1, v2);
		double ref = 15;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{2, 5, 5, 5, 1, 8, 3, 4, 4, 5};
		double[] v2 = new double[]{2, 1, 1, 4, 1, 7, 4, 6, 1, 0};
		double res = L1.distance(v1, v2);
		double ref = 21;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{2, 5, 5, 5, 1, 8, 3, 4, 4, 5};
		double[] v2 = new double[]{2, 1, 1, 4, 1, 7, 4, 6, 1, 0};
		double res = L1.distance(v1, v2);
		double ref = 21;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{2, 5, 5, 5, 1, 8, 3, 4, 4, 5};
		double[] v2 = new double[]{2, 1, 1, 4, 1, 7, 4, 6, 1, 0};
		double res = L1.distance(v1, v2);
		double ref = 21;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{939, 112, 694, 532, 555, 933, 458, 58, 266, 260};
		double[] v2 = new double[]{465, 460, 804, 820, 713, 697, 447, 217, 950, 451};
		double res = L1.distance(v1, v2);
		double ref = 2659;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{939, 112, 694, 532, 555, 933, 458, 58, 266, 260};
		double[] v2 = new double[]{465, 460, 804, 820, 713, 697, 447, 217, 950, 451};
		double res = L1.distance(v1, v2);
		double ref = 2659;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{939, 112, 694, 532, 555, 933, 458, 58, 266, 260};
		double[] v2 = new double[]{465, 460, 804, 820, 713, 697, 447, 217, 950, 451};
		double res = L1.distance(v1, v2);
		double ref = 2659;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{545449, 552726, 43669, 637098, 367592, 674220, 758192, 804979, 107606, 888739};
		double[] v2 = new double[]{228869, 218799, 336965, 417863, 754160, 355691, 464733, 484643, 620989, 410463};
		double res = L1.distance(v1, v2);
		double ref = 3473589;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{545449, 552726, 43669, 637098, 367592, 674220, 758192, 804979, 107606, 888739};
		double[] v2 = new double[]{228869, 218799, 336965, 417863, 754160, 355691, 464733, 484643, 620989, 410463};
		double res = L1.distance(v1, v2);
		double ref = 3473589;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{545449, 552726, 43669, 637098, 367592, 674220, 758192, 804979, 107606, 888739};
		double[] v2 = new double[]{228869, 218799, 336965, 417863, 754160, 355691, 464733, 484643, 620989, 410463};
		double res = L1.distance(v1, v2);
		double ref = 3473589;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{2, 2, 2, 8, 6, -1, 3, -9, -7, 3};
		double[] v2 = new double[]{0, -2, 3, 0, 8, -8, -1, 3, -7, 7};
		double res = L1.distance(v1, v2);
		double ref = 44;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{2, 2, 2, 8, 6, -1, 3, -9, -7, 3};
		double[] v2 = new double[]{0, -2, 3, 0, 8, -8, -1, 3, -7, 7};
		double res = L1.distance(v1, v2);
		double ref = 44;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{2, 2, 2, 8, 6, -1, 3, -9, -7, 3};
		double[] v2 = new double[]{0, -2, 3, 0, 8, -8, -1, 3, -7, 7};
		double res = L1.distance(v1, v2);
		double ref = 44;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{-800, 21, -565, 273, -694, -396, 533, 212, 298, 562};
		double[] v2 = new double[]{-562, 631, 125, 839, 94, -97, -765, -45, 320, -542};
		double res = L1.distance(v1, v2);
		double ref = 5872;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{-800, 21, -565, 273, -694, -396, 533, 212, 298, 562};
		double[] v2 = new double[]{-562, 631, 125, 839, 94, -97, -765, -45, 320, -542};
		double res = L1.distance(v1, v2);
		double ref = 5872;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{-800, 21, -565, 273, -694, -396, 533, 212, 298, 562};
		double[] v2 = new double[]{-562, 631, 125, 839, 94, -97, -765, -45, 320, -542};
		double res = L1.distance(v1, v2);
		double ref = 5872;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{-241452, 389834, 653105, 442421, 825861, -842532, 358962, -33737, -433861, 855116};
		double[] v2 = new double[]{408458, -998319, -992146, 800530, -674974, -145553, -937039, 851807, 975979, -964723};
		double res = L1.distance(v1, v2);
		double ref = 11650461;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{-241452, 389834, 653105, 442421, 825861, -842532, 358962, -33737, -433861, 855116};
		double[] v2 = new double[]{408458, -998319, -992146, 800530, -674974, -145553, -937039, 851807, 975979, -964723};
		double res = L1.distance(v1, v2);
		double ref = 11650461;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test20(){
		double[] v1 = new double[]{-241452, 389834, 653105, 442421, 825861, -842532, 358962, -33737, -433861, 855116};
		double[] v2 = new double[]{408458, -998319, -992146, 800530, -674974, -145553, -937039, 851807, 975979, -964723};
		double res = L1.distance(v1, v2);
		double ref = 11650461;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{2.8498793447875945, 1.9543153242703482, 9.004152898158205, 5.179893607045418, 4.888202833407915, 2.5794598462671345, 0.4324138021194446, 5.445104756054463, 0.4429396198587765, 7.211735047609374};
		double[] v2 = new double[]{9.387536162523187, 0.9323534185351967, 7.48090572879652, 2.218918373010206, 5.711928449374374, 8.171923867466468, 3.4954549295026416, 6.945450210635514, 2.977007791043884, 2.0460233906095593};
		double res = L1.distance(v1, v2);
		double ref = 30.723197174182605;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{2.8498793447875945, 1.9543153242703482, 9.004152898158205, 5.179893607045418, 4.888202833407915, 2.5794598462671345, 0.4324138021194446, 5.445104756054463, 0.4429396198587765, 7.211735047609374};
		double[] v2 = new double[]{9.387536162523187, 0.9323534185351967, 7.48090572879652, 2.218918373010206, 5.711928449374374, 8.171923867466468, 3.4954549295026416, 6.945450210635514, 2.977007791043884, 2.0460233906095593};
		double res = L1.distance(v1, v2);
		double ref = 30.723197174182605;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{2.8498793447875945, 1.9543153242703482, 9.004152898158205, 5.179893607045418, 4.888202833407915, 2.5794598462671345, 0.4324138021194446, 5.445104756054463, 0.4429396198587765, 7.211735047609374};
		double[] v2 = new double[]{9.387536162523187, 0.9323534185351967, 7.48090572879652, 2.218918373010206, 5.711928449374374, 8.171923867466468, 3.4954549295026416, 6.945450210635514, 2.977007791043884, 2.0460233906095593};
		double res = L1.distance(v1, v2);
		double ref = 30.723197174182605;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{233.29749551912715, 94.39450143687655, 932.6603922718845, 36.201966050625536, 304.4219000133759, 765.6888702891933, 626.3271183478118, 588.4862526879602, 134.5383984599854, 108.64983887595481};
		double[] v2 = new double[]{975.1585318461524, 171.7728893039283, 799.2798569407194, 11.696252427481957, 746.8233738824281, 103.88409884769622, 781.7320344861272, 676.3938899648273, 368.0878668118619, 171.31544828364608};
		double res = L1.distance(v1, v2);
		double ref = 2620.859549633685;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{233.29749551912715, 94.39450143687655, 932.6603922718845, 36.201966050625536, 304.4219000133759, 765.6888702891933, 626.3271183478118, 588.4862526879602, 134.5383984599854, 108.64983887595481};
		double[] v2 = new double[]{975.1585318461524, 171.7728893039283, 799.2798569407194, 11.696252427481957, 746.8233738824281, 103.88409884769622, 781.7320344861272, 676.3938899648273, 368.0878668118619, 171.31544828364608};
		double res = L1.distance(v1, v2);
		double ref = 2620.859549633685;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{233.29749551912715, 94.39450143687655, 932.6603922718845, 36.201966050625536, 304.4219000133759, 765.6888702891933, 626.3271183478118, 588.4862526879602, 134.5383984599854, 108.64983887595481};
		double[] v2 = new double[]{975.1585318461524, 171.7728893039283, 799.2798569407194, 11.696252427481957, 746.8233738824281, 103.88409884769622, 781.7320344861272, 676.3938899648273, 368.0878668118619, 171.31544828364608};
		double res = L1.distance(v1, v2);
		double ref = 2620.859549633685;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{233061.91966034452, 943996.3064018546, 902195.6771670484, 773776.5415805473, 951781.4272602593, 126676.26788344688, 359769.19665022835, 177484.17410139507, 312580.50115030556, 962370.9456675359};
		double[] v2 = new double[]{279690.96702750254, 303015.31029776717, 801507.9132092695, 795497.1666082542, 333274.2136743629, 90901.30486854541, 351824.14673316886, 158079.8656167759, 666260.7845487992, 898348.5545239804};
		double res = L1.distance(v1, v2);
		double ref = 1909352.642001257;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{233061.91966034452, 943996.3064018546, 902195.6771670484, 773776.5415805473, 951781.4272602593, 126676.26788344688, 359769.19665022835, 177484.17410139507, 312580.50115030556, 962370.9456675359};
		double[] v2 = new double[]{279690.96702750254, 303015.31029776717, 801507.9132092695, 795497.1666082542, 333274.2136743629, 90901.30486854541, 351824.14673316886, 158079.8656167759, 666260.7845487992, 898348.5545239804};
		double res = L1.distance(v1, v2);
		double ref = 1909352.642001257;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{233061.91966034452, 943996.3064018546, 902195.6771670484, 773776.5415805473, 951781.4272602593, 126676.26788344688, 359769.19665022835, 177484.17410139507, 312580.50115030556, 962370.9456675359};
		double[] v2 = new double[]{279690.96702750254, 303015.31029776717, 801507.9132092695, 795497.1666082542, 333274.2136743629, 90901.30486854541, 351824.14673316886, 158079.8656167759, 666260.7845487992, 898348.5545239804};
		double res = L1.distance(v1, v2);
		double ref = 1909352.642001257;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{-9.08867422366639, -2.447013952084338, 3.5409985381917086, -8.448665167685196, -3.8469698760718343, -0.09439608693416868, -2.5907812266647956, -0.20860764284608369, -2.177903128602501, 7.707278354605265};
		double[] v2 = new double[]{-5.449297336919173, -8.83266137046016, -0.8129782220940052, -4.119595441814817, -1.7457011397005362, 6.774481469346978, -2.3100432173528995, -7.187227966699137, 4.628596517901903, -7.8234955294128135};
		double res = L1.distance(v1, v2);
		double ref = 57.274848947619006;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{-9.08867422366639, -2.447013952084338, 3.5409985381917086, -8.448665167685196, -3.8469698760718343, -0.09439608693416868, -2.5907812266647956, -0.20860764284608369, -2.177903128602501, 7.707278354605265};
		double[] v2 = new double[]{-5.449297336919173, -8.83266137046016, -0.8129782220940052, -4.119595441814817, -1.7457011397005362, 6.774481469346978, -2.3100432173528995, -7.187227966699137, 4.628596517901903, -7.8234955294128135};
		double res = L1.distance(v1, v2);
		double ref = 57.274848947619006;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{-9.08867422366639, -2.447013952084338, 3.5409985381917086, -8.448665167685196, -3.8469698760718343, -0.09439608693416868, -2.5907812266647956, -0.20860764284608369, -2.177903128602501, 7.707278354605265};
		double[] v2 = new double[]{-5.449297336919173, -8.83266137046016, -0.8129782220940052, -4.119595441814817, -1.7457011397005362, 6.774481469346978, -2.3100432173528995, -7.187227966699137, 4.628596517901903, -7.8234955294128135};
		double res = L1.distance(v1, v2);
		double ref = 57.274848947619006;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test33(){
		double[] v1 = new double[]{-583.6528153667402, 654.160661736122, -795.067976795603, 868.0351943259689, 876.4048506304795, -741.9932073340555, 99.36182841946794, -981.1344838116098, -839.2146304650907, -949.296937678108};
		double[] v2 = new double[]{852.3261288115648, -217.82590522238365, -588.6591730728256, 348.0956061128896, -544.9263019345276, -6.628416139133786, 610.7716839053119, 682.4712875081226, 947.6050372424996, 464.6765791266068};
		double res = L1.distance(v1, v2);
		double ref = 10566.818658150478;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test34(){
		double[] v1 = new double[]{-583.6528153667402, 654.160661736122, -795.067976795603, 868.0351943259689, 876.4048506304795, -741.9932073340555, 99.36182841946794, -981.1344838116098, -839.2146304650907, -949.296937678108};
		double[] v2 = new double[]{852.3261288115648, -217.82590522238365, -588.6591730728256, 348.0956061128896, -544.9263019345276, -6.628416139133786, 610.7716839053119, 682.4712875081226, 947.6050372424996, 464.6765791266068};
		double res = L1.distance(v1, v2);
		double ref = 10566.818658150478;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test35(){
		double[] v1 = new double[]{-583.6528153667402, 654.160661736122, -795.067976795603, 868.0351943259689, 876.4048506304795, -741.9932073340555, 99.36182841946794, -981.1344838116098, -839.2146304650907, -949.296937678108};
		double[] v2 = new double[]{852.3261288115648, -217.82590522238365, -588.6591730728256, 348.0956061128896, -544.9263019345276, -6.628416139133786, 610.7716839053119, 682.4712875081226, 947.6050372424996, 464.6765791266068};
		double res = L1.distance(v1, v2);
		double ref = 10566.818658150478;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test36(){
		double[] v1 = new double[]{879855.6329616157, -371831.87966177723, -671531.0337935312, 86779.7168913933, -295182.0351087099, 723352.9888218757, -137296.28410973848, 436632.8710410895, 529175.7278252081, -77384.9991084925};
		double[] v2 = new double[]{-482621.2644787434, 227514.4039394319, -208056.68154463242, 747874.544436612, 102088.41913817391, -696264.806415339, 737783.1604848531, 692811.7311341128, 896501.3982584202, 869669.917547015};
		double res = L1.distance(v1, v2);
		double ref = 7348919.502096119;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test37(){
		double[] v1 = new double[]{879855.6329616157, -371831.87966177723, -671531.0337935312, 86779.7168913933, -295182.0351087099, 723352.9888218757, -137296.28410973848, 436632.8710410895, 529175.7278252081, -77384.9991084925};
		double[] v2 = new double[]{-482621.2644787434, 227514.4039394319, -208056.68154463242, 747874.544436612, 102088.41913817391, -696264.806415339, 737783.1604848531, 692811.7311341128, 896501.3982584202, 869669.917547015};
		double res = L1.distance(v1, v2);
		double ref = 7348919.502096119;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test38(){
		double[] v1 = new double[]{879855.6329616157, -371831.87966177723, -671531.0337935312, 86779.7168913933, -295182.0351087099, 723352.9888218757, -137296.28410973848, 436632.8710410895, 529175.7278252081, -77384.9991084925};
		double[] v2 = new double[]{-482621.2644787434, 227514.4039394319, -208056.68154463242, 747874.544436612, 102088.41913817391, -696264.806415339, 737783.1604848531, 692811.7311341128, 896501.3982584202, 869669.917547015};
		double res = L1.distance(v1, v2);
		double ref = 7348919.502096119;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
}
