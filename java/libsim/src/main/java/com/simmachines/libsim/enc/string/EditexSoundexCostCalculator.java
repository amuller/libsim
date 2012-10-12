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
	
	/**
	 * Receives an integer that represents a character, and returns the group code in which it is classified.
	 * The character of the alphabet are represented by a consecutive integer number starting with a=1, b=2, until z=26; and they are grouped according to Soundex method.
	 * @param ch integer received.
	 * @return the group code.
	 */
	public int groupCode(int ch){
		if(ch == (int) 'a'|| ch == (int) 'A' || 
				ch==5||ch==9||ch==15||ch==21||ch==8||ch==23||ch==25){
			return 0;
		}
		if(ch==2||ch==16||ch==6||ch==22){
			return 1;
		}
		if(ch==7||ch==10||ch==11||ch==17||ch==3||ch==19||ch==24||ch==26){
			return 2;
		}
		if(ch==4||ch==20){
			return 3;
		}
		if(ch==12){
			return 4;
		}
		if(ch==13||ch==14){
			return 5;
		}
		if(ch==18){
			return 6;
		}
		return -1;
	}

}
