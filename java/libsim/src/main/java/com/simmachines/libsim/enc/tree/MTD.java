package com.simmachines.libsim.enc.tree;

import org.treelib.TreeFactory;

import antlr.RecognitionException;
import antlr.TokenStreamException;

import com.simmachines.libsim.common.Transformations;

/**
 * [MTD distance]
 * <p>
 * :: Multi-set distance
 * <p>
 * [Brief Description]
 * <p>
 * MTD: Implementation of the mtd algorithm. This algorithm exploits hash codes
 * from string representation of the tree and its complete subtrees.
 * Additionally, it exploits the fact that once two complete subtrees j and m
 * that belong respectively to trees T1 and T2, the intersection of j and m and
 * all their complete subtrees can be calculated in linear time. This requires
 * to have a value of multiplicity in each node of T1 and T2.
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

public class MTD {
		
		/**
		 * Calculates the MTD distance
		 * @param o1 First tree (format is: node(child, child child))
		 * @param o2 Second tree (format is: node(child, child child))
		 * @return  the multiset distance between both trees
		 */ 
		public static double distance(String o1, String o2) {
				org.treelib.distance.mtd.MTD t1;
				try {
					t1 = TreeFactory.createMTD(o1);
					org.treelib.distance.mtd.MTD t2 = TreeFactory.createMTD(o2);
					return t1.distance(t2);
				} catch (RecognitionException | TokenStreamException e) {
					throw new IllegalArgumentException(e);
				}												
		}
		
		public static double distance(int[] str1, int[] str2){
			return distance(Transformations.convertIntArrayToString(str1), Transformations.convertIntArrayToString(str2));
		}
}


