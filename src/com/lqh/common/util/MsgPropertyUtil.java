package com.lqh.common.util;

import java.io.IOException;
import java.util.Properties;

public class MsgPropertyUtil {
	private static Properties prop;
	
	private MsgPropertyUtil() {}
	
	static {
		prop = new Properties();
		try {
			prop.load(MsgPropertyUtil.class.getClassLoader().getResourceAsStream("msgTip.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key) {
		return prop.getProperty(key);
	}
}
