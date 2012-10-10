package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.CommonStats;


/**
 * [EditexSoundex distance]
 * <p>
 * :: The Editex distance between two words x and y is a cost-based editing metric, is the minimal cost of transforming x into y by substitution, deletion and insertion of letters.
 * The letter classification into groups is according the Soundex method, in which each group have a code depending of the letters  contained, the codes are:
 * 0 to a, e, h, i, o, u, w, y;
 * 1 to b, p, f, v; 
 * 2 to c, g, j, k, q, s, x, z; 
 * 3 to d, t; 
 * 4 to l;
 * 5 to m, n;
 * 6 to r.

 * <p>
 * [Definition]
 * <p>
 
 
 The EditexSoundex distance between two strings \(a,b\) is given by:
 <p>
 The minimal cost of transforming x into y by substitution, deletion and insertion of letters, where the costs are:
 $->$ 1 for insertion and deletion.
 And for substitutions the costs are:
 $->$ 0 if both letters are the same.
 $->$ 1 if both letters are in the same group.
 $->$ 2 otherwise.
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 28.3 :: Distances in Perception, Cognition and Language :: P.528 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class EditexSoundex {	
	
	/**
	 * Receives an integer that represents a character, and returns the group code in which it is classified.
	 * The character of the alphabet are representing by a consecutive integer number starting with a=1, b=2, until z=26; and they are grouped according to Soundex method.
	 * @param ch integer received.
	 * @return the group code.
	 */
	public static int groupCode(int ch){
		if(ch==1||ch==5||ch==9||ch==15||ch==21||ch==8||ch==23||ch==25){
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
	
	/**
	 * Receives two integer numbers that represent two characters, and calculates the cost of substitution of one for the other.
	 * @param ch1 integer number 1.
	 * @param ch2 integer number 2.
	 * @return 0 if ch1 and ch2 are the same character, 1 if they are different but both are classified in the same group, and 2 otherwise.
	 */
	public static int editCost(int ch1,int ch2){
		if(ch1==ch2){
			return 0;
		}
		if(groupCode(ch1)==groupCode(ch2)){
			return 1;
		}
		return 2;
	}

	
	/**
	 * Received two integer vectors representing two words and calculates the EditexSoundex distance.
	 * @param str1 vector number 1.
	 * @param str2 vector number 2.
	 * @return The EditexSoundex distance, the minimal cost of transforming str1 into str2 by substitution, deletion and insertion of letters.
	 */
	public static double distance(int str1[],int str2[]){
		int m = str1.length;
		int n = str2.length;
		int min = CommonStats.min(m, n);
		double sum = 0;
		for(int i=0;i<min;i++){
			sum += editCost(str1[i],str2[i]);
		}
		sum += Math.abs(m-n);
		return sum;
	}
	
}
