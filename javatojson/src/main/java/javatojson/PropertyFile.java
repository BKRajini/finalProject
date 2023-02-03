package javatojson;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class PropertyFile 
{
 public static void main(String[] args) throws IOException
 {
		InputStream reader = PropertyFile.class.getClassLoader().getResourceAsStream("file.properties");
		Properties prop=new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("home"));
		System.out.println(Property.home);
		System.out.println(Property.name);
		
 }
}
