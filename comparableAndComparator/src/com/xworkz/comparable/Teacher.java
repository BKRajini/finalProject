package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Teacher implements Comparable<Teacher>
{
	String name;
	String language;
	int noOfCl;
	
	public Teacher(String name,String lanquage, int noOfcl)
	{
	this.name=name;
	this.noOfCl=noOfCl;
	this.language=lanquage;
    }

	public int compareTo(Teacher te) 
	{
	  if(noOfCl==te.noOfCl)
	  {
       return 0;
	  }
	  else 
	  {
		  return 1;
	  }
	  
	  }
		
	
	public static void main(String[] args)
	{
	ArrayList<Teacher> arr=new ArrayList<Teacher>();
	arr.add(new Teacher("AkankshaSingh", "english", 4));
	arr.add(new Teacher("DeepikaSingh", "english", 5));
	arr.add(new Teacher("SunainaSingh", "english", 6));
	arr.add(new Teacher("AaraadyaSingh", "english", 7));
     Collections.sort(arr);
     for(Teacher te:arr)
     {
    	 System.out.println(""+te.language+""+te.name+""+te.noOfCl);
     }
	}

    }
