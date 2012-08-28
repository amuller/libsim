package com.simmachines.libsim.enc.set;

import java.util.HashSet;

public interface Set {
	
	public Set intersect(HashSet<Double> c1,HashSet<Double> c2);
	
	public Set union(HashSet<Double> c1,HashSet<Double> c2);
	
	public Set difference(HashSet<Double> c1,HashSet<Double> c2);
}
