package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestLP {

	@Test
	//jdsalazar
	public void test1() {
		double[] v1 = new double[]{8,3,4};
		double[] v2 = new double[]{5,9,7};
		double p = 3;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(p, 1);
		double res = LP.distance(p, v1, v2);
		Asserts.assertEquals(res, 6.46330407009565);
	}
	
	@Test
	//jdsalazar
	public void test2() {
		double[] v1 = new double[]{821,-345,498,-6,-230,-754};
		double[] v2 = new double[]{543,-965,-718,852,-329,97};
		double p = 5.7;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(p, 1);
		double res = LP.distance(p, v1, v2);
		Asserts.assertEquals(res, 1271.46862280352653);
	}
	
	
	@Test
	//jdsalazar
	public void test3() {
		double[] v1 = new double[]{821.04,-345.001,498.15,-6.658,-230.14,-754.34};
		double[] v2 = new double[]{543.27,-965.364,-718.2,852.004,-329.036,97.412};
		double p = 9.435;
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(p, 1);
		double res = LP.distance(p, v1, v2);
		Asserts.assertEquals(res, 1225.56826706042989);
	}
	
	@Test
	//jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double p = 2;
		double res = LP.distance(p, v1, v2);
		double ref = 7.416198487095663;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double p = 38;
		double res = LP.distance(p, v1, v2);
		double ref = 5.000027325603852;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{8, 5, 8, 2, 1, 1, 5, 0, 3, 3};
		double[] v2 = new double[]{1, 0, 1, 1, 7, 5, 2, 8, 5, 0};
		double p = 25.228097112062684;
		double res = LP.distance(p, v1, v2);
		double ref = 8.021358281277505;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{8, 5, 8, 2, 1, 1, 5, 0, 3, 3};
		double[] v2 = new double[]{1, 0, 1, 1, 7, 5, 2, 8, 5, 0};
		double p = 7;
		double res = LP.distance(p, v1, v2);
		double ref = 8.811163807152566;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{8, 5, 8, 2, 1, 1, 5, 0, 3, 3};
		double[] v2 = new double[]{1, 0, 1, 1, 7, 5, 2, 8, 5, 0};
		double p = 6;
		double res = LP.distance(p, v1, v2);
		double ref = 9.093237658169558;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{992, 121, 89, 539, 869, 843, 912, 185, 818, 913};
		double[] v2 = new double[]{331, 341, 245, 646, 711, 780, 307, 54, 300, 669};
		double p = 31;
		double res = LP.distance(p, v1, v2);
		double ref = 662.340468501455;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{992, 121, 89, 539, 869, 843, 912, 185, 818, 913};
		double[] v2 = new double[]{331, 341, 245, 646, 711, 780, 307, 54, 300, 669};
		double p = 7.113478705206577;
		double res = LP.distance(p, v1, v2);
		double ref = 712.816184430945;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{992, 121, 89, 539, 869, 843, 912, 185, 818, 913};
		double[] v2 = new double[]{331, 341, 245, 646, 711, 780, 307, 54, 300, 669};
		double p = 27.262512965519115;
		double res = LP.distance(p, v1, v2);
		double ref = 663.1107596371029;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{120816, 283812, 9434, 616694, 670275, 452884, 182983, 243490, 939400, 462149};
		double[] v2 = new double[]{391392, 352692, 661660, 217989, 664170, 277746, 740792, 129576, 949254, 92360};
		double p = 15;
		double res = LP.distance(p, v1, v2);
		double ref = 656248.5125330919;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{4, -6, 6, 5, -6, 5, -1, 3, 4, -6};
		double[] v2 = new double[]{-4, 6, -5, -1, -1, -6, -1, 8, -3, 4};
		double p = 87.67024374671873;
		double res = LP.distance(p, v1, v2);
		double ref = 12.000133127846306;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{4, -6, 6, 5, -6, 5, -1, 3, 4, -6};
		double[] v2 = new double[]{-4, 6, -5, -1, -1, -6, -1, 8, -3, 4};
		double p = 70;
		double res = LP.distance(p, v1, v2);
		double ref = 12.00077485598083;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{4, -6, 6, 5, -6, 5, -1, 3, 4, -6};
		double[] v2 = new double[]{-4, 6, -5, -1, -1, -6, -1, 8, -3, 4};
		double p = 37.52311094896908;
		double res = LP.distance(p, v1, v2);
		double ref = 12.023885355045792;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{492, 722, -10, -910, -281, -913, 565, 820, 402, 26};
		double[] v2 = new double[]{311, 334, -380, -882, 440, 301, 119, 924, -458, -899};
		double p = 94.44235841458266;
		double res = LP.distance(p, v1, v2);
		double ref = 1214.0000000000907;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{492, 722, -10, -910, -281, -913, 565, 820, 402, 26};
		double[] v2 = new double[]{311, 334, -380, -882, 440, 301, 119, 924, -458, -899};
		double p = 97;
		double res = LP.distance(p, v1, v2);
		double ref = 1214.000000000041;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{492, 722, -10, -910, -281, -913, 565, 820, 402, 26};
		double[] v2 = new double[]{311, 334, -380, -882, 440, 301, 119, 924, -458, -899};
		double p = 46;
		double res = LP.distance(p, v1, v2);
		double ref = 1214.0001011291756;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{-422568, 920064, 845829, 51805, -77206, 811138, -33117, 878024, -97223, 969038};
		double[] v2 = new double[]{-532039, 100186, 423053, 348399, 274765, 280983, -368147, 441160, 435290, 427712};
		double p = 10;
		double res = LP.distance(p, v1, v2);
		double ref = 823529.3548048987;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{-422568, 920064, 845829, 51805, -77206, 811138, -33117, 878024, -97223, 969038};
		double[] v2 = new double[]{-532039, 100186, 423053, 348399, 274765, 280983, -368147, 441160, 435290, 427712};
		double p = 40;
		double res = LP.distance(p, v1, v2);
		double ref = 819878.0024592764;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{9.500806945025971, 6.164034866188849, 3.912410389246417, 7.707439883460072, 5.793942895336532, 3.2826107269108973, 6.533534034642568, 6.5954474924831175, 1.9209647758936932, 5.5056357508952996};
		double[] v2 = new double[]{8.49449008754142, 6.648751982325237, 6.478384978724981, 1.8356254037536113, 9.627961797825042, 1.068673562444843, 2.194486679155795, 7.558496654789623, 9.12468266830256, 4.334796006214711};
		double p = 84.77388161407508;
		double res = LP.distance(p, v1, v2);
		double ref = 7.203717894936412;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{9.500806945025971, 6.164034866188849, 3.912410389246417, 7.707439883460072, 5.793942895336532, 3.2826107269108973, 6.533534034642568, 6.5954474924831175, 1.9209647758936932, 5.5056357508952996};
		double[] v2 = new double[]{8.49449008754142, 6.648751982325237, 6.478384978724981, 1.8356254037536113, 9.627961797825042, 1.068673562444843, 2.194486679155795, 7.558496654789623, 9.12468266830256, 4.334796006214711};
		double p = 64.94317436134;
		double res = LP.distance(p, v1, v2);
		double ref = 7.20371808255343;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{9.500806945025971, 6.164034866188849, 3.912410389246417, 7.707439883460072, 5.793942895336532, 3.2826107269108973, 6.533534034642568, 6.5954474924831175, 1.9209647758936932, 5.5056357508952996};
		double[] v2 = new double[]{8.49449008754142, 6.648751982325237, 6.478384978724981, 1.8356254037536113, 9.627961797825042, 1.068673562444843, 2.194486679155795, 7.558496654789623, 9.12468266830256, 4.334796006214711};
		double p = 9.795674490622385;
		double res = LP.distance(p, v1, v2);
		double ref = 7.30338984364248;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{359.9579306444464, 960.7312803709696, 89.80345128082811, 945.0099676165711, 178.60911903306564, 503.6306515887522, 549.7474692678419, 331.0186935529198, 222.41636416210298, 49.770680200432736};
		double[] v2 = new double[]{977.8629987843931, 109.53257926589166, 391.84518553323613, 263.42534857103516, 326.52079610360187, 826.5517640858893, 579.8374676303416, 506.49741250299974, 541.1741176893471, 772.5824882475426};
		double p = 10;
		double res = LP.distance(p, v1, v2);
		double ref = 876.7471070504054;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{359.9579306444464, 960.7312803709696, 89.80345128082811, 945.0099676165711, 178.60911903306564, 503.6306515887522, 549.7474692678419, 331.0186935529198, 222.41636416210298, 49.770680200432736};
		double[] v2 = new double[]{977.8629987843931, 109.53257926589166, 391.84518553323613, 263.42534857103516, 326.52079610360187, 826.5517640858893, 579.8374676303416, 506.49741250299974, 541.1741176893471, 772.5824882475426};
		double p = 55;
		double res = LP.distance(p, v1, v2);
		double ref = 851.2007021133804;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{359.9579306444464, 960.7312803709696, 89.80345128082811, 945.0099676165711, 178.60911903306564, 503.6306515887522, 549.7474692678419, 331.0186935529198, 222.41636416210298, 49.770680200432736};
		double[] v2 = new double[]{977.8629987843931, 109.53257926589166, 391.84518553323613, 263.42534857103516, 326.52079610360187, 826.5517640858893, 579.8374676303416, 506.49741250299974, 541.1741176893471, 772.5824882475426};
		double p = 99.4153298583102;
		double res = LP.distance(p, v1, v2);
		double ref = 851.1987018546005;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{721029.4406644551, 536036.0331675485, 756019.305401209, 369415.1779921624, 12387.742590731832, 273493.51595713466, 793470.2342677673, 652388.6359273122, 84764.25783040887, 974195.3729564988};
		double[] v2 = new double[]{654150.8085320374, 435502.8506330867, 194681.96966157836, 63409.19151408409, 194992.69236042982, 442584.79092221835, 513261.9438210676, 912952.6552284833, 373752.1433534321, 686962.799715993};
		double p = 36;
		double res = LP.distance(p, v1, v2);
		double ref = 561337.3357461266;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{721029.4406644551, 536036.0331675485, 756019.305401209, 369415.1779921624, 12387.742590731832, 273493.51595713466, 793470.2342677673, 652388.6359273122, 84764.25783040887, 974195.3729564988};
		double[] v2 = new double[]{654150.8085320374, 435502.8506330867, 194681.96966157836, 63409.19151408409, 194992.69236042982, 442584.79092221835, 513261.9438210676, 912952.6552284833, 373752.1433534321, 686962.799715993};
		double p = 30.34894595459341;
		double res = LP.distance(p, v1, v2);
		double ref = 561337.336000359;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{1.8373082388344075, -0.7118364134968491, 3.812650511379224, -3.196270325577241, -0.3721245046325672, 7.137940784452864, -6.16486591556238, 6.846532131819254, 9.24074791424545, 7.809437559678552};
		double[] v2 = new double[]{-1.949813812833645, -0.911229678427663, 8.005381757428944, -3.9248890555522586, -1.2311345818971486, -2.076050351407288, 2.5359621064768136, 3.1586327572774033, -7.170341989121916, 6.198043526514525};
		double p = 44.15717955498499;
		double res = LP.distance(p, v1, v2);
		double ref = 16.411089903370787;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{1.8373082388344075, -0.7118364134968491, 3.812650511379224, -3.196270325577241, -0.3721245046325672, 7.137940784452864, -6.16486591556238, 6.846532131819254, 9.24074791424545, 7.809437559678552};
		double[] v2 = new double[]{-1.949813812833645, -0.911229678427663, 8.005381757428944, -3.9248890555522586, -1.2311345818971486, -2.076050351407288, 2.5359621064768136, 3.1586327572774033, -7.170341989121916, 6.198043526514525};
		double p = 97.93739781216063;
		double res = LP.distance(p, v1, v2);
		double ref = 16.411089903367362;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{1.8373082388344075, -0.7118364134968491, 3.812650511379224, -3.196270325577241, -0.3721245046325672, 7.137940784452864, -6.16486591556238, 6.846532131819254, 9.24074791424545, 7.809437559678552};
		double[] v2 = new double[]{-1.949813812833645, -0.911229678427663, 8.005381757428944, -3.9248890555522586, -1.2311345818971486, -2.076050351407288, 2.5359621064768136, 3.1586327572774033, -7.170341989121916, 6.198043526514525};
		double p = 16;
		double res = LP.distance(p, v1, v2);
		double ref = 16.411229865971027;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test33(){
		double[] v1 = new double[]{710.191259659179, -352.8506941967797, -93.60639998878251, 282.37142534665395, -72.68374727939775, -654.9055511943958, -643.655501327875, -516.5991495013965, 295.6682930746838, 111.97474342571834};
		double[] v2 = new double[]{833.2344024906043, -489.0252803913375, 33.235129522342646, 444.7238416617797, -713.6807752329219, 391.91163402028474, 461.13096106181825, -856.3267971470532, 728.3346479399695, 933.0777015877717};
		double p = 88.98880563318777;
		double res = LP.distance(p, v1, v2);
		double ref = 1104.8885963087298;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test34(){
		double[] v1 = new double[]{710.191259659179, -352.8506941967797, -93.60639998878251, 282.37142534665395, -72.68374727939775, -654.9055511943958, -643.655501327875, -516.5991495013965, 295.6682930746838, 111.97474342571834};
		double[] v2 = new double[]{833.2344024906043, -489.0252803913375, 33.235129522342646, 444.7238416617797, -713.6807752329219, 391.91163402028474, 461.13096106181825, -856.3267971470532, 728.3346479399695, 933.0777015877717};
		double p = 13.312311645221175;
		double res = LP.distance(p, v1, v2);
		double ref = 1139.4047956833044;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test35(){
		double[] v1 = new double[]{710.191259659179, -352.8506941967797, -93.60639998878251, 282.37142534665395, -72.68374727939775, -654.9055511943958, -643.655501327875, -516.5991495013965, 295.6682930746838, 111.97474342571834};
		double[] v2 = new double[]{833.2344024906043, -489.0252803913375, 33.235129522342646, 444.7238416617797, -713.6807752329219, 391.91163402028474, 461.13096106181825, -856.3267971470532, 728.3346479399695, 933.0777015877717};
		double p = 82;
		double res = LP.distance(p, v1, v2);
		double ref = 1104.9477050588846;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test38(){
		double[] v1 = new double[]{902130.1073314352, 246377.8946189279, -277889.6325704163, -667772.34806861, -921779.6249731211, -612414.2150602565, -714055.0282938541, 908937.0105608648, -588257.5633952632, 285378.48588335747};
		double[] v2 = new double[]{294501.2067259808, 904048.8089709593, 91598.97222160584, 731100.0962504292, 228713.13711570372, 882090.9932138838, -296493.83265220607, 196760.5312820072, -283725.88729284896, -749494.436772235};
		double p = 1;
		double res = LP.distance(p, v1, v2);
		double ref = 8147801.108110025;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}
}
