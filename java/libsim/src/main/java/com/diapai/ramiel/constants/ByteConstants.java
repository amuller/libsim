package com.diapai.ramiel.constants;

/*
 OBSearch: a distributed similarity search engine This project is to
 similarity search what 'bit-torrent' is to downloads. 
 Copyright (C) 2008 Arnoldo Jose Muller Molina

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * ByteConstants holds the number of 
 * @author Arnoldo Jose Muller Molina
 */

public enum ByteConstants {
    Byte (1),
    Short(java.lang.Short.SIZE/8),
    Int(java.lang.Integer.SIZE/8),
    Long(java.lang.Long.SIZE/8),
    Double(java.lang.Double.SIZE/8),
    Float(java.lang.Float.SIZE/8);
    /**
     * Size in bytes of each data type.;
     */
    private final int size;
    private final int bits;
    ByteConstants(int size){
        this.size = size;
        this.bits = size * 8;
    }
    /**
     * @return the size in bytes
     */
    public int getSize() {
        return size;
    }
    
    /**
     * 
     * @return The # of bits required to store each datatype
     */
    public int getBits(){
    	return bits;
    }
    
    public static ByteConstants convert(Object c){
    	if(c instanceof java.lang.Byte){
    		return ByteConstants.Byte;
    	}else if(c instanceof java.lang.Short){
    		return ByteConstants.Short;
    	}else if(c instanceof java.lang.Integer){
    		return ByteConstants.Int;
    	}else if(c instanceof java.lang.Long){
    		return ByteConstants.Long;
    	}else if(c instanceof java.lang.Double){
    		return ByteConstants.Double;
    	}else if(c instanceof java.lang.Float){
    		return ByteConstants.Float;
    	}else{
    		throw new IllegalArgumentException("Wrong type!");
    	}
    }
        
}
