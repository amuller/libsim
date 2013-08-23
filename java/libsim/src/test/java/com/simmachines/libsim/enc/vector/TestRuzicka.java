package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestRuzicka {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Ruzicka.distance(v1, v2);
		Asserts.assertEquals(res, 0.375);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		double res = Ruzicka.distance(v1, v2);
		Asserts.assertEquals(res, 3.37704918032787);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		double res = Ruzicka.distance(v1, v2);
		Asserts.assertEquals(res, 16.40571813874524);
	}
	@Test
	//jxwang+jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*1;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*1;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{5, 7, 1, 0, 6, 5, 3, 9, 4, 0};
		double[] v2 = new double[]{1, 9, 4, 6, 4, 6, 6, 6, 5, 2};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*27/58;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{5, 7, 1, 0, 6, 5, 3, 9, 4, 0};
		double[] v2 = new double[]{1, 9, 4, 6, 4, 6, 6, 6, 5, 2};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*27/58;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{5, 7, 1, 0, 6, 5, 3, 9, 4, 0};
		double[] v2 = new double[]{1, 9, 4, 6, 4, 6, 6, 6, 5, 2};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*27/58;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{587, 404, 591, 949, 192, 967, 123, 637, 590, 952};
		double[] v2 = new double[]{843, 870, 794, 564, 71, 984, 328, 673, 829, 531};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*2349/7414;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{587, 404, 591, 949, 192, 967, 123, 637, 590, 952};
		double[] v2 = new double[]{843, 870, 794, 564, 71, 984, 328, 673, 829, 531};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*2349/7414;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{587, 404, 591, 949, 192, 967, 123, 637, 590, 952};
		double[] v2 = new double[]{843, 870, 794, 564, 71, 984, 328, 673, 829, 531};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*2349/7414;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{324409, 998036, 778649, 152510, 955406, 64074, 926237, 698404, 9283, 131028};
		double[] v2 = new double[]{72079, 145448, 677785, 485999, 812699, 710537, 371488, 341577, 730292, 639914};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*4469912/7247883;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{324409, 998036, 778649, 152510, 955406, 64074, 926237, 698404, 9283, 131028};
		double[] v2 = new double[]{72079, 145448, 677785, 485999, 812699, 710537, 371488, 341577, 730292, 639914};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*4469912/7247883;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{324409, 998036, 778649, 152510, 955406, 64074, 926237, 698404, 9283, 131028};
		double[] v2 = new double[]{72079, 145448, 677785, 485999, 812699, 710537, 371488, 341577, 730292, 639914};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*4469912/7247883;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{0, 3, 6, -8, 0, -1, -7, 8, 2, -3};
		double[] v2 = new double[]{8, 2, 1, 3, -3, -4, 3, -9, 7, 2};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*68/39;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{0, 3, 6, -8, 0, -1, -7, 8, 2, -3};
		double[] v2 = new double[]{8, 2, 1, 3, -3, -4, 3, -9, 7, 2};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*68/39;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{0, 3, 6, -8, 0, -1, -7, 8, 2, -3};
		double[] v2 = new double[]{8, 2, 1, 3, -3, -4, 3, -9, 7, 2};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*68/39;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{821, 270, 208, -913, 514, 798, -904, -485, -231, -103};
		double[] v2 = new double[]{-343, -540, -555, -315, -861, 126, 796, -63, 808, -626};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*4533/1867;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{821, 270, 208, -913, 514, 798, -904, -485, -231, -103};
		double[] v2 = new double[]{-343, -540, -555, -315, -861, 126, 796, -63, 808, -626};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*4533/1867;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{821, 270, 208, -913, 514, 798, -904, -485, -231, -103};
		double[] v2 = new double[]{-343, -540, -555, -315, -861, 126, 796, -63, 808, -626};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*4533/1867;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{630996, 45829, 407243, -856511, -286830, 335711, -766571, 188513, 322279, -832945};
		double[] v2 = new double[]{769290, 732479, -352263, -489982, 780203, 835576, 294767, -216092, 388200, 425232};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*6307918/4331521;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{630996, 45829, 407243, -856511, -286830, 335711, -766571, 188513, 322279, -832945};
		double[] v2 = new double[]{769290, 732479, -352263, -489982, 780203, 835576, 294767, -216092, 388200, 425232};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*6307918/4331521;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test20(){
		double[] v1 = new double[]{630996, 45829, 407243, -856511, -286830, 335711, -766571, 188513, 322279, -832945};
		double[] v2 = new double[]{769290, 732479, -352263, -489982, 780203, 835576, 294767, -216092, 388200, 425232};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*6307918/4331521;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{8.570921800122557, 9.718607951238804, 7.507756662552061, 6.0125424959984075, 9.507122328035043, 6.370579464197197, 2.1505566644740135, 9.629256670692087, 2.8535758209737683, 1.4705430398978503};
		double[] v2 = new double[]{5.025178360168013, 8.547212572251297, 1.6991070673201414, 4.523580597723264, 0.797185284002977, 0.2864272391330813, 6.126037786994317, 3.31030633288963, 2.0001963780882637, 6.0276595030710824};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5878232867940988;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{8.570921800122557, 9.718607951238804, 7.507756662552061, 6.0125424959984075, 9.507122328035043, 6.370579464197197, 2.1505566644740135, 9.629256670692087, 2.8535758209737683, 1.4705430398978503};
		double[] v2 = new double[]{5.025178360168013, 8.547212572251297, 1.6991070673201414, 4.523580597723264, 0.797185284002977, 0.2864272391330813, 6.126037786994317, 3.31030633288963, 2.0001963780882637, 6.0276595030710824};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5878232867940988;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{8.570921800122557, 9.718607951238804, 7.507756662552061, 6.0125424959984075, 9.507122328035043, 6.370579464197197, 2.1505566644740135, 9.629256670692087, 2.8535758209737683, 1.4705430398978503};
		double[] v2 = new double[]{5.025178360168013, 8.547212572251297, 1.6991070673201414, 4.523580597723264, 0.797185284002977, 0.2864272391330813, 6.126037786994317, 3.31030633288963, 2.0001963780882637, 6.0276595030710824};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5878232867940988;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{785.7073853869566, 221.54155661478057, 399.388533483349, 805.551660140414, 550.5878020847279, 937.7769911468026, 931.3049162399053, 440.1541962270397, 778.3925898720677, 734.1274916053591};
		double[] v2 = new double[]{163.63231325107407, 984.4087806890046, 753.3829952246509, 623.1519565173312, 90.19465989765519, 379.87213673483257, 903.9378893140356, 939.1339350972131, 145.93120675587002, 857.2373876319771};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5071857263338964;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{785.7073853869566, 221.54155661478057, 399.388533483349, 805.551660140414, 550.5878020847279, 937.7769911468026, 931.3049162399053, 440.1541962270397, 778.3925898720677, 734.1274916053591};
		double[] v2 = new double[]{163.63231325107407, 984.4087806890046, 753.3829952246509, 623.1519565173312, 90.19465989765519, 379.87213673483257, 903.9378893140356, 939.1339350972131, 145.93120675587002, 857.2373876319771};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5071857263338964;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{785.7073853869566, 221.54155661478057, 399.388533483349, 805.551660140414, 550.5878020847279, 937.7769911468026, 931.3049162399053, 440.1541962270397, 778.3925898720677, 734.1274916053591};
		double[] v2 = new double[]{163.63231325107407, 984.4087806890046, 753.3829952246509, 623.1519565173312, 90.19465989765519, 379.87213673483257, 903.9378893140356, 939.1339350972131, 145.93120675587002, 857.2373876319771};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5071857263338964;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{470513.4694425206, 887917.5020656458, 456885.909867687, 595638.8138792581, 490349.5875968619, 226729.70978749375, 504920.31965991703, 619807.6690869451, 655471.7228531839, 277267.7292712129};
		double[] v2 = new double[]{941921.5249117414, 101735.84523722157, 183545.87461329607, 191147.88999041953, 949409.6482760827, 152448.80005303762, 830400.7110974037, 758885.4084167305, 106832.56512492168, 264685.12282881315};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5310426724811459;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{470513.4694425206, 887917.5020656458, 456885.909867687, 595638.8138792581, 490349.5875968619, 226729.70978749375, 504920.31965991703, 619807.6690869451, 655471.7228531839, 277267.7292712129};
		double[] v2 = new double[]{941921.5249117414, 101735.84523722157, 183545.87461329607, 191147.88999041953, 949409.6482760827, 152448.80005303762, 830400.7110974037, 758885.4084167305, 106832.56512492168, 264685.12282881315};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5310426724811459;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{470513.4694425206, 887917.5020656458, 456885.909867687, 595638.8138792581, 490349.5875968619, 226729.70978749375, 504920.31965991703, 619807.6690869451, 655471.7228531839, 277267.7292712129};
		double[] v2 = new double[]{941921.5249117414, 101735.84523722157, 183545.87461329607, 191147.88999041953, 949409.6482760827, 152448.80005303762, 830400.7110974037, 758885.4084167305, 106832.56512492168, 264685.12282881315};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*0.5310426724811459;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{-0.8189302232897622, 7.987250807897529, 1.115575092595008, -2.9130591616150667, -4.002730617897478, -9.115069437009236, 4.063812397331019, -0.8768274867100234, -3.4828708041531256, 1.8596831906321776};
		double[] v2 = new double[]{9.125915028048256, 1.3357495861550572, -0.8690042058153935, 0.49041391727906336, 0.10041281386086509, -2.6679961916474326, 0.10738074462735447, -6.248603657951958, 9.403660476857876, 5.221187063887635};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*1.710984524508289;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{-0.8189302232897622, 7.987250807897529, 1.115575092595008, -2.9130591616150667, -4.002730617897478, -9.115069437009236, 4.063812397331019, -0.8768274867100234, -3.4828708041531256, 1.8596831906321776};
		double[] v2 = new double[]{9.125915028048256, 1.3357495861550572, -0.8690042058153935, 0.49041391727906336, 0.10041281386086509, -2.6679961916474326, 0.10738074462735447, -6.248603657951958, 9.403660476857876, 5.221187063887635};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*1.710984524508289;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jxwang+jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{-0.8189302232897622, 7.987250807897529, 1.115575092595008, -2.9130591616150667, -4.002730617897478, -9.115069437009236, 4.063812397331019, -0.8768274867100234, -3.4828708041531256, 1.8596831906321776};
		double[] v2 = new double[]{9.125915028048256, 1.3357495861550572, -0.8690042058153935, 0.49041391727906336, 0.10041281386086509, -2.6679961916474326, 0.10738074462735447, -6.248603657951958, 9.403660476857876, 5.221187063887635};
		double res = Ruzicka.distance(v1, v2);
		double ref = 1.0*1.710984524508289;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	 
	
}
