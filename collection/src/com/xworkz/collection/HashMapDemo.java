package com.xworkz.collection;

import java.util.HashMap;

public class HashMapDemo
{
 public static void main(String[] args)
 {
	// HashMap hs =new HashMap();
	 HashMap<Integer,String> hs=new HashMap<Integer,String>();
	 hs.put(101,"Rajini");
	 hs.put(102, "Sanjay");
	 hs.put(103, "Srini");
	 hs.put(104, "Komala");
	 hs.put(105, "Komala");
     System.out.println(hs);
	System.out.println( hs.get(101));
	System.out.println(hs.containsKey(101));
	System.out.println(hs.containsValue("Rajini"));
	System.out.println(hs.isEmpty());
    System.out.println(hs);
    for(Object o:hs.keySet())
    {
    	System.out.println(o);
    }
	   
    for(Object m:hs.values())
    {
    	System.out.println(m);
    }
    for(Object n:hs.entrySet())
    {
    	System.out.println(n);
    }
	
	 
 }

}
