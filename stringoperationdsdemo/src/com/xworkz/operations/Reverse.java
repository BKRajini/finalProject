package com.xworkz.operations;

public class Reverse 
{
public static void main(String[] args)
{
	String name="Rajiniiji";
	String reverse="";
   for(int i=name.length()-1;i>=0;i--)
   {
	   reverse=reverse+name.charAt(i);  
	 }
   System.out.println(reverse);

}

}
