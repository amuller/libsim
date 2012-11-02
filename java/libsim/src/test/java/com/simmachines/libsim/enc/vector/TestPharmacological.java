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
		Asserts.assertEquals(res, 1095887.4985170974);
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
		Asserts.assertEquals(res, 7.416198487095663);
	}

	@Test
	//jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 7.416198487095663);
	}

	@Test
	//jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{9, 7, 9, 9, 5};
		double[] v2 = new double[]{7, 3, 4, 2, 5};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 9.695359714832659);
	}

	@Test
	//jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{3, 8, 9, 9, 3};
		double[] v2 = new double[]{4, 2, 6, 6, 8};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 8.94427190999916);
	}

	@Test
	//jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{142, 903, 440, 113, 978};
		double[] v2 = new double[]{952, 744, 46, 807, 761};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1168.478497876619);
	}

	@Test
	//jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{809, 733, 821, 489, 798};
		double[] v2 = new double[]{308, 49, 175, 636, 247};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1208.876751368807);
	}

	@Test
	//jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{580301, 478198, 90875, 93524, 683651};
		double[] v2 = new double[]{999288, 251121, 268289, 181766, 513475};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 543448.5431335702);
	}

	@Test
	//jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{690942, 693540, 588869, 558417, 683952};
		double[] v2 = new double[]{168013, 605595, 708412, 394950, 5449};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 884628.3807413145);
	}

	@Test
	//jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{9, -3, 1, 9, -9};
		double[] v2 = new double[]{7, 6, -9, 0, -5};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 16.792855623746664);
	}

	@Test
	//jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{2, 7, 7, 8, -1};
		double[] v2 = new double[]{-7, -5, -6, 1, -8};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 22.181073012818835);
	}

	@Test
	//jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{-201, -662, 715, 777, 595};
		double[] v2 = new double[]{94, -876, -52, 42, -220};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1387.6454878678487);
	}

	@Test
	//jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{-672, -411, -815, 831, -954};
		double[] v2 = new double[]{-599, 911, 95, 993, 576};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 2224.467801520175);
	}

	@Test
	//jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{201210, 471726, 190367, 544060, 687900};
		double[] v2 = new double[]{222572, -358213, -572218, -236493, 151306};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1472408.5939830018);
	}

	@Test
	//jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{123155, 768324, 499018, -731060, -1439};
		double[] v2 = new double[]{-365891, 612329, 326963, 139263, 515427};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1147918.089173178);
	}

	@Test
	//jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{0.42423816665772773, 0.5289561330743187, 5.478492751044391, 8.99833894708496, 3.7474652384646614};
		double[] v2 = new double[]{1.0023406559414427, 3.9366841371302383, 5.282377139996278, 4.693859117643609, 2.6974565552597953};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 5.622840812926576);
	}

	@Test
	//jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{8.82141892195385, 1.9613567151423283, 1.4427876756340319, 4.372356541586825, 7.262637370913776};
		double[] v2 = new double[]{9.006106795000212, 4.131831025218721, 8.571496143973505, 6.499959715583824, 5.069856105187038};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 8.05596286691114);
	}

	@Test
	//jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{698.9559644575644, 624.3717987049206, 774.7435475109133, 7.65982134237253, 360.01677822099174};
		double[] v2 = new double[]{988.1606750634804, 610.2754429323777, 826.2886639850296, 233.31947822086707, 372.68996875136827};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 370.91489780782206);
	}

	@Test
	//jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{172.7362911189041, 840.4028126714999, 574.2964428103439, 352.4662764571188, 733.8075763893271};
		double[] v2 = new double[]{695.1509132437802, 810.1218516233026, 720.957162964167, 558.8101943974966, 638.0414201891707};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 589.1454064933848);
	}

	@Test
	//jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{844371.9683366903, 347591.5752109505, 34716.10371591394, 421520.5656922045, 107723.44013132884};
		double[] v2 = new double[]{910737.7819600181, 198621.0865144442, 413197.3629068394, 343694.151407411, 552499.676958498};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 611332.595962032);
	}

	@Test
	//jfquesada
	public void auto_test20(){
		double[] v1 = new double[]{743574.8733356188, 583889.6071599623, 432600.0688568682, 11046.686282237706, 234100.45404758252};
		double[] v2 = new double[]{257905.5117203456, 770098.056494756, 651357.7274829153, 167886.47023339465, 917454.2349357215};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 899985.7422798241);
	}

	@Test
	//jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{3.67434005961039E8, 5.445028247352527E8, 8.835419632402004E8, 2.6579201953657806E8, 3.5614649907191086E8};
		double[] v2 = new double[]{7.251728680836365E8, 8.582075179651326E8, 7.592013016184229E8, 7.379778287353548E8, 3.3072609777308947E8};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 6.822418657416606E8);
	}

	@Test
	//jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{4.775837051884231E8, 5.695369972747199E7, 4.993125774999561E8, 4.073541923057086E8, 4.101356996061934E8};
		double[] v2 = new double[]{1.4054288915870428E8, 7.861444676926247E8, 5.388524365531762E8, 7.98390792208143E8, 6.123638081618717E8};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 9.168887165642296E8);
	}

	@Test
	//jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{7.986303322578912E11, 5.835234815831423E11, 6.851800138773755E11, 2.884928191642322E9, 5.439159010572669E10};
		double[] v2 = new double[]{3.592320550574235E9, 7.321186122263745E10, 9.400716894618055E11, 5.359818561617924E10, 5.215482350539068E11};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1.0854862143825568E12);
	}

	@Test
	//jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{9.189603470504929E11, 5.532893934286864E11, 4.990152608087817E10, 3.719901320644895E11, 2.10749534749336E11};
		double[] v2 = new double[]{8.558465731048566E11, 4.7293456774970575E11, 8.369774018356394E11, 9.666422282834666E11, 1.4633606125104858E11};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 9.938253829382819E11);
	}

	@Test
	//jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{-1.878275985794563, 6.5203177907198935, -1.9181243597148445, 0.9613359302074864, -4.73097279998569};
		double[] v2 = new double[]{2.684332409572016, 3.5532910671548112, -4.299763386592675, 0.6335597560970463, 0.9837857768168812};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 8.249772737089158);
	}

	@Test
	//jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{-7.005241636604074, 0.4165056334789241, 9.944662747935627, 9.36845801424426, 3.56961735218062};
		double[] v2 = new double[]{-7.145443266957981, 8.692879514328961, 5.811395377776753, -9.645205862768686, -1.2737966807396994};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 21.69285582371088);
	}

	@Test
	//jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{-515.3500539426759, 503.0945651816564, -315.73475378836855, 150.63283784090387, 608.2594825460243};
		double[] v2 = new double[]{-498.7077970067311, -1.7522945794526956, 253.16088695523266, -190.94389318651207, -600.6269246937982};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1468.6288078926646);
	}

	@Test
	//jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{-2.5579882779327434, -313.35821723321146, -739.8455688950205, -65.83115326885935, 494.6401246072276};
		double[] v2 = new double[]{900.418234710428, 997.0789751476248, -858.4654593929913, -15.729379398106591, 752.9132339433372};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1617.3736611031425);
	}

	@Test
	//jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{-773381.0960056505, -332022.4839511692, -895576.8429069832, 351398.2461806506, 262306.8474523057};
		double[] v2 = new double[]{-403085.0136781523, -152335.28899003312, -357812.4530064214, -294920.8420417094, 344338.8530204431};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 939709.9708970485);
	}

	@Test
	//jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{-747719.0816647372, -537394.9663060114, 879575.1574720539, -814858.30007851, 370624.2610584865};
		double[] v2 = new double[]{530350.013857059, 912239.3206166251, 579579.2086250887, -766280.0802962395, 20270.705190624016};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1987462.001050753);
	}

	@Test
	//jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{-7.64298178809648E8, 4.973508654929132E8, 2.470802469177359E8, 9.259947931076747E8, 9.841047324084226E8};
		double[] v2 = new double[]{4.414774413770369E8, -2.5675708837175947E8, 6.799839957811532E8, 1.2463870450977276E8, -9.060207816944087E8};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 2.5347041933712835E9);
	}

	@Test
	//jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{-7.40964817714612E8, -1.941560344930482E8, 6.118957907331965E8, 3.1662607188712996E8, -1.415425842433078E8};
		double[] v2 = new double[]{-2.978705857144272E8, -7.503446330140972E8, 8.061067715751064E8, -3.394917504418291E8, 3.9165786957613826E8};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1.1216904570188594E9);
	}

	@Test
	//jfquesada
	public void auto_test33(){
		double[] v1 = new double[]{-6.74999513065239E11, 1.7040445016220474E11, 9.609229212293859E11, -3.359008611670453E11, 8.667921036575442E11};
		double[] v2 = new double[]{-3.6687126014354346E11, 5.915497154030183E11, -2.5891839976975305E11, 4.3147757393649176E11, 5.789674605105763E11};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 1.5594973199607908E12);
	}

	@Test
	//jfquesada
	public void auto_test34(){
		double[] v1 = new double[]{6.493138462451904E11, 6.048044992294552E11, -4.457984949624627E11, 6.634027365136376E11, -9.241615586579679E11};
		double[] v2 = new double[]{-8.76849498193214E11, -5.65164126770053E11, 7.826308323425574E11, 2.6911457321737708E11, 4.7292731660818146E11};
		double res = Pharmacological.distance(v1, v2);
		Asserts.assertEquals(res, 2.7045073919332573E12);
	}

	
}
