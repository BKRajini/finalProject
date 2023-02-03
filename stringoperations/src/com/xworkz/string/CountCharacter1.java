package com.xworkz.string;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class CountCharacter1
{
 public static void main(String[] args)
 {
	String example="ygydgvavjgfachvasgdgavs";
	printDuplicates(example);
}
 public static void printDuplicates(String example)
 {
	  int count=0;
	  ArrayList<Character> charList=new ArrayList<>();
	  for(int i=0; i<example.length();i++)
	  {
		  char ch=example.charAt(i);
		  for(int j=0;j<example.length();j++)
		  {
			  if(example.charAt(j)!=ch)
			  {
				  continue;
			  }
			  count++;
		  }
		  if(!charList.contains(ch))
		  {
		  if(count>1&& ch!=' ')
		  {
			  System.out.println("Char:"  +ch+  "Count:"   +count+  "Times");
			  charList.add(ch);
			  	  }
	  }
	  count=0;
	 
 }
}
}