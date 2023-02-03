package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo
{
 public static void main(String[] args)
 {
	 //Declaring a ArrayList in 4 different Ways
	 //ArrayList<Integer> a1=new ArrayList<Integer>();
	// ArrayList<String> a2=new ArrayList<String>();
	// List a=new ArrayList();
	 ArrayList al=new ArrayList();
    //Adding new Elements into the Arraylist
	 al.add("Rajini");
	 al.add(0);
	 al.add("GoodLooking");
	 al.add("09072000");
	 al.add(true);
	 al.add('r');
	 System.out.println(al);
	 //Addding elment into the Specify location 
	 //add(obj,elemnt)
	 al.add(0,"Sanjay");
	 System.out.println(al);
	 //if you want to know the total Size of the Array list
	 System.out.println(al.size());
	//if you want to remove the element from the arrayList
	 System.out.println(al.remove(2));
	 System.out.println(al.size());
	 //if you Want to replace the elment from the ArrayList
	 al.set(2, "Excellent");
	 System.out.println(al);
	 //if you want to get only specified word from the arrayList
	 al.get(1);
	 System.out.println( al.get(1));
	 //if you want to know whether the ArrayList is Empty or not
	 System.out.println(al.isEmpty());
	 //if you want to know Whether the Arraylist contain Specific Word or not
	 System.out.println(al.contains("C(("));
	 //How to read the Elments in the ArrayList 
	 System.out.println("Reading the elements Using for loop...");
	 for(int i=0;i<al.size();i++)
	 {
		 System.out.println(i);
	 }
	 
	 
 //reading the elemnts using for Each Loop
     System.out.println("Rading the ELemenst using forEach Loop");
     for(Object e:al)
     {
    	 System.out.println(e);
     }
 }
 //using Iterator

// Iterator i=al.iterator();
//{
//	 while(i.hasNext()) {
//	 System.out.println(i.next());
//	 }
//}
   
}




     
	 

	 
	 
	 
	 
 

