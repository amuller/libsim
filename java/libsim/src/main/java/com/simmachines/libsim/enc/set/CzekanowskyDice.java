package com.simmachines.libsim.enc.set;


/**
 * [Czekanowsky_Dice distance]
 * <p>
 * :: The Dice coefficient, is a similarity measure over sets.
 * <p>
 * [Brief Description]
 * <p>
 * It is identical to the Sørensen similarity index, and is occasionally referred to as the Sørensen-Dice coefficient. The function ranges between zero and one.
 * <p>
 * [Definition]
 * <p>
 
 
 The Czekanowsky_Dice distance between two sets \(a,b\) is given by \( \operatorname{d}_{a,b}(|a|,|b|) \) where:
 <p>
 \( d(A,B)=1-\frac{2|A \cap B|}{|A|+|B|} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.299 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Dice's_coefficient">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class CzekanowskyDice {
	
	/**
	 * Receives two Double sets and calculates the Czekanowsky_Dice distance.
	 * @param s1 set number 1
	 * @param s2 set number 2
	 * @return The Czekanowsky_Dice distance. 
	 */
	
	public static double distance(SHashSet<Double> s1,SHashSet<Double> s2){
		return 1-((2*s1.intersect(s2).size())/(s1.size()+s2.size()));
	}

}
