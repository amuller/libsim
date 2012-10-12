package com.simmachines.libsim.enc.string;

public class DefaultCostCalculator  implements CostCalculator{ 

public  int cost(int s_i, int t_j){
	int cost;
	if (s_i == t_j) {
		cost = 0;
	} else {
		cost = 1;
	}
	return cost;
}
}