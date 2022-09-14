package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
	//to avoid hard coding and sometimes changes in url any common information we store inside one properties file and we can use this by using variable.	

	public static String getDataPropertiesFile(String key) throws IOException{
   
		Properties property=new Properties();
		FileInputStream fis=new FileInputStream("./properties.properties");
		property.load(fis);
		String value=property.getProperty(key);
		return value;
	}

}
