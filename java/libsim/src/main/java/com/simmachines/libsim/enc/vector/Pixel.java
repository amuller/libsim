package com.simmachines.libsim.enc.vector;
import org.apache.commons.math.linear.RealMatrix;

/**
 * [Pixel distance]
 * <p>
 * :: The pixel distance is an image distance between two digital images seen as binary matrices.
 * <p>
 * [Definition]
 * <p>
 
 
 The Pixel distance between two binary \( m \times n \) matrices \(a,b\) is given by:
 <p>
 \( d = \sum_{1\leq i\leq m}\sum_{1\leq j\leq n} |a_{ij}-b_{ij}|(DBW(a_{ij})+DBW(b_{ij})) \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 21.1 :: Image distances :: P.359 |
 * <p>
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Pixel {
	
	
	/**
	 * For each pixel \( x_{ij} \) , the fringe distance map to the nearest pixel of opposite color \( DBW(x_{ij}) \) is the number of fringes expanded from \( (i,j) \) (where each fringe is composed by the pixels that are at the same distance from (i, j)) until the first fringe holding a pixel of opposite color is reached.
	 * @param m the matrix that represents a digital image.
	 * @param i the row number of the pixel.
	 * @param j the column number of the pixel.
	 * @param fringe the number of the fringe that is being compared to the pixel.
	 * @return the number of fringes expanded from \( (i,j) \) until the first fringe holding a pixel of opposite color is reached.
	 */
	
	public static int DBW(RealMatrix m, int i, int j, int fringe){
		if(i+fringe>=m.getRowDimension() && i-fringe<0 && j+fringe>=m.getColumnDimension() && j-fringe<0){
			return 0;
		}	
		int col,row = -1*fringe;
		while(row<=fringe){
			col = -1*fringe;
			while(col<=fringe){
				if(i+row>=0 && i+row<m.getRowDimension() && j+col>=0 && j+col<m.getColumnDimension()){
					if(Math.abs(row)==fringe || Math.abs(col)==fringe){
						if(m.getEntry(i+row, j+col)!=m.getEntry(i, j)){
							return fringe;
						}
					}
				}
				col++;
			}
			row++;
		}
		return DBW(m,i,j,fringe+1);
	}
	
	
	
	/**
	 * Received two binary matrices and calculates the Pixel distance.
	 * @param x binary matrix number 1.
	 * @param y binary matrix number 2.
	 * @return The Pixel distance.
	 */
	
	public static double distance(RealMatrix x, RealMatrix y){
		double res = 0;
		for(int i=0;i<x.getRowDimension();i++){
			for(int j=0;j<x.getColumnDimension();j++){
				res += Math.abs(x.getEntry(i, j) - y.getEntry(i, j))*(DBW(x,i,j,1) + DBW(y,i,j,1));
			}
		}
		return res;
	}
	
}
