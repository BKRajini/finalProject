package com.xworkz.wrapper;

import java.util.LinkedList;

public class WrapperClasses 
{
	public static void main(String[] args)
	{
		char ch = 'a';

		// Autoboxing- primitive to Character object conversion
		Character a = ch;

		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		int aa=25;
		// Autoboxing because ArrayList stores only objects
		linkedList.add(aa);

		// printing the values from object
		System.out.println(linkedList.get(0));
	}
}

