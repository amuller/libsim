package com.simmachines.libsim.r01.vector;

import java.nio.ByteBuffer;
import com.diapai.ramiel.RA;
import com.diapai.ramiel.exception.RAException;
import com.simmachines.libsim.enc.vector.Pixel;
import com.simmachines.libsim.r01.abst.AbstractMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.Array2DRowRealMatrix;


/**
 * [Pixel distance]
 * <p>
 * :: The pixel distance is an image distance between two digital images seen as binary matrices.
 * <p>
 * @see com.simmachines.libsim.enc.vector.Pixel
 * @author Jose Daniel Salazar-Vargas
 */ 

public class RAPixel extends AbstractMatrix{
	/** 
	 * Default constructor required by R-01
	 */
	public RAPixel(){
		super();
	}
	
	/**
	 * Copy constructor
	 * @param obj matrix to copy.
	 */ 
	public RAPixel(RealMatrix obj){
			super(obj);
	}
	
	/**
	 * Instantiates a new RealMatrix object.
	 * @return new RealMatrix instance.
	 * @see com.simmachines.libsim.r01.abst.AbstractMatrix
	 */
	@Override
	protected RealMatrix getNewInstance() {
		return new Array2DRowRealMatrix();
	}
	
	
	@Override
	public void load(ByteBuffer buf) throws RAException{
		matrix = new Array2DRowRealMatrix(preLoad(buf));
	}
	
	
	/**
	 * Clone must be implemented by all classes that implement RA. 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {	
			return new RAPixel(cloneHelper());
	}
	
	/** Calculates the Pixel distance between this and other RAPixel object
	 *  @param other RAPixel object
	 *  @return Pixel distance
	 */ 
	@Override
			public Double distance(RA<Double> other) {
			return Pixel.distance(getMatrix(),((RAPixel)other).getMatrix());
	}

}
