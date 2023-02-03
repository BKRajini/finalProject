package com.xworkz.string;

import java.util.ArrayList;

public class CountCharacter
{
 public static void main(String[] args)
 {
	 String name="yessssssssssssss Noooooovhcgsdgjsdgcvhsdjagdsgayusgdyatfsdastgctasf";
	 printDuplicates(name);
 }
 public static void printDuplicates(String name)
 {
	 int count=0;
	 ArrayList<Character>array=new ArrayList<>();
	 for(int i=0;i<name.length();i++)
	 {
		 char ch=name.charAt(i);
		 for(int j=0;j<name.length();j++)
		 {
			 if(name.charAt(j)!=ch)
			 {
				 continue;
			 }
		 count++;
		 }
			 if(!array.contains(ch))
			 {
				if(count>1 && ch!= ' ') 
				{
				System.out.println("Char:" +ch+   "Count: "   +count+ "times");
				array.add(ch);
				}
			 }
			 count=0;
		 }
	 }
 }

