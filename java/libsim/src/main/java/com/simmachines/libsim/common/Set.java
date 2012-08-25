package com.simmachines.libsim.common;

import java.util.HashSet;

public interface Set {
	
	public HashSet<Double> intersect(HashSet<Double> c1,HashSet<Double> c2);
	
	public HashSet<Double> union(HashSet<Double> c1,HashSet<Double> c2);
	
	public HashSet<Double> difference(HashSet<Double> c1,HashSet<Double> c2);
}
