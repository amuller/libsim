package com.simmachines.libsim.enc.tree;

import org.treelib.TreeFactory;

import com.simmachines.libsim.common.Transformations;

import antlr.RecognitionException;
import antlr.TokenStreamException;

/**
 * [DMRW distance]
 * <p>
 * :: Multi-set distance
 * <p>
 * [Brief Description]
 * <p>
 * DMRW: O(n^3) implementation of ted based on: An Optimal Decomposition
 * Algorithm for Tree Edit Distance Erik D. Demaine, Shay Mozes , Benjamin
 * Rossman, and Oren Weimann
 * <p>
 * [Definition]
 * <p>
 * <p>
 * [Reference]
 * <p>
 * Arnoldo José Müller-Molina, 	Kouichi Hirata, Takeshi Shinohara :: [A Tree Distance Function Based on Multi-sets] :: Springer |
 * 2009
 * <p>
 * | New Frontiers in Applied Data Mining :: P.87 - 98 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas 
 * 
 */


public class DMRW {
	/**
	 * Calculates the DMRW distance
	 * @param o1 First tree (format is: node(child, child child))
	 * @param o2 Second tree (format is: node(child, child child))
	 * @return  the multiset distance between both trees
	 */ 
	public static double distance(String o1, String o2) {
		org.treelib.distance.ted.DMRW t1;
		try {
			t1 = TreeFactory.createTedDWRW(o1);
			org.treelib.distance.ted.DMRW t2 = TreeFactory.createTedDWRW(o2);
			return t1.distance(t2);
		} catch (RecognitionException | TokenStreamException e) {
			throw new IllegalArgumentException(e);
		}								
		
	}
	
	public static double distance(int[] str1, int[] str2){
		return distance(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
}
