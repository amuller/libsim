package com.simmachines.libsim.enc.vector;

import java.util.Map;

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
