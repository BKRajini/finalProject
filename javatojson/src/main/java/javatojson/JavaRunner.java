package javatojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaRunner {

	public static void main(String[] args) throws Throwable 
	{
		JavaToJSON jason=new JavaToJSON();
		jason.setEmployeeAge("23");
		jason.setEmployeeId(330);
		jason.setEmployeeName("Rajini");
		jason.setPhoneNum(988623455);
		jason.setSalary(15000);
		ObjectMapper map=new ObjectMapper();
		String Jonson=map.writeValueAsString(jason);
		System.out.println(Jonson);
		
		

	}

}
