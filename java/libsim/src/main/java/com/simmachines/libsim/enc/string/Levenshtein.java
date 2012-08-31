package com.simmachines.libsim.enc.string;

import com.simmachines.libsim.common.CommonStats;

/**
 * [Levenshtein distance]
 * <p>
 * :: Compares the similarity between two strings based on edit operations.
 * <p>
 * [Brief Description]
 * <p>
 * The Levenshtein distance between two strings is defined as the minimum number
 * of edits needed to transform one string into the other, with the allowable
 * edit operations being insertion, deletion, or substitution of a single
 * character.
 * <p>
 * [Definition]
 * <p>
 * 
 * Mathematically, the Levenshtein distance between two strings \(a, b\)  is given by \( \operatorname{lev}_{a,b}(|a|,|b|) \) where
 * <p>
 * \( \qquad\operatorname{lev}_{a,b}(i,j) = \begin{cases} 0 &, i=j=0 \\ i &,
 * j = 0 \land i > 0 \\ j &, i = 0 \land j > 0 \\ \min \begin{cases}
 * \operatorname{lev}_{a,b}(i-1,j) + 1 \\ \operatorname{lev}_{a,b}(i,j-1) + 1 \\
 * \operatorname{lev}_{a,b}(i-1,j-1) + [a_i \neq b_j] \end{cases} &, \text{
 * else} \end{cases} \)
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 11.1 :: Distances on General Strings :: P. 202 |
 * <p>
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Levenshtein_distance">Wikipedia
 *      Article</a>
 * 
 * @author Arnoldo Jose Muller-Molina
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
				d[i][j] = CommonStats.min(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1]
						+ cost);

			}

		}

		return d[n][m];
	}

}
