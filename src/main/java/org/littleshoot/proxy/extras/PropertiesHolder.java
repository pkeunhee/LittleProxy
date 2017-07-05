package org.littleshoot.proxy.extras;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHolder {
	private static Properties props = new Properties();

	static {
		final File propsFile = new File("./littleproxy.properties");

		if (propsFile.isFile()) {
			try (InputStream is = new FileInputStream(propsFile)) {
				props.load(is);
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String get(String key){
		return props.getProperty(key);
	}
}