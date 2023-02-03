package com.xworkz.registrationservice;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//@RequestMapping(value="/Rajini")

public class RegistrationController 
{
	/*
	 * @Autowired private RegistrationService registration;
	 */

	@RequestMapping(value="/")
	public  String world()

	{return "Hello World";

	}

}
