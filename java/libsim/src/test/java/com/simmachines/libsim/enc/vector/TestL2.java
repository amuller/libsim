package com.simmachines.libsim.enc.vector;

import org.junit.Test;
import com.simmachines.libsim.asserts.Asserts;

public class TestL2 {



	@Test
	public void test1() {
		double[] v1 = new double[]{1, 2, 3, 5, 6};
		double[] v2 = new double[]{7, 8, 9, 0, 1};
		double res = L2.distance(v1, v2);
		double ref = 12.569805089976535;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	

	
	@Test
	public void test2() {
		double[] v1 = new double[]{0.2,0.7,0.001,0.5,0.10};
		double[] v2 = new double[]{0.1,0.05,0.01,2,0.01};
		double res = L2.distance(v1, v2);
		double ref = 1.6403295400619962;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	
	@Test
	public void test3() {
		double[] v1 = new double[] {1, 2, 3, 5, 6};
		double[] v2 = new double[] {7, 8, 9, 0, 1};
		double res = L2.distance(v1, v2);
		double ref = 12.569805089976535;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
	@Test
	public void test4 () {
		double[] v1 = new double[] {20, 30, 1000, 200, 3, 50};
		double[] v2 = new double[] {10, 100, 500, 10, 1, 250};
		double res = L2.distance(v1, v2);
		double ref = 575.4163709871314;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double res = L2.distance(v1, v2);
		double ref = 7.416198487095663;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = L2.distance(v1, v2);
		double ref = 7.416198487095663;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{6, 5, 2, 4, 6, 7, 5, 9, 1, 8};
		double[] v2 = new double[]{8, 7, 4, 6, 8, 4, 3, 5, 3, 0};
		double res = L2.distance(v1, v2);
		double ref = 10.816653826391969;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{6, 5, 2, 4, 6, 7, 5, 9, 1, 8};
		double[] v2 = new double[]{8, 7, 4, 6, 8, 4, 3, 5, 3, 0};
		double res = L2.distance(v1, v2);
		double ref = 10.816653826391969;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{6, 5, 2, 4, 6, 7, 5, 9, 1, 8};
		double[] v2 = new double[]{8, 7, 4, 6, 8, 4, 3, 5, 3, 0};
		double res = L2.distance(v1, v2);
		double ref = 10.816653826391969;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{661, 609, 140, 946, 778, 560, 440, 22, 564, 576};
		double[] v2 = new double[]{147, 614, 817, 622, 57, 196, 81, 852, 228, 549};
		double res = L2.distance(v1, v2);
		double ref = 1552.8261332164655;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{661, 609, 140, 946, 778, 560, 440, 22, 564, 576};
		double[] v2 = new double[]{147, 614, 817, 622, 57, 196, 81, 852, 228, 549};
		double res = L2.distance(v1, v2);
		double ref = 1552.8261332164655;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{661, 609, 140, 946, 778, 560, 440, 22, 564, 576};
		double[] v2 = new double[]{147, 614, 817, 622, 57, 196, 81, 852, 228, 549};
		double res = L2.distance(v1, v2);
		double ref = 1552.8261332164655;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{158790, 952268, 787147, 554640, 367774, 594249, 394765, 231202, 706874, 613208};
		double[] v2 = new double[]{524729, 813610, 360604, 665292, 821887, 241011, 548612, 741185, 395890, 613496};
		double res = L2.distance(v1, v2);
		double ref = 1028969.6695962423;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{158790, 952268, 787147, 554640, 367774, 594249, 394765, 231202, 706874, 613208};
		double[] v2 = new double[]{524729, 813610, 360604, 665292, 821887, 241011, 548612, 741185, 395890, 613496};
		double res = L2.distance(v1, v2);
		double ref = 1028969.6695962423;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{158790, 952268, 787147, 554640, 367774, 594249, 394765, 231202, 706874, 613208};
		double[] v2 = new double[]{524729, 813610, 360604, 665292, 821887, 241011, 548612, 741185, 395890, 613496};
		double res = L2.distance(v1, v2);
		double ref = 1028969.6695962423;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{5, 4, -2, 0, 0, 8, -9, 1, 0, -5};
		double[] v2 = new double[]{-6, -2, 3, -6, 4, -8, 2, -6, 8, -2};
		double res = L2.distance(v1, v2);
		double ref = 27.073972741361768;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{5, 4, -2, 0, 0, 8, -9, 1, 0, -5};
		double[] v2 = new double[]{-6, -2, 3, -6, 4, -8, 2, -6, 8, -2};
		double res = L2.distance(v1, v2);
		double ref = 27.073972741361768;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{5, 4, -2, 0, 0, 8, -9, 1, 0, -5};
		double[] v2 = new double[]{-6, -2, 3, -6, 4, -8, 2, -6, 8, -2};
		double res = L2.distance(v1, v2);
		double ref = 27.073972741361768;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{261, 36, -552, -706, -876, 4, 10, -78, -293, 143};
		double[] v2 = new double[]{-837, 185, -828, 325, 147, -188, -724, -502, 20, 962};
		double res = L2.distance(v1, v2);
		double ref = 2222.0704309269768;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{261, 36, -552, -706, -876, 4, 10, -78, -293, 143};
		double[] v2 = new double[]{-837, 185, -828, 325, 147, -188, -724, -502, 20, 962};
		double res = L2.distance(v1, v2);
		double ref = 2222.0704309269768;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{261, 36, -552, -706, -876, 4, 10, -78, -293, 143};
		double[] v2 = new double[]{-837, 185, -828, 325, 147, -188, -724, -502, 20, 962};
		double res = L2.distance(v1, v2);
		double ref = 2222.0704309269768;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{-428627, 193201, 407492, -241281, 955131, 620902, -113864, 77131, 849158, -666344};
		double[] v2 = new double[]{-176969, 541491, -572962, -639965, 208953, -633784, 618862, 635182, -249296, -537097};
		double res = L2.distance(v1, v2);
		double ref = 2346808.365444013;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{-428627, 193201, 407492, -241281, 955131, 620902, -113864, 77131, 849158, -666344};
		double[] v2 = new double[]{-176969, 541491, -572962, -639965, 208953, -633784, 618862, 635182, -249296, -537097};
		double res = L2.distance(v1, v2);
		double ref = 2346808.365444013;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test20(){
		double[] v1 = new double[]{-428627, 193201, 407492, -241281, 955131, 620902, -113864, 77131, 849158, -666344};
		double[] v2 = new double[]{-176969, 541491, -572962, -639965, 208953, -633784, 618862, 635182, -249296, -537097};
		double res = L2.distance(v1, v2);
		double ref = 2346808.365444013;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{0.4140845087392875, 6.003583849213705, 1.4886049541572322, 0.02549892804812326, 3.5843383964078015, 0.8129944247179832, 2.643823301564595, 3.982695614020555, 2.405586147085713, 7.793963209461551};
		double[] v2 = new double[]{8.053307923421496, 4.974794131853422, 7.133604040977065, 6.553829410150888, 5.901039141950938, 8.493448444939638, 3.306575951927442, 5.356351656924932, 2.1694664322957102, 8.091971188878977};
		double res = L2.distance(v1, v2);
		double ref = 14.167867369937609;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{0.4140845087392875, 6.003583849213705, 1.4886049541572322, 0.02549892804812326, 3.5843383964078015, 0.8129944247179832, 2.643823301564595, 3.982695614020555, 2.405586147085713, 7.793963209461551};
		double[] v2 = new double[]{8.053307923421496, 4.974794131853422, 7.133604040977065, 6.553829410150888, 5.901039141950938, 8.493448444939638, 3.306575951927442, 5.356351656924932, 2.1694664322957102, 8.091971188878977};
		double res = L2.distance(v1, v2);
		double ref = 14.167867369937609;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{0.4140845087392875, 6.003583849213705, 1.4886049541572322, 0.02549892804812326, 3.5843383964078015, 0.8129944247179832, 2.643823301564595, 3.982695614020555, 2.405586147085713, 7.793963209461551};
		double[] v2 = new double[]{8.053307923421496, 4.974794131853422, 7.133604040977065, 6.553829410150888, 5.901039141950938, 8.493448444939638, 3.306575951927442, 5.356351656924932, 2.1694664322957102, 8.091971188878977};
		double res = L2.distance(v1, v2);
		double ref = 14.167867369937609;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{433.9033100118817, 506.5028463553747, 84.79347781630054, 37.9359421157176, 434.29086401761396, 858.598152440246, 479.3069271583543, 826.3493636789749, 618.9275859772027, 429.60300272335184};
		double[] v2 = new double[]{253.56161263837174, 741.032854985106, 584.0934906128232, 562.338362457132, 995.3223844178602, 687.6058643443083, 119.15320311603594, 562.0754591470849, 575.9816214349797, 843.3324665486781};
		double res = L2.distance(v1, v2);
		double ref = 1152.5573348578337;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{433.9033100118817, 506.5028463553747, 84.79347781630054, 37.9359421157176, 434.29086401761396, 858.598152440246, 479.3069271583543, 826.3493636789749, 618.9275859772027, 429.60300272335184};
		double[] v2 = new double[]{253.56161263837174, 741.032854985106, 584.0934906128232, 562.338362457132, 995.3223844178602, 687.6058643443083, 119.15320311603594, 562.0754591470849, 575.9816214349797, 843.3324665486781};
		double res = L2.distance(v1, v2);
		double ref = 1152.5573348578337;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{433.9033100118817, 506.5028463553747, 84.79347781630054, 37.9359421157176, 434.29086401761396, 858.598152440246, 479.3069271583543, 826.3493636789749, 618.9275859772027, 429.60300272335184};
		double[] v2 = new double[]{253.56161263837174, 741.032854985106, 584.0934906128232, 562.338362457132, 995.3223844178602, 687.6058643443083, 119.15320311603594, 562.0754591470849, 575.9816214349797, 843.3324665486781};
		double res = L2.distance(v1, v2);
		double ref = 1152.5573348578337;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{798618.2498411107, 700044.1240788859, 103755.0674219273, 134747.88357362244, 879906.0870210258, 873578.4991733774, 364511.3981296292, 550600.3818544231, 503089.0120050464, 692334.6968418249};
		double[] v2 = new double[]{968211.945584103, 482510.339306266, 328938.016257058, 857473.8172651632, 358337.19459081395, 228520.2033437551, 539116.5275505994, 436551.5127633875, 12389.067148031563, 944333.880030457};
		double res = L2.distance(v1, v2);
		double ref = 1298091.498843833;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{798618.2498411107, 700044.1240788859, 103755.0674219273, 134747.88357362244, 879906.0870210258, 873578.4991733774, 364511.3981296292, 550600.3818544231, 503089.0120050464, 692334.6968418249};
		double[] v2 = new double[]{968211.945584103, 482510.339306266, 328938.016257058, 857473.8172651632, 358337.19459081395, 228520.2033437551, 539116.5275505994, 436551.5127633875, 12389.067148031563, 944333.880030457};
		double res = L2.distance(v1, v2);
		double ref = 1298091.498843833;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{798618.2498411107, 700044.1240788859, 103755.0674219273, 134747.88357362244, 879906.0870210258, 873578.4991733774, 364511.3981296292, 550600.3818544231, 503089.0120050464, 692334.6968418249};
		double[] v2 = new double[]{968211.945584103, 482510.339306266, 328938.016257058, 857473.8172651632, 358337.19459081395, 228520.2033437551, 539116.5275505994, 436551.5127633875, 12389.067148031563, 944333.880030457};
		double res = L2.distance(v1, v2);
		double ref = 1298091.498843833;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{9.166480214552626, -7.45044619969822, 1.5996523194289514, -6.189421188315858, -1.1222151257310087, 2.898510444931529, 2.6493881107861608, 4.197742163276997, -6.127905717821678, -2.8688829931434956};
		double[] v2 = new double[]{0.3337440392679514, 2.12110671714993, -6.655209089354247, 8.819279083399286, 4.296833687436279, 2.2458339116584347, -5.282802481432707, 3.4861904494649245, 8.74742719085149, -0.7297202651778756};
		double res = L2.distance(v1, v2);
		double ref = 27.966144724585636;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{9.166480214552626, -7.45044619969822, 1.5996523194289514, -6.189421188315858, -1.1222151257310087, 2.898510444931529, 2.6493881107861608, 4.197742163276997, -6.127905717821678, -2.8688829931434956};
		double[] v2 = new double[]{0.3337440392679514, 2.12110671714993, -6.655209089354247, 8.819279083399286, 4.296833687436279, 2.2458339116584347, -5.282802481432707, 3.4861904494649245, 8.74742719085149, -0.7297202651778756};
		double res = L2.distance(v1, v2);
		double ref = 27.966144724585636;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{9.166480214552626, -7.45044619969822, 1.5996523194289514, -6.189421188315858, -1.1222151257310087, 2.898510444931529, 2.6493881107861608, 4.197742163276997, -6.127905717821678, -2.8688829931434956};
		double[] v2 = new double[]{0.3337440392679514, 2.12110671714993, -6.655209089354247, 8.819279083399286, 4.296833687436279, 2.2458339116584347, -5.282802481432707, 3.4861904494649245, 8.74742719085149, -0.7297202651778756};
		double res = L2.distance(v1, v2);
		double ref = 27.966144724585636;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test33(){
		double[] v1 = new double[]{-113.42634745537961, 971.2290531845756, -256.2441608975238, -745.0272839064612, -494.0167496441735, 546.6020127591293, 541.2781438654887, 666.7170839517179, -793.3768524252173, -26.307286454957833};
		double[] v2 = new double[]{-593.8819133368984, -696.6594967851414, 983.7427627519378, 356.9034009294506, -755.3511985154666, -917.1013669587106, -616.7604115752177, 576.050045073799, 517.802833864277, 639.827214042256};
		double res = L2.distance(v1, v2);
		double ref = 3389.311581898672;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test34(){
		double[] v1 = new double[]{-113.42634745537961, 971.2290531845756, -256.2441608975238, -745.0272839064612, -494.0167496441735, 546.6020127591293, 541.2781438654887, 666.7170839517179, -793.3768524252173, -26.307286454957833};
		double[] v2 = new double[]{-593.8819133368984, -696.6594967851414, 983.7427627519378, 356.9034009294506, -755.3511985154666, -917.1013669587106, -616.7604115752177, 576.050045073799, 517.802833864277, 639.827214042256};
		double res = L2.distance(v1, v2);
		double ref = 3389.311581898672;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test35(){
		double[] v1 = new double[]{-113.42634745537961, 971.2290531845756, -256.2441608975238, -745.0272839064612, -494.0167496441735, 546.6020127591293, 541.2781438654887, 666.7170839517179, -793.3768524252173, -26.307286454957833};
		double[] v2 = new double[]{-593.8819133368984, -696.6594967851414, 983.7427627519378, 356.9034009294506, -755.3511985154666, -917.1013669587106, -616.7604115752177, 576.050045073799, 517.802833864277, 639.827214042256};
		double res = L2.distance(v1, v2);
		double ref = 3389.311581898672;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test36(){
		double[] v1 = new double[]{-370101.5632677646, -674480.3823630817, 537786.0279851835, -385701.3782244434, -513799.1782924679, 485064.9920743211, -907326.7046787501, -280562.8835762809, 300350.3610296183, -731251.7415666067};
		double[] v2 = new double[]{-121953.83309631502, -147738.74608060188, 321713.6093771882, -293736.7936919215, 863913.2342591899, -834715.4315202868, 401351.4024382955, -927090.0049100401, 537167.9335782316, 83066.36607744433};
		double res = L2.distance(v1, v2);
		double ref = 2623723.1047214153;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test37(){
		double[] v1 = new double[]{-370101.5632677646, -674480.3823630817, 537786.0279851835, -385701.3782244434, -513799.1782924679, 485064.9920743211, -907326.7046787501, -280562.8835762809, 300350.3610296183, -731251.7415666067};
		double[] v2 = new double[]{-121953.83309631502, -147738.74608060188, 321713.6093771882, -293736.7936919215, 863913.2342591899, -834715.4315202868, 401351.4024382955, -927090.0049100401, 537167.9335782316, 83066.36607744433};
		double res = L2.distance(v1, v2);
		double ref = 2623723.1047214153;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test38(){
		double[] v1 = new double[]{-370101.5632677646, -674480.3823630817, 537786.0279851835, -385701.3782244434, -513799.1782924679, 485064.9920743211, -907326.7046787501, -280562.8835762809, 300350.3610296183, -731251.7415666067};
		double[] v2 = new double[]{-121953.83309631502, -147738.74608060188, 321713.6093771882, -293736.7936919215, 863913.2342591899, -834715.4315202868, 401351.4024382955, -927090.0049100401, 537167.9335782316, 83066.36607744433};
		double res = L2.distance(v1, v2);
		double ref = 2623723.1047214153;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
	
}
