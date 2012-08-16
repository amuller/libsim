package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.PearsonCorrelation;
import com.simmachines.libsim.r01.abst.AbstractVector;
/**
 * [PearsonCorrelation distance]
 * <p>
 * :: The correlation similarity (or Pearson Correlation) is a similarity on  \( \mathbb{R}^n \).
 * <p>
 * [Brief Description]
 * <p>
 * The Pearson Correlation (or by its full name, Pearson product-moment correlation linear coefficient)
 * is a measure of the correlation (linear dependence) between two variables X and Y, giving a value between +1 and -1 inclusive. The dissimilarity (1-s) is called the Pearson Correlation distance, giving a value between 0 and 2 inclusive.
 * <p>
 * [Definition]
 * <p>
 * 
 
 The PearsonCorrelation distance between two Vectors (a, b) is given by \( \operatorname{s}_{a,b}(|a|,|b|) \) where:
 <p>
\( \operatorname{s}_{a,b}(|a|,|b|) = 1-\frac{\sum(a_i-\overline{a})(b_i-\overline{b})}{\sqrt{(\sum (a_j-\overline{a})^2)(\sum (b_j-\overline{b})^2)}} \)
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.4 :: Correlation similarities and distances :: P.307 |
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Pearson_product-moment_correlation_coefficient">Wikipedia Article</a>
 * 
 * @author  Jose Daniel Salazar-Vargas
 * 
 */
public class RAPearsonCorrelation extends AbstractVector{
		/** 
		 * Default constructor required by R-01
		 */
		public RAPearsonCorrelation(){
				
		}
		
		public RAPearsonCorrelation(double[] vector){
				super(vector);
		}
		
		/**
		 * Parse a vector from a tab separated list of values. 
		 * @param line
		 */
		public RAPearsonCorrelation(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes. 
		 */
		@Override
				public Object clone() {	
				return new RAPearsonCorrelation(cloneHelper());
		}
		
		
		@Override
				public Double distance(RA<Double> other) {
				return PearsonCorrelation.distance(getVector(), ((RAPearsonCorrelation)other).getVector());
		}
		
}
