package com.xworkz.string;
//* A Java program to reverse a string.

public class ReverseString 
{
public static void main(String[] args)
{
	String name="RajiniSanjay";
	String reverseString="";
	for(int i=name.length()-1;i>=0;i--)
	{
		reverseString=reverseString+name.charAt(i);
	}
	System.out.println("This is ReverseString '"+name+"'is:");
	System.out.println(reverseString);
}
}
