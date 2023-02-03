package com.xworkz.test;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestingClass
{
	private static Logger log= Logger.getLogger(TestingClass.class);//this is creating the object of the logger
 public static void main(String[] args)
 {
	 //create one layout
	// Layout layout=new HTMLLayout();
	// Layout layout=new HTMLLayout();
    // Layout layout=new XMLLayout();
     Layout layout=new PatternLayout("%d %C %M %m %n");
     //%d = date and time
     //%C = class name
     //%M = methodname
     //%m = message
     //%n = next Line

	 //calling layout inside the appender
	 //create appender object
     
	// Appender app=new ConsoleAppender(layout);
	 Appender app=new ConsoleAppender(layout);

	 //Calling the Logger inside the appender
	 log.addAppender(app);
	 
	 log.debug("This is Debug");
	 log.info("This is Info message");
	 log.error("This is Error mesaaage");
	 log.warn("This is Warn Message");
	 log.fatal("This is Fatal Mesaage");

	 
 }
}
