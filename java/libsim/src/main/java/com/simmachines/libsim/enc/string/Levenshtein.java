package com.simmachines.libsim.enc.string;

/**
 * [Levenshtein distance]
 * <p>
 * @see com.simmachines.libsim.r01.vector.RALevenshtein
 * @see <a href="http://en.wikipedia.org/wiki/Levenshtein_distance">Wikipedia Article</a>
 * 
 * @author Arnoldo J. Muller Molina
 * 
 */
public class Levenshtein {
	
	
	/**
     * Calculates the Levenshtein distance
     * @param str1 first sequence of characters
     * @param str2 second sequence of characters
     * @return  The minimum number of insert, delete and rename operations required to transform str1 to str2.
     */ 
	public static int distance(int[] str1, int[] str2) {

		int d[][];
		int n;
		int m;
		int i;
		int j;
		int s_i;
		int t_j;
		int cost;
		int[] s = str1;
		int[] t = str2;

		n = s.length;
		m = t.length;
		if (n == 0) {
			return m;
		}
		if (m == 0) {
			return n;
		}
		// initialize dynamic programming matrix. 
		d = new int[n + 1][m + 1];

		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}

		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}

		for (i = 1; i <= n; i++) {

			s_i = s[i - 1];

			for (j = 1; j <= m; j++) {

				t_j = t[j - 1];
				// cost values 
				if (s_i == t_j) {
					cost = 0;
				} else {
					cost = 1;
				}
				// update dp matrix 
				d[i][j] = min(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1]
						+ cost);

			}

		}

		return d[n][m];
	}

	private static int min(int a, int b, int c) {
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

}
