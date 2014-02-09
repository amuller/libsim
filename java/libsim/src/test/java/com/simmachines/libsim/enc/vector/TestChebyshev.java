package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestChebyshev {

	@Test
	//jdsalazar
	public void test1(){
		double[] v1 = new double[]{8,3,7};
		double[] v2 = new double[]{9,8,4};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 5);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		double[] v1 = new double[]{8,-32,7,0,-45};
		double[] v2 = new double[]{97,-78,41,-4,-78};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 89);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		double[] v1 = new double[]{248.124,-321.574,788.14,0.001,-459.298};
		double[] v2 = new double[]{97.145,-78.658,417.0004,-4.02,-7865.3594};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 7406.0614);
	}
	
	@Test
	//jfquesada
	public void test4(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 1, 1, 1, 1};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 1.0);
	}
	
	@Test
	//jfquesada
	public void test5(){
		double[] v1 = new double[]{1, 1, 1, 1, 1};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 1.0);
	}
	
	@Test
	//jfquesada
	public void test6(){
		double[] v1 = new double[]{638, 398, 337, 529, 514};
		double[] v2 = new double[]{689, 869, 383, 706, 620};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 471.0);
	}
	
	@Test
	//jfquesada
	public void test7(){
		double[] v1 = new double[]{-2, 6, -4, -8, 5};
		double[] v2 = new double[]{-6, 4, -5, -7, 3};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 4.0);
	}
	
	@Test
	//jfquesada
	public void test8(){
		double[] v1 = new double[]{19415.212429584662, 191257.52282304363, 913239.9167389673, 566196.942598401, 153677.14241202734};
		double[] v2 = new double[]{208269.3339067423, 664207.5606130534, 76527.14625467494, 767410.7016052309, 602059.2951081641};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 836712.7704842924);
	}
	
	@Test
	//jfquesada
	public void test9(){
		double[] v1 = new double[]{9.629962536879205E8, -1.6826823387640044E8, -1.172045780576203E8, 6.409943660337736E7, 3.0154528518528813E8};
		double[] v2 = new double[]{3.2714922830083424E8, 5.708280820465017E7, -6.131738568306583E8, -6.433943832389486E8, 8.06844862750207E8};
		double res = Chebyshev.distance(v1, v2);
		Asserts.assertEquals(res, 7.074938198423259E8);
	}
	
