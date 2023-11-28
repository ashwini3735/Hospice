package GenricUtiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class JavaUtiles {
	
	public void ReadDtafrompropertiefile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("./src/test/java/commons.properties");
		Properties pobj = new Properties();
	}

}
