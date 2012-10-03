package com.simmachines.libsim.enc.vector;

import java.util.Arrays;

import com.simmachines.libsim.common.CommonStats;


/**
 * [ModifiedHausdorff distance]
 * <p>
 * :: The modified Hausdorff distance is the greatest of all the distances from a point in one set to the closest point in the other set.
 * <p>
 * [Brief Description]
 * <p>
 * The modified Hausdorff distance is defined as the maximum of point-set distances averaged over two binary images, seen as non-empty finite subsets of a finite metric space.
 * <p>
 * [Definition]
 * <p>
 
 
 The ModifiedHausdorff distance between two vectors \(a,b\) is given by:
 <p>
 \( d_H = max\{ \frac{1}{|A|} \sum_{x \in A} d(x,B) , \frac{1}{|B|} \sum_{x \in B} d(x,A) \} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 21.1 :: Image distances :: P.360 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Hausdorff_distance">Wikipedia Article</a>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */

public class ModifiedHausdorff {

	/**
	 * Calculates the distance between the key and the closest value from the array.
	 * @param array array to compare.
	 * @param key key to be compared.
	 * @return the distance between the key and the closest value from the array.
	 */
	
	public static double keyToArrayDistance(double array[], double key){
		int x = Arrays.binarySearch(array, key);
		if(x >= 0){
			return 0;
		}
		else{
			x = (x*-1)-1;
			if(x == array.length){
				return Math.abs(key - array[x-1]);
			}
			else{
				if(x == 0){
					return Math.abs(key - array[x]);
				}
				else{
					return CommonStats.min(Math.abs(key - array[x]), Math.abs(key - array[x-1]));
				}
			}
		}
	}
	
	
	/**
	 * Received two double vectors and calculates the ModifiedHausdorff distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The ModifiedHausdorff distance.
	 */
	
	public static double distance(double v1[], double v2[]){
		double sumV1 = 0;
		double sumV2 = 0;
		for(int i=0;i<v1.length;i++){
			sumV1 += keyToArrayDistance(v2,v1[i]);
			sumV2 += keyToArrayDistance(v1,v2[i]);
		}
		return CommonStats.max(sumV1/v1.length, sumV2/v2.length);
	}
	
}
