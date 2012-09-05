package com.simmachines.libsim.enc.set;



/**
 * [Tanimoto distance]
 * <p>
 * :: Is a statistic used for comparing the similarity and diversity of sample sets.
 * <p>
 * [Brief Description]
 * <p>
 * The Tanimoto distance (or Jaccard distance), measures dissimilarity between sample sets, and is obtained by subtracting the Jaccard coefficient from 1; the Jaccard coefficient is defined as the size of the intersection divided by the size of the union of the sample sets. 
 * <p>
 * [Definition]
 * <p>
 
 
 The Tanimoto distance between two sets \(a,b\) is given by \( \operatorname{J_\delta}_{a,b}(|a|,|b|) \) where:
 <p>
 \( J_\delta(A,B)=1-\frac{|A \cap B|}{|A \cup B|} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.299 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Jaccard_index">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class Tanimoto {
	
	/**
	 * Receives two Double sets and calculates the Tanimoto (Jaccard) distance.
	 * @param s1 set number 1
	 * @param s2 set number 2
	 * @return The Tanimoto distance. 
	 */
	
	public static double distance(Set s1,Set s2){
		return 1-(s1.intersect(s2).size()/s1.union(s2).size());
	}

}
