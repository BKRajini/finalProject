package jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConvertingJSONTOJava
{
public static void main(String[] args) throws IOException, ParseException,FileNotFoundException
{
	//Creating the JSON into java lanquage
	 JSONParser parsing=new JSONParser();
	 //loading the JSON file into java program by using fileReader
	 FileReader file= new FileReader(".\\JSONFolder\\JSONfiles.json");
	 //Loading the JSON file and loading it into the Java Object
	 Object obj=parsing.parse(file);
	 //Converting into the Java Object from  JSON object
	JSONObject emplo = (JSONObject)obj;
	//Converting into the Java String
	String fname=(String) emplo.get("firstName");
	String lname=(String) emplo.get("lastName");
	System.out.println("FirstName:" +fname );
	System.out.println("LastName:" +lname ); 
	
	JSONArray arr=(JSONArray) emplo.get("address");
	 for(int i=0;i<arr.size();i++)
	 {
	    JSONObject json=(JSONObject) arr.get(i);
	    String street=(String) json.get("StreetName");
	    String house=(String) json.get("HouseNo");
	    String state=(String) json.get("State");
	    System.out.println(street);
	    System.out.println(house);
	    System.out.println(state);
	 }
	 

}
}
