package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/send")
public class Controller 
{
 public Controller()
 {
	 System.out.println("this is Cointroller Class");
 }
 @PostMapping
 public String onSave()
 {
	 System.out.println("OnSave");
	 return "index.jsp";
 }
}
