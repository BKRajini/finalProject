package com.xworkz.operations;

public class Palindrome
{
public static void main(String[] args)
{
	String name="MALAYALAM";
	String reverse=	reversedString(name);

	if(name.equals(reverse))
	{
		System.out.println("String is a Palindrome");
	}
	else
	{
		System.out.println("String is not a Palindromee");
	}
}
public static String reversedString(String str)
{
	String reverse="";
	
	for(int i = str.length()-1;i>=0;i--)
	{
		
		reverse +=str.charAt(i);
	}
	return reverse;
}

}
