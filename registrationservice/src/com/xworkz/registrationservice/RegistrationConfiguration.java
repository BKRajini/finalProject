package com.xworkz.registrationservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz")
public class RegistrationConfiguration
{
	public RegistrationConfiguration()
	{
		System.out.println("This is Default Constructor"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("This is ViewResolver Method");
		return new InternalResourceViewResolver("/","");
	}
	@Bean
	public MultipartResolver multipartResolver() 
	{
		System.out.println("This is MultipartREsolver mEthod");
		return new StandardServletMultipartResolver();

	}
}
