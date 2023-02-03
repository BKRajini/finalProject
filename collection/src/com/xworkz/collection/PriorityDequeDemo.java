package com.xworkz.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityDequeDemo 
{
	public static void main(String[] args)
	{
	   PriorityQueue que=new PriorityQueue();
	   que.add("A");
	   que.add("B");
	   que.add("C");
	   que.add("R");
	   que.offer("yu");
     System.out.println(que);
    System.out.println(que.element());
    System.out.println(que.peek());
    System.out.println(que.remove());
    System.out.println(que.poll());
    for(int i=0;i<que.size();i++)
    {
    	System.out.println(i);
    }
	
	Iterator pq=que.iterator();
	while(pq.hasNext())
	{
		System.out.println(pq.next());
	}
	
	}
}
