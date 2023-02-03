package com.xworkz.string;
//A Java program to reverse a string.
 
public class Reverseee 
{
 public static void main(String[] args)
 {
	 String name="RajSan";
	 String reversedString="";
	 for(int i=name.length()-1;i>=0;i--)
	 {
		 reversedString=reversedString+name.charAt(i) ;
	}
	// System.out.println("Thois is ReversedSTring '"+name+"':is");
	 System.out.println(reversedString);
 }
}
