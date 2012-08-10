package com.simmachines.libsim.r01.abst;

import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;

public class Leven extends AbstractByteArray<Integer> {
	protected String str;
	
	public Leven(){
		
	}
	
	public Leven(String x){		
		this.str = x;
	}
	
	public int length(){
		return str.length();
	}

	@Override
	public Integer distance(RA<Integer> RAject)  {
		Leven o = (Leven) RAject;
		int d[][];
	    int n; 
	    int m;
	    int i; 
	    int j; 
	    char s_i;
	    char t_j;
	    int cost; 
	    String s = str;
	    String t = o.str;

	      n = s.length();
	      m = t.length();
	      if (n == 0) {
	        return m;
	      }
	      if (m == 0) {
	        return n;
	      }
	      d = new int[n+1][m+1];


	      for (i = 0; i <= n; i++) {
	        d[i][0] = i;
	      }

	      for (j = 0; j <= m; j++) {
	        d[0][j] = j;
	      }


	      for (i = 1; i <= n; i++) {

	        s_i = s.charAt(i - 1);

	        for (j = 1; j <= m; j++) {

	          t_j = t.charAt(j - 1);


	          if (s_i == t_j) {
	            cost = 0; 
	          }           
	          else {
	            cost = 1;
	          }


	          d[i][j] = min (d[i-1][j]+1, d[i][j-1]+1, d[i-1][j-1] + cost);

	        }

	      }


	      return d[n][m];
	}
	
	private int min (int a, int b, int c) {
        int mi;

          mi = a;
          if (b < mi) {
            mi = b;
          }
          if (c < mi) {
            mi = c;
          }
          return mi;

        }
	
	
	public boolean equals(RA<Integer> o){
		return str.equals(((Leven)o).str);
	}
	
	@Override
	public boolean equals(Object obj){
		return str.equals(((Leven)obj).str);
	}

	@Override
	public int hashCode() {
		return str.hashCode();
	}

	@Override
	public void load(byte[] input) throws RAException {
		str = new String(input);

	}

	@Override
	public byte[] store() throws RAException{
		return str.getBytes();
	}

	@Override
	public String toString(){
		return str;
	}

	@Override
	public Object clone() {
		return new Leven(new String(str));
	}

	

	
}
