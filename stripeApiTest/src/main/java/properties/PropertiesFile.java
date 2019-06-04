package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static String getProperty(String key) throws IOException{
		FileReader reader = new FileReader(".//resources//stripeResources.properties");
		Properties prop = new Properties();
		prop.load(reader);
		return prop.getProperty(key);
	}

}