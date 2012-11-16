package com.simmachines.libsim.enc.tree;

import org.treelib.TreeFactory;

import com.simmachines.libsim.common.Transformations;

import antlr.RecognitionException;
import antlr.TokenStreamException;

/**
 * [ShashaAndZhangReferenceImpl distance]
 * <p>
 * :: Multi-set distance
 * <p>
 * [Brief Description]
 * <p>
 * ShashaAndZhangReferenceImpl Classic O(n^4) implementation of TED.
 * <p>
 * [Definition]
 * <p>
 
 
 The ShashaAndZhangReferenceImpl distance between two trees \(a,b\) is given by:
 <p>
 \( latex-formula \)
 
 
 * 
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


public class ShashaAndZhangReferenceImpl {

	/**
	 * Calculates the ShashaAndZhangReferenceImpl distance
	 * @param o1 First tree (format is: node(child, child child))
	 * @param o2 Second tree (format is: node(child, child child))
	 * @return  the multiset distance between both trees
	 */ 
	public static double distance(String o1, String o2) {
		org.treelib.distance.ted.ShashaAndZhangReferenceImpl t1;
		try {
			t1 = TreeFactory.createTedShashaZhang(o1);
			org.treelib.distance.ted.ShashaAndZhangReferenceImpl t2 = TreeFactory.createTedShashaZhang(o2);
			return t1.distance(t2);
		} catch (RecognitionException | TokenStreamException e) {
			throw new IllegalArgumentException(e);
		}								
		
	}
	
	public static double distance(int[] str1, int[] str2){
		return distance(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
	
}
