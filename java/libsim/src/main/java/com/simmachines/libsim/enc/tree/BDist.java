package com.simmachines.libsim.enc.tree;

import org.treelib.TreeFactory;

import com.simmachines.libsim.common.Transformations;

import antlr.RecognitionException;
import antlr.TokenStreamException;

/**
 * [BDist distance]
 * <p>
 * :: Multi-set distance
 * <p>
 * [Brief Description]
 * <p>
 * BDist Fast matching of trees using q-gramms for trees and other stuff taken
 * from the article: Similarity Evaluation on Tree-structured data Rui Yang,
 * Panos Kalnis Anthony K. H. Tung The heuristic that works as a nearest
 * neighbor engine is likely broken. The triangle-inequality function BDist has
 * been validated.
 * <p>
 * [Definition]
 * <p>
 
 
 The BDist distance between two trees \(a,b\) is given by:
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


public class BDist {

	/**
	 * Calculates the BDist distance
	 * @param o1 First tree (format is: node(child, child child))
	 * @param o2 Second tree (format is: node(child, child child))
	 * @return  the multiset distance between both trees
	 */ 
	public static double distance(String o1, String o2) {
		org.treelib.distance.bdist.BDist t1;
		try {
			t1 = TreeFactory.createBDist(o1);
			org.treelib.distance.bdist.BDist t2 = TreeFactory.createBDist(o2);
			return t1.distance(t2);
		} catch (RecognitionException | TokenStreamException e) {
			throw new IllegalArgumentException(e);
		}								
		
	}
	
	public static double distance(int[] str1, int[] str2){
		return distance(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
}
