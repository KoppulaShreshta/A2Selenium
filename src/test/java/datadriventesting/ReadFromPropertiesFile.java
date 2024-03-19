package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// step1:convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		
		//step 2:create an instance of properties class
		
		Properties property=new Properties();//java.util
        //step 3:load all key-value pairs into properties object
		
		property.load(fis);//throws IO exception
		//step4: fetch data from properties object
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));
		
	}

}
