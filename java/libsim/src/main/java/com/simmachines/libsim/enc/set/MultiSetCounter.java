package com.simmachines.libsim.enc.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MultiSetCounter<O> {
	
	private Map<O, IntegerCounter> m; 
	
	public MultiSetCounter(){
		m = new HashMap<O, IntegerCounter>();
	}
	
	public String toString(){
		return m.toString();
	}
	
	public boolean contains(O key){
		return m.containsKey(key);
	}
	
	public void add(O obj){
		IntegerCounter cnt = m.get(obj);
		if(cnt == null){
			cnt = new IntegerCounter();
			m.put(obj, cnt);
		}
		cnt.inc(); 
	}
	
	public int keySize(){
		return m.size();
	}
	
	public void addAmount(O obj, int inc){
		IntegerCounter cnt = m.get(obj);
		if(cnt == null){
			cnt = new IntegerCounter();
			m.put(obj, cnt);
		}
		cnt.add(inc);
	}
	
	public int get(O obj){
		IntegerCounter c = m.get(obj);
		if(c == null){
			throw new IllegalArgumentException("Key not found: " + obj);
		}else{
			return m.get(obj).getCnt();
		}
		
	}
	
	public Map.Entry<O, IntegerCounter> getMax(){
		Map.Entry<O, IntegerCounter> res = null;
		for(Map.Entry<O, IntegerCounter> e : m.entrySet()){
			if(res == null || res.getValue().getCnt() < e.getValue().getCnt()){
				res = e;
			}
		}
		return res;
	}
	/**
	 * Returns a list of entries sorted by cardinality (largest cardinality in the beginning of the array).
	 * @return
	 */
	public List<Map.Entry<O, IntegerCounter>> getSortedResults(){
		List<Map.Entry<O, IntegerCounter>> res = new ArrayList<Map.Entry<O, IntegerCounter>>(m.size());
		for(Map.Entry<O, IntegerCounter> e : m.entrySet()){
			res.add(e);
		}
		Collections.sort(res,new MSetComparator());
		return res;
	}
	
	
	
	public MultiSetCounter<O> multiSetComplement(MultiSetCounter<O> other){
		MultiSetCounter<O> comp = new MultiSetCounter<O>();
		for(Map.Entry<O, IntegerCounter> e : m.entrySet()){
			if(other.contains(e.getKey())){
				if(e.getValue().getCnt()>other.get(e.getKey())){
					comp.addAmount(e.getKey(), e.getValue().getCnt()-other.get(e.getKey()));
				}
			}
			else{
				comp.addAmount(e.getKey(), e.getValue().getCnt());
			}
		}
		return comp;
	}
	
	
	public int totalSize(){
		int res = 0;
		for(Map.Entry<O, IntegerCounter> e : m.entrySet()){
			res += e.getValue().getCnt();
		}
		return res;
	}
	
	
	
	protected class MSetComparator implements Comparator<Map.Entry<O,IntegerCounter>>{

		@Override
		public int compare(Entry<O, IntegerCounter> o1,
				Entry<O, IntegerCounter> o2) {
			if(o1.getValue().getCnt() < o1.getValue().getCnt()){
				return 1;
			}else if(o1.getValue().getCnt() > o1.getValue().getCnt()){
				return -1;
			}else{
				return 0;
			}
		}
		
	}
	
	public class IntegerCounter {
		private int cnt;
		IntegerCounter(){
			this.cnt = 0;
		}
		public void inc(){
			cnt++;
		}
		
		public void add(int val){
			cnt += val;
		}
		
		public int getCnt(){
			return cnt;
		}
		
		public String toString(){
			return String.valueOf(cnt);
		}
		
	}

}
