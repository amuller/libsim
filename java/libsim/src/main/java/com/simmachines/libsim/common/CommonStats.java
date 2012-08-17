package com.simmachines.libsim.common;

import hep.aida.bin.StaticBin1D;

public class CommonStats {

	public static double mean(double[] vector) {
		StaticBin1D sb = new StaticBin1D();
		for (double d : vector) {
			sb.add(d);
		}
		return sb.mean();
	}
	
}
