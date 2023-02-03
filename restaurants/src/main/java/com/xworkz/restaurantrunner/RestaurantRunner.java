package com.xworkz.restaurantrunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.restaurant.Appartment;
import com.xworkz.restaurant.Restaurant;
import com.xworkz.restaurantConfiguration.ResaturantConfiguration;

public class RestaurantRunner
{
 public static void main(String[] args)
 {
	 ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ResaturantConfiguration.class);
	 Restaurant resti = applicationContext.getBean(Restaurant.class);
	 resti.dinner();
     Appartment bean1 = applicationContext.getBean(Appartment.class);
     bean1.flatsAvail();
     
     
 }
}
