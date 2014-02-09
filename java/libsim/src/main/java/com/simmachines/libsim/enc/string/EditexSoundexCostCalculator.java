package com.simmachines.libsim.enc.string;

public class EditexSoundexCostCalculator implements CostCalculator {

	
	
	
	/**
	 * Receives two integer numbers that represent two characters, and calculates the cost of substitution of one for the other.
	 * @param ch1 integer number 1.
	 * @param ch2 integer number 2.
	 * @return 0 if ch1 and ch2 are the same character, 1 if they are different but both are classified in the same group, and 2 otherwise.
	 */
	
	public  int cost(int ch1,int ch2){
		if(ch1==ch2){
			return 0;
		}
		if(groupCode(ch1) == groupCode(ch2)){
			return 1;
		}
		return 2;
	}
	
	/*
	public static int compare(int target, int[] elems, int cost){
		for(int e : elems){
			if(target == e){
				return cost;
			}
		}
		
		return -1;
	}
	
	public static int[] prepare (char[] input){
		int[] res = new int[input.length * 2];
		int src = 0;
		int target = 0;
		while(src < res.length){
			res[target] = (int) input[src];
			target++;
			res[target] = (int) Character.toUpperCase(input[src]);
			target++;
			src++;
		}
		return res;
	}
	
	static int[] groupZero = prepare(new char[]{'a', 'i', 'u', 'w', 'e', 'o', 'h', 'y'});
	static int[] groupOne = prepare(new char[]{'b', 'f'});
	
	public int myGroupCode(int ch){
		int r = compare(ch, groupZero, 0);
		if(r != -1){
			return r;
		}
		
		r = compare(ch, groupOne, 1);
		if(r != -1){
			return r;
		}
	}*/
	
	/**
	 * Receives an integer that represents a character, and returns the group code in which it is classified.
	 * The characters of the alphabet are grouped according to Soundex method.
	 * @param ch integer received.
	 * @return the group code.
	 */
	public int groupCode(int ch){		
		if(ch == (int) 'a'|| ch == (int) 'A' || ch == (int) 'e'|| ch == (int) 'E'||
		   ch == (int) 'i'|| ch == (int) 'I' || ch == (int) 'o'|| ch == (int) 'O'||
		   ch == (int) 'u'|| ch == (int) 'U' || ch == (int) 'h'|| ch == (int) 'H'||
		   ch == (int) 'w'|| ch == (int) 'W' || ch == (int) 'y'|| ch == (int) 'Y'){
			return 0;
		}
		if(ch == (int) 'b'|| ch == (int) 'B' || ch == (int) 'p'|| ch == (int) 'P'||
		   ch == (int) 'f'|| ch == (int) 'F' || ch == (int) 'v'|| ch == (int) 'V'){
			return 1;
		}
		if(ch == (int) 'g'|| ch == (int) 'G' || ch == (int) 'j'|| ch == (int) 'J'||
		   ch == (int) 'k' || ch == (int) 'K' || ch == (int) 'q'|| ch == (int) 'Q'||
		   ch == (int) 'c' || ch == (int) 'C' || ch == (int) 's'|| ch == (int) 'S'||
		   ch == (int) 'x'|| ch == (int) 'X' || ch == (int) 'z'|| ch == (int) 'Z'){
			return 2;
		}
		if(ch == (int) 'd'|| ch == (int) 'D' || ch == (int) 't'|| ch == (int) 'T'){
			return 3;
		}
		if(ch == (int) 'l'|| ch == (int) 'L'){
			return 4;
		}
		if(ch == (int) 'm'|| ch == (int) 'M' || ch == (int) 'n'|| ch == (int) 'N'){
			return 5;
		}
		if(ch == (int) 'r'|| ch == (int) 'R'){
			return 6;
		}
		return 0;
	}

}
