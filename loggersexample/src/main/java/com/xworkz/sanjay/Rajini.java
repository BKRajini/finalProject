package com.xworkz.sanjay;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.jmx.LoggerDynamicMBean;

public class Rajini 
{
	private static Logger log= Logger.getLogger(Rajini.class);
     public static void main(String[] args)
     {
    	//Ctreate the Layout
    	 Layout lay=new PatternLayout("%d %C %M %m %n");
    	 //crete a Appender 
    	 Appender app=new ConsoleAppender(lay);
    	 //call the reference of Log
    	 log.addAppender(app);
    	 
    	 //priority printing methods
    	 log.debug(" This is Debug");
    	 log.info("This is Info");
    	 log.error("This is nErrror");
    	 log.warn("This is Warning Messages");
    	 log.fatal("This is Fatal Messages");
     }
}
