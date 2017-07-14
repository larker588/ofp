package com.webside.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @ClassName: SerializeUtil
 * @Description: Serialize工具类
 * @author gaogang
 * @date 2016年7月12日 下午4:18:19
 *
 */
@SuppressWarnings("unchecked")
public class SerializeUtil {

	/**
	 * 
	 * @Description 序列化
	 * @param value
	 * @return
	 *
	 * @author wjggwm
	 * @data 2017年1月5日 下午12:49:19
	 */
	public static byte[] serialize(Object value) {
		if (value == null) {
			throw new NullPointerException("Can't serialize null");
		}
		byte[] rv = null;
		ByteArrayOutputStream bos = null;
		ObjectOutputStream os = null;
		try {
			bos = new ByteArrayOutputStream();
			os = new ObjectOutputStream(bos);
			os.writeObject(value);
			rv = bos.toByteArray();
		} catch (Exception e) {
			throw new RuntimeException("Object can't be serialized", e);
		} finally {
			close(os);
			close(bos);
		}
		return rv;
	}

	public static Object deserialize(byte[] in) {
		return deserialize(in, Object.class);
	}

	/**
	 * 
	 * @Description 反序列化
	 * @param in
	 * @param requiredType
	 * @return
	 *
	 * @author wjggwm
	 * @data 2017年1月5日 下午12:49:01
	 */
	public static <T> T deserialize(byte[] in, Class<T>... requiredType) {
		Object rv = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream is = null;
		try {
			if (in != null) {
				bis = new ByteArrayInputStream(in);
				is = new ObjectInputStream(bis);
				rv = is.readObject();
			}
		} catch (Exception e) {
			throw new RuntimeException("Object can't be deserialized", e);
		} finally {
			close(is);
			close(bis);
		}
		return (T) rv;
	}

	/**
	 * 
	 * @Description 关闭流
	 * @param closeable
	 *
	 * @author wjggwm
	 * @data 2017年1月5日 下午12:48:49
	 */
	private static void close(Closeable closeable) {
		if (closeable != null)
			try {
				closeable.close();
			} catch (IOException e) {
				throw new RuntimeException("close stream error");
			}
	}

}
