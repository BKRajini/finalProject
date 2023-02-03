package com.xworkz.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
public static void main(String[] args)
{
	//Declaring the Hashset in Different ways
	HashSet hs = new HashSet();//Default capacity is 16 and LoadFactor is 0.75
	//HashSet hs=new HashSet(100);//input Capacity  is 100
	//HashSet <Integer> hs1=new HashSet<Integer>();//if ii is HEterogenoeus element
	hs.add(100);
	hs.add("String");
	hs.add('A');
	hs.add(80);
	hs.add(true);
	System.out.println(hs);
	hs.removeAll(hs);
	System.out.println(hs);
	hs.add("Strig");
	hs.add(200);
	hs.add('A');
	hs.add(true);
	System.out.println(hs);
	//for getting object from the hashset we have to use for loop method
	for(int i=0;i<hs.size();i++)
	{
		System.out.println(hs);
	}
	//using iterator method
	Iterator it= hs.iterator();
	while(it.hasNext())
    {
	it.next();
	System.out.println(it);
    }
//how to perform union, Intersection,Difference in using HashSet
	HashSet hs1=new HashSet();
	hs1.add(1);
	hs1.add(2);
	hs1.add(3);
	hs1.add(4);
	hs1.add(5);
	System.out.println(hs1+"");
	
	HashSet hs2=new HashSet();
	hs2.add(3);
	hs2.add(4);
	hs2.add(5);
	System.out.println(hs2+"");
	
	//union
//	hs1.addAll(hs2);
//	System.out.println(hs1);
	//Intesection
//	hs1.retainAll(hs2);
//	System.out.println(hs1);
	//Difference
//	hs1.removeAll(hs2);
//	System.out.println(hs1);
	//subset 
	hs1.containsAll(hs2);
	System.out.println(hs1);
	
	
	}


}
