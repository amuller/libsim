package com.diapai.ramiel;
/**
 * 
 */


//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
import java.nio.ByteBuffer;

import com.diapai.ramiel.exception.RAException;



/**
 * Interface that abstracts the general storage and loading methods used to
 * persist objects.
 * @author Arnoldo Jose Muller Molina
 * @since 0.7
 */

public interface Storable {
    /**
     * Stores this object in a byte array.
     * @param buf buffer where the information will be stored.
     * @return 0 if data was written, otherwise a larger value than 0 if a new, larger buffer is required.   
     * @since 0.0
     */
    //byte[] store() throws RAException;
	void store(ByteBuffer buf) throws RAException;

    /**
     * Populates the object's internal properties from the given byte stream.    
     * @param input
     *            byte array from where we will load data.
     * @throws RAException
     *             if the data cannot be loaded.
     * @since 0.0
     */
    //void load(byte[] input) throws RAException;
	void load(ByteBuffer buf) throws RAException;
    
   
}
