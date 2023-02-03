package com.xworkz.resortconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.resort.Resort;

@Configuration
@ComponentScan("com.xworkz")

public class ResortConfiguaration 
{
	@Bean
	public Resort resort()
	{
		System.out.println("bean is registered");
		//Resort reso=new Resort();
		return null;
	
		
	}
	

}
