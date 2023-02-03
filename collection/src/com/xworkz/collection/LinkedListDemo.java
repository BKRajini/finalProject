package com.xworkz.collection;

import java.util.LinkedList;

public class LinkedListDemo 
{
  // there are similar methods are there in the ArrayLIst and LinkedList but 
// there are another special methods which are available in the LinkedLIst They are
	//*getFirst(),getLast(),addFirst(),addLast(),removeFirst(),removeLast()
	public static void main(String[] args)
	{
	LinkedList li=new LinkedList();
	li.add("String");
	li.add('A');
	li.add(null);
	li.add(78);
	li.add("RajiniSanjay");
	System.out.println(li);
	System.out.println(li.size());
	System.out.println(li.get(0));
	System.out.println(li.remove(2));
	System.out.println(li);
	System.out.println(li.addAll(li));
	System.out.println(li.removeFirst());
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li);
	}
	}
}