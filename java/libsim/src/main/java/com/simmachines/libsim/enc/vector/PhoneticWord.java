package com.simmachines.libsim.enc.vector;

import java.io.File;
import java.util.Map;

public class PhoneticWord {
	
	
	public static PhoneticWordFactory getFactory(File dictionary, boolean includeAccents){
		
		PhoneticWordFactory wf = new PhoneticWordFactory(includeAccents);
		String[] lines = null;		
		for(String line : lines){
			String[] cols = line.split("\\s");
			int i = 1;
			while(i < cols.length){
				wf.add(cols[i]);
				i++;
			}
		}
		return null;
	}
	
	public class PhoneticWordFactory{
		Map<String, Integer>  m ; // maps phonemes to ints. 
		private boolean considerAccents; 
		private int count;
		public PhoneticWordFactory(boolean considerAccents){
			this.considerAccents = considerAccents;
			count = 0;			 
		}
		
		public void add(String phoneme){
			Integer id = m.get(phoneme);
			if(id == null){
				m.put(phoneme, id);
				id++;
			}
		}
	}

}
