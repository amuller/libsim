package com.simmachines.libsim.common;

public class CommonCheck {

	private static double precision = 0.00001;
	
	public static boolean Check2Doubles(double a, double b){
		return ((a - b) <= precision);
	}
}
