package com.xworkz.resort;

import org.springframework.stereotype.Component;

@Component
public class TV
{
	private String remote;
 public TV()
 {
	 System.out.println("default");
 }
 public String getRemote() {
	return "LG";
}
}
