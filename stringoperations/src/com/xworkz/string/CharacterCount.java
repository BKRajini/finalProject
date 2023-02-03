package com.xworkz.string;

public class CharacterCount 
{
 public static void main(String[] args)
 {
	 String inputStream="Rajini";
	 char ch='i';
	 int count=0;
	 for(int i=0;i<inputStream.length();i++)
	 {
		if(inputStream.charAt(i)==ch)
		{
			count++;	
		}
		
	 }
	 System.out.println("the number of Character Count is"+count);
 }
}
