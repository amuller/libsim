package com.simmachines.libsim.common;

public class Transformations {

	/**
	 * Converts a string into an integer array that represents it.
	 * @param str string to convert.
	 * @return an integer array that represents the string received.
	 */
	public static int[] convertStringToIntArray(String str){
		int[] res = new int[str.length()];
		int i = 0;
		while(i < str.length()){
			res[i] = str.charAt(i);
			i++;
		}
		return res;
	}
	
	
	public static String convertIntArrayToString(int[] str){
		StringBuilder b = new StringBuilder();
		for(int i : str){
			b.appendCodePoint(i);
		}
		return b.toString();
	}

}
