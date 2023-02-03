package com.xworkz.resort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Resort 
{
	
	private String name;
    private int price;
    private String rating;
    @Autowired
    private TV tv;
    
 public Resort()
 {
	 System.out.println("default constructor");
 }
 public String setname() {
	return "High";
}
public String getRating() {
	return "3.2";
}
public int getPrice() {
	return 1234;
}

}
