package com.xworkz.restaurantConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.restaurant.Appartment;
import com.xworkz.restaurant.Restaurant;

@Configuration
@ComponentScan("com.xworkz")
public class ResaturantConfiguration
{
@Bean
public Restaurant restaurant()
{
	System.out.println("bean class is registered");
	Restaurant rest=new Restaurant();
	return rest;
}
@Bean
public Appartment apprtment()
{
	System.out.println("AppartmentBean is creted");
	Appartment appart=new Appartment();
	return appart;
	
}


}
