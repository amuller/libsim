package com.simmachines.libsim.enc.string;

/**
 * Calculates the cost of replacing two symbols. 
 * @author amuller
 *
 */
public interface CostCalculator {
	
	
	int cost(int a, int b);

}
