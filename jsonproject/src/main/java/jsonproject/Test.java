package jsonproject;

import java.util.*;  
import java.io.*;  
public class Test {  
public static void main(String[] args)throws Exception{
	InputStream reader = Test.class.getClassLoader().getResourceAsStream("db.properties");
   // FileReader reader=new FileReader("db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
    System.out.println(Constant.PASSWORD);
    System.out.println(Constant.USER);
    
}  
}  