package com.simmachines.libsim.enc.vector;

import java.io.File;
import java.util.Map;
import com.simmachines.libsim.enc.vector.PhoneticWordFactory;

public class PhoneticWord {
	
	
	public static PhoneticWordFactory fact = null;
	/**
	 * Call this method before using the Phonetic word distance
	 * @param dictionary
	 * @param includeAccents
	 */
	public static void initializeFactory(File dictionary, boolean includeAccents){
		
		PhoneticWordFactory wf = new PhoneticWordFactory(includeAccents);
		String[] lines = null;		
		for(String line : lines){
			String[] cols = line.split("\\s");
			int i = 1;
			while(i < cols.length){
				wf.add(cols[i]);
				i++;
			}
			wf.addWord(cols);
		}
		fact = wf; 
	}
	
	
	
	public static double distance( String w1, String w2){
		// 1 llamar al factory para transformar w1 y w2 
		// 2 llamar al Levenstein. 
		return -1;
	}

}
