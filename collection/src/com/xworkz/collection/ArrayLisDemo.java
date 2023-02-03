package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLisDemo
{
	public static void main(String[] args)
	{
ArrayList a1=new ArrayList();
a1.add("Rajini");
a1.add("Raaji");
a1.add("Rasma");
a1.add("Rehmani");
System.out.println(a1);
ArrayList a2=new ArrayList();
a2.addAll(a1);
System.out.println(a2);
Collections.sort(a1);
System.out.println(a1);
Collections.sort(a1,Collections.reverseOrder());
System.out.println(a1);
Collections.shuffle(a2);
System.out.println(a2);

}

}
