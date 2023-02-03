package com.xworkz.string;
//2. How to check if two strings are the same ignoring their cases?

public class UpperCase 
{
public static void main(String[] args)
{
	String FirstString="My name is Rajini";
	String SecondString="MY NAME IS RAJINI";
	System.out.println("This is Comparing including Cases:  " +FirstString.equals(SecondString));
	System.out.println("This is Comparing Ignoring the Cases:  "+FirstString.equalsIgnoreCase(SecondString));
}
}
