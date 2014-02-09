package com.simmachines.libsim.enc.tree;

import org.treelib.TreeFactory;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.simmachines.libsim.common.Transformations;

/**
 * [LevTed distance]
 * <p>
 * :: Multi-set distance
 * <p>
 * [Brief Description]
 * <p>
 * This is a highly experimental tree edit distance based on the following
 * steps: 1) Convert an arbitrary tree into a binary tree. 2) The binary tree
 * can be projected into a sparse string 3) Calculate the Levensthein distance of the
 * string.  In my experiments, most of the time it returns a value that is pretty
 * close to the Tree edit distance. The only difference is that it is *much*
 * cheaper to compute than TED. Try it and let us know what do you think. This
 * is not a metric and I am still not sure if it satisfies the triangle
 * inequality in tree spaces.
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


public class LevTed {
	/**
	 * Calculates the LevTed distance
	 * @param o1 First tree (format is: node(child, child child))
	 * @param o2 Second tree (format is: node(child, child child))
	 * @return  the multiset distance between both trees
	 */ 
	public static double distance(String o1, String o2) {
		org.treelib.distance.levted.LevTed t1;
		try {
			t1 = TreeFactory.createLevTed(o1);
			org.treelib.distance.levted.LevTed t2 = TreeFactory.createLevTed(o2);
			return t1.distance(t2);
		} catch (RecognitionException | TokenStreamException e) {
			throw new IllegalArgumentException(e);
		}								
		
	}
	
	public static double distance(int[] str1, int[] str2){
		return distance(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
	}
}
