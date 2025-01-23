package UtilityLayer;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesClass {

	public static String getProperty(String keyName) {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/config.properties";

		try {
			FileReader fr = new FileReader(path);
			prop.load(fr);
			return prop.getProperty(keyName);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return null;

	}
}
