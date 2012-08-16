package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.Chi;
import com.simmachines.libsim.r01.abst.AbstractVector;
/**
 * [Chi distance]
 * <p>
 * :: Receives two double vectors and calculates the chi square distance
 * <p>
 * [Brief Description]
 * <p>
 * The Chi distance... 
 * <p>
 * [Definition]
 * {@code
 <latex>
 
 The Chi distance between two Vectors <math>a, b</math> is given by <math>\operatorname{Chi_{a,b}(|a|,|b|)</math> where
 
 :<math>latex-formula</math>
 
 </latex>
 * }
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.2 :: Relatives of Euclidean distance :: P.303 |
 * <p>
 * @see <a href="http://wikipedia-article">Wikipedia Article</a>
 * 
 * @author Juan Francisco Quesada-Brizuela author
 * 
 */
public class RAChi extends AbstractVector{
		/** 
		 * Default constructor required by R-01
		 */
		public RAChi(){
				
		}
		
		/**
		 * Copy constructor
		 * @param obj double vector
		 */ 
		public RAChi(double[] obj){
				super(obj);
		}
		
		/**
		 * Parse a vector from a String
		 * @param line String that contains an encoded version of the object. 
		 */
		public RAChi(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes that implement RA. 
		 * @see java.lang.Object#clone()
		 */
		public Object clone() {	
				return new RAChi(cloneHelper());
		}
		
		/** Calculates the Chi distance between this and
		 *  @param other sequence of doubles
		 *  @return The minimum number of inserts, deletes and renames required to convert one sequence of symbols into the other.
		 */ 
		@Override
				public Double distance(RA<Double> other) {
				return Double.valueOf(Chi.distance(super.getVector(),
						((AbstractVector) other).getVector()));
		}
		
}
