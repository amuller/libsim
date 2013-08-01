package com.diapai.ramiel.constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;


public class ByteConversion {
	
	public static final ByteOrder ORDERING = ByteOrder.LITTLE_ENDIAN;
	
	public static byte[] convertInt(List<Integer> n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Int.getSize() * n.size());
		for(Integer i : n){
			b.putInt(i);
		}
		return b.array();
	}
	
	public static byte[] convertLong(List<Long> n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Long.getSize() * n.size());
		for(Long i : n){
			b.putLong(i);
		}
		return b.array();
	}
	
	public static byte[] convertDouble(List<Double> n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Double.getSize() * n.size());
		for(Double i : n){
			b.putDouble(i);
		}
		return b.array();
	}
	
	public static byte[] convertShort(List<Short> n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Short.getSize() * n.size());
		for(Short i : n){
			b.putShort(i);
		}
		return b.array();
	}
	
	public static byte[] convertFloat(List<Float> n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Float.getSize() * n.size());
		for(Float i : n){
			b.putFloat(i);
		}
		return b.array();
	}
	
	public static byte[] convertByte(List<Byte> n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Byte.getSize() * n.size());
		for(Byte i : n){
			b.put(i);
		}
		return b.array();
	}
	
	
	public static List<Integer> convertInteger(byte[] data){
		ByteBuffer b = createByteBuffer(data);
		int count = data.length / ByteConstants.Int.getSize();		
		List<Integer> res = new ArrayList<Integer>(count);
		int i = 0;
		while(i < count){
			res.add(b.getInt());
			i++;
		}
		return res;
	}
	
	public static List<Float> convertFloat(byte[] data){
		ByteBuffer b = createByteBuffer(data);
		int count = data.length / ByteConstants.Float.getSize();		
		List<Float> res = new ArrayList<Float>(count);
		int i = 0;
		while(i < count){
			res.add(b.getFloat());
			i++;
		}
		return res;
	}
	
	public static List<Long> convertLong(byte[] data){
		ByteBuffer b = createByteBuffer(data);
		int count = data.length / ByteConstants.Long.getSize();		
		List<Long> res = new ArrayList<Long>(count);
		int i = 0;
		while(i < count){
			res.add(b.getLong());
			i++;
		}
		return res;
	}
	
	public static List<Double> convertDouble(byte[] data){
		ByteBuffer b = createByteBuffer(data);
		int count = data.length / ByteConstants.Double.getSize();		
		List<Double> res = new ArrayList<Double>(count);
		int i = 0;
		while(i < count){
			res.add(b.getDouble());
			i++;
		}
		return res;
	}
	
	public static List<Short> convertShort(byte[] data){
		ByteBuffer b = createByteBuffer(data);
		int count = data.length / ByteConstants.Short.getSize();		
		List<Short> res = new ArrayList<Short>(count);
		int i = 0;
		while(i < count){
			res.add(b.getShort());
			i++;
		}
		return res;
	}
	
	
	public static short[] convertShortArray(byte[] data){
		ByteBuffer b = createByteBuffer(data);
		int count = data.length / ByteConstants.Short.getSize();		
		
		short[] res = new short[count];
		int i = 0;
		while(i < count){
			res[i] = b.getShort();
			i++;
		}
		return res;
	}
	
	public static <N extends Comparable<N>> void put(ByteBuffer buf, N value, ByteConstants b){
		Number num = (Number)value;
		if(b == ByteConstants.Byte){
			buf.put(num.byteValue());
		}else if(b == ByteConstants.Short){
			buf.putShort(num.shortValue());
		}else if(b == ByteConstants.Int){
			buf.putInt(num.intValue());
		}else if(b == ByteConstants.Long){
			buf.putLong(num.longValue());
		}else if(b == ByteConstants.Float){
			buf.putFloat(num.floatValue());
		}else if(b == ByteConstants.Double){
			buf.putDouble(num.doubleValue());
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public static  Comparable get(ByteBuffer buf, ByteConstants b){
		
		if(b == ByteConstants.Byte){
			return Byte.valueOf(buf.get());
		}else if(b == ByteConstants.Short){
			return Short.valueOf(buf.getShort());
		}else if(b == ByteConstants.Int){
			return Integer.valueOf(buf.getInt());
		}else if(b == ByteConstants.Long){
			return Long.valueOf(buf.getLong());			
		}else if(b == ByteConstants.Float){
			return Float.valueOf(buf.getFloat());
		}else if(b == ByteConstants.Double){
			return Double.valueOf(buf.getDouble());
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	

	public static byte[] convertShort(short[] n){		
		ByteBuffer b  = createByteBuffer(ByteConstants.Short.getSize() * n.length);
		for(short i : n){
			b.putShort(i);
		}
		return b.array();
	}
	
	
	public static ByteBuffer createByteBuffer(byte[] data){        
        ByteBuffer res = ByteBuffer.wrap(data);
				res.order(ORDERING);
        return res;
    }
		
	public static ByteBuffer createByteBuffer(int n){
        byte [] r = new byte[n];        
        return createByteBuffer(r);
    }
	
	public static ByteBuffer createDirectByteBuffer(int n){
        ByteBuffer res = ByteBuffer.allocateDirect(n);
        res.order(ORDERING);
        return res;
    }
    

}
