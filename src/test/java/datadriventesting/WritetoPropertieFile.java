package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritetoPropertieFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Properties property=new Properties();
		property.load(fis);
		property.put("user2","user");
		property.put("pas2","pass");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos,"updated successfully");

	}

}
