package com.xworkz.resortrunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.resort.Resort;
import com.xworkz.resortconfiguration.ResortConfiguaration;

public class ResortRunner
{
public static void main(String[] args)
{
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ResortConfiguaration.class);
Resort bean = applicationContext.getBean(Resort.class);
bean.setname();




}
}