@Test
	//jfquesada
	public void auto_test1(){
		double[] v1 = new double[]{0, 0, 0, 0, 0};
		double[] v2 = new double[]{1, 2, 3, 4, 5};
		double res = Chebyshev.distance(v1, v2);
		double ref = 5;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test2(){
		double[] v1 = new double[]{1, 2, 3, 4, 5};
		double[] v2 = new double[]{0, 0, 0, 0, 0};
		double res = Chebyshev.distance(v1, v2);
		double ref = 5;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test3(){
		double[] v1 = new double[]{1, 2, 2, 8, 8, 8, 3, 6, 3, 7};
		double[] v2 = new double[]{2, 9, 9, 1, 5, 0, 5, 6, 4, 8};
		double res = Chebyshev.distance(v1, v2);
		double ref = 8;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test4(){
		double[] v1 = new double[]{1, 2, 2, 8, 8, 8, 3, 6, 3, 7};
		double[] v2 = new double[]{2, 9, 9, 1, 5, 0, 5, 6, 4, 8};
		double res = Chebyshev.distance(v1, v2);
		double ref = 8;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test5(){
		double[] v1 = new double[]{1, 2, 2, 8, 8, 8, 3, 6, 3, 7};
		double[] v2 = new double[]{2, 9, 9, 1, 5, 0, 5, 6, 4, 8};
		double res = Chebyshev.distance(v1, v2);
		double ref = 8;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test6(){
		double[] v1 = new double[]{289, 423, 764, 31, 110, 890, 300, 130, 583, 831};
		double[] v2 = new double[]{483, 639, 851, 653, 425, 49, 654, 420, 71, 625};
		double res = Chebyshev.distance(v1, v2);
		double ref = 841;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test7(){
		double[] v1 = new double[]{289, 423, 764, 31, 110, 890, 300, 130, 583, 831};
		double[] v2 = new double[]{483, 639, 851, 653, 425, 49, 654, 420, 71, 625};
		double res = Chebyshev.distance(v1, v2);
		double ref = 841;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test8(){
		double[] v1 = new double[]{289, 423, 764, 31, 110, 890, 300, 130, 583, 831};
		double[] v2 = new double[]{483, 639, 851, 653, 425, 49, 654, 420, 71, 625};
		double res = Chebyshev.distance(v1, v2);
		double ref = 841;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test9(){
		double[] v1 = new double[]{83377, 729141, 207995, 974161, 890304, 82786, 455559, 222167, 254617, 799157};
		double[] v2 = new double[]{943901, 709313, 264407, 524096, 863942, 343693, 196468, 104362, 461887, 146613};
		double res = Chebyshev.distance(v1, v2);
		double ref = 860524;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test10(){
		double[] v1 = new double[]{83377, 729141, 207995, 974161, 890304, 82786, 455559, 222167, 254617, 799157};
		double[] v2 = new double[]{943901, 709313, 264407, 524096, 863942, 343693, 196468, 104362, 461887, 146613};
		double res = Chebyshev.distance(v1, v2);
		double ref = 860524;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test11(){
		double[] v1 = new double[]{83377, 729141, 207995, 974161, 890304, 82786, 455559, 222167, 254617, 799157};
		double[] v2 = new double[]{943901, 709313, 264407, 524096, 863942, 343693, 196468, 104362, 461887, 146613};
		double res = Chebyshev.distance(v1, v2);
		double ref = 860524;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test12(){
		double[] v1 = new double[]{-9, 0, 7, 8, 8, 3, -8, 8, -8, 4};
		double[] v2 = new double[]{2, -6, 8, -3, 8, -7, -4, -5, -6, 7};
		double res = Chebyshev.distance(v1, v2);
		double ref = 13;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test13(){
		double[] v1 = new double[]{-9, 0, 7, 8, 8, 3, -8, 8, -8, 4};
		double[] v2 = new double[]{2, -6, 8, -3, 8, -7, -4, -5, -6, 7};
		double res = Chebyshev.distance(v1, v2);
		double ref = 13;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test14(){
		double[] v1 = new double[]{-9, 0, 7, 8, 8, 3, -8, 8, -8, 4};
		double[] v2 = new double[]{2, -6, 8, -3, 8, -7, -4, -5, -6, 7};
		double res = Chebyshev.distance(v1, v2);
		double ref = 13;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test15(){
		double[] v1 = new double[]{723, -938, 99, -891, -222, -422, -17, 315, 239, 58};
		double[] v2 = new double[]{871, 483, -363, 339, 978, 7, -709, 953, -26, -10};
		double res = Chebyshev.distance(v1, v2);
		double ref = 1421;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test16(){
		double[] v1 = new double[]{723, -938, 99, -891, -222, -422, -17, 315, 239, 58};
		double[] v2 = new double[]{871, 483, -363, 339, 978, 7, -709, 953, -26, -10};
		double res = Chebyshev.distance(v1, v2);
		double ref = 1421;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test17(){
		double[] v1 = new double[]{723, -938, 99, -891, -222, -422, -17, 315, 239, 58};
		double[] v2 = new double[]{871, 483, -363, 339, 978, 7, -709, 953, -26, -10};
		double res = Chebyshev.distance(v1, v2);
		double ref = 1421;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test18(){
		double[] v1 = new double[]{-160981, 255876, -797827, 74690, 778562, -979317, -884774, 898795, 848613, -937663};
		double[] v2 = new double[]{-487262, 59836, 261323, -757389, -616671, 527189, 185117, -897186, 291292, -819447};
		double res = Chebyshev.distance(v1, v2);
		double ref = 1795981;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test19(){
		double[] v1 = new double[]{-160981, 255876, -797827, 74690, 778562, -979317, -884774, 898795, 848613, -937663};
		double[] v2 = new double[]{-487262, 59836, 261323, -757389, -616671, 527189, 185117, -897186, 291292, -819447};
		double res = Chebyshev.distance(v1, v2);
		double ref = 1795981;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test20(){
		double[] v1 = new double[]{-160981, 255876, -797827, 74690, 778562, -979317, -884774, 898795, 848613, -937663};
		double[] v2 = new double[]{-487262, 59836, 261323, -757389, -616671, 527189, 185117, -897186, 291292, -819447};
		double res = Chebyshev.distance(v1, v2);
		double ref = 1795981;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test21(){
		double[] v1 = new double[]{0.14585894248884568, 2.414997372025618, 4.487165074828786, 4.783992098781644, 6.371013863042933, 5.548350237532969, 0.6232127747435601, 9.504836849153481, 3.12080025157952, 6.377159713468855};
		double[] v2 = new double[]{3.6256167589517254, 6.953522002498883, 2.4997127443650804, 4.00008084529028, 2.395510600903777, 5.589272475438482, 7.755172214916009, 9.642741906965135, 8.416940655626787, 8.251071764787454};
		double res = Chebyshev.distance(v1, v2);
		double ref = 7.13195944017245;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test22(){
		double[] v1 = new double[]{0.14585894248884568, 2.414997372025618, 4.487165074828786, 4.783992098781644, 6.371013863042933, 5.548350237532969, 0.6232127747435601, 9.504836849153481, 3.12080025157952, 6.377159713468855};
		double[] v2 = new double[]{3.6256167589517254, 6.953522002498883, 2.4997127443650804, 4.00008084529028, 2.395510600903777, 5.589272475438482, 7.755172214916009, 9.642741906965135, 8.416940655626787, 8.251071764787454};
		double res = Chebyshev.distance(v1, v2);
		double ref = 7.13195944017245;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test23(){
		double[] v1 = new double[]{0.14585894248884568, 2.414997372025618, 4.487165074828786, 4.783992098781644, 6.371013863042933, 5.548350237532969, 0.6232127747435601, 9.504836849153481, 3.12080025157952, 6.377159713468855};
		double[] v2 = new double[]{3.6256167589517254, 6.953522002498883, 2.4997127443650804, 4.00008084529028, 2.395510600903777, 5.589272475438482, 7.755172214916009, 9.642741906965135, 8.416940655626787, 8.251071764787454};
		double res = Chebyshev.distance(v1, v2);
		double ref = 7.13195944017245;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test24(){
		double[] v1 = new double[]{57.893535887405974, 929.2352024183152, 636.178976323308, 865.5819632583574, 807.0723744899535, 614.3529437012545, 159.64524835538464, 106.17435302216293, 510.53437363909546, 334.51574300683416};
		double[] v2 = new double[]{992.6258984685936, 353.31613668963115, 429.96435147751555, 32.12758237825919, 214.9974528392754, 5.7143219964932435, 629.3242906094608, 528.4725805749803, 229.55294947171123, 313.95774795225304};
		double res = Chebyshev.distance(v1, v2);
		double ref = 934.7323625811877;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test25(){
		double[] v1 = new double[]{57.893535887405974, 929.2352024183152, 636.178976323308, 865.5819632583574, 807.0723744899535, 614.3529437012545, 159.64524835538464, 106.17435302216293, 510.53437363909546, 334.51574300683416};
		double[] v2 = new double[]{992.6258984685936, 353.31613668963115, 429.96435147751555, 32.12758237825919, 214.9974528392754, 5.7143219964932435, 629.3242906094608, 528.4725805749803, 229.55294947171123, 313.95774795225304};
		double res = Chebyshev.distance(v1, v2);
		double ref = 934.7323625811877;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test26(){
		double[] v1 = new double[]{57.893535887405974, 929.2352024183152, 636.178976323308, 865.5819632583574, 807.0723744899535, 614.3529437012545, 159.64524835538464, 106.17435302216293, 510.53437363909546, 334.51574300683416};
		double[] v2 = new double[]{992.6258984685936, 353.31613668963115, 429.96435147751555, 32.12758237825919, 214.9974528392754, 5.7143219964932435, 629.3242906094608, 528.4725805749803, 229.55294947171123, 313.95774795225304};
		double res = Chebyshev.distance(v1, v2);
		double ref = 934.7323625811877;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test27(){
		double[] v1 = new double[]{763703.3658362805, 247046.10935171533, 376946.3749054234, 644759.3344925713, 222604.21403319796, 508614.5930699645, 207639.45559601448, 656725.1283135377, 491831.1144089552, 401086.3239601926};
		double[] v2 = new double[]{625114.797681936, 400986.11326331913, 274904.7261532154, 786845.8557946007, 369502.1855550831, 622724.5151951156, 997934.6590473392, 226024.85159420627, 471897.5289885381, 958571.050098187};
		double res = Chebyshev.distance(v1, v2);
		double ref = 790295.2034513247;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test28(){
		double[] v1 = new double[]{763703.3658362805, 247046.10935171533, 376946.3749054234, 644759.3344925713, 222604.21403319796, 508614.5930699645, 207639.45559601448, 656725.1283135377, 491831.1144089552, 401086.3239601926};
		double[] v2 = new double[]{625114.797681936, 400986.11326331913, 274904.7261532154, 786845.8557946007, 369502.1855550831, 622724.5151951156, 997934.6590473392, 226024.85159420627, 471897.5289885381, 958571.050098187};
		double res = Chebyshev.distance(v1, v2);
		double ref = 790295.2034513247;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test29(){
		double[] v1 = new double[]{763703.3658362805, 247046.10935171533, 376946.3749054234, 644759.3344925713, 222604.21403319796, 508614.5930699645, 207639.45559601448, 656725.1283135377, 491831.1144089552, 401086.3239601926};
		double[] v2 = new double[]{625114.797681936, 400986.11326331913, 274904.7261532154, 786845.8557946007, 369502.1855550831, 622724.5151951156, 997934.6590473392, 226024.85159420627, 471897.5289885381, 958571.050098187};
		double res = Chebyshev.distance(v1, v2);
		double ref = 790295.2034513247;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test30(){
		double[] v1 = new double[]{-4.662526115763155, 3.0004575891715337, 6.777498511459113, 3.24659240970961, -7.9719942673074975, 0.8398750202392846, -1.8464834981194567, -5.81978398540241, -2.9476545412128985, -4.769427981269084};
		double[] v2 = new double[]{-2.170994711401115, -3.971293409582808, -7.495525777073457, -8.724768710836631, 1.3510500474981157, -5.540835973785935, 7.13896128914716, -2.181278249865671, -5.210883526489346, 0.3242008988833234};
		double res = Chebyshev.distance(v1, v2);
		double ref = 14.27302428853257;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test31(){
		double[] v1 = new double[]{-4.662526115763155, 3.0004575891715337, 6.777498511459113, 3.24659240970961, -7.9719942673074975, 0.8398750202392846, -1.8464834981194567, -5.81978398540241, -2.9476545412128985, -4.769427981269084};
		double[] v2 = new double[]{-2.170994711401115, -3.971293409582808, -7.495525777073457, -8.724768710836631, 1.3510500474981157, -5.540835973785935, 7.13896128914716, -2.181278249865671, -5.210883526489346, 0.3242008988833234};
		double res = Chebyshev.distance(v1, v2);
		double ref = 14.27302428853257;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

	@Test
	//jfquesada
	public void auto_test32(){
		double[] v1 = new double[]{-4.662526115763155, 3.0004575891715337, 6.777498511459113, 3.24659240970961, -7.9719942673074975, 0.8398750202392846, -1.8464834981194567, -5.81978398540241, -2.9476545412128985, -4.769427981269084};
		double[] v2 = new double[]{-2.170994711401115, -3.971293409582808, -7.495525777073457, -8.724768710836631, 1.3510500474981157, -5.540835973785935, 7.13896128914716, -2.181278249865671, -5.210883526489346, 0.3242008988833234};
		double res = Chebyshev.distance(v1, v2);
		double ref = 14.27302428853257;
		Asserts.assertDistance(ref);
		Asserts.assertEquals(res, ref);
	}

 

}
