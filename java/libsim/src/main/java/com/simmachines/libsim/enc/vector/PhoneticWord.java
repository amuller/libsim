package com.simmachines.libsim.enc.vector;

import java.io.File;
import java.util.Map;

public class PhoneticWord {
	
	
	public static PhoneticWordFactory fact = null;
	/**
	 * Call this method before using the Phonetic word distance
	 * @param dictionary
	 * @param includeAccents
	 * @return
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
	
	public class PhoneticWordFactory{
		
		Map<String, Integer>  m ; // maps phonemes to ints. 
		private boolean considerAccents; 
		private int count;
		Map<String, int[]> dictionary;
		public PhoneticWordFactory(boolean considerAccents){
			this.considerAccents = considerAccents;
			count = 0;			 
		}
		
		public void add(String phoneme){
			Integer id = m.get(phoneme);
			if(id == null){
				m.put(phoneme, count);
				count++;
			}
		}
		
		public void addWord(String[] entry){
			String word = entry[0];
			int i = 1;
			// load the rest of words 
			int[] translation = new int[word.length()];
			while(i < translation.length){
				translation[i - 1] = m.get(translation[i]);
				i++;
			}
			dictionary.put(word, translation);
		}
		
		
		public int[] convertWord(String word){
			return dictionary.get(word);
		}
	}
	
	public static double distance( String w1, String w2){
		// 1 llamar al factory para transformar w1 y w2 
		// 2 llamar al Levenstein. 
		return -1;
	}

}
