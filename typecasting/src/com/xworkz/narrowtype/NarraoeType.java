package com.xworkz.narrowtype;

public class NarraoeType 
{
public static void main(String[] args)
{
	//Narrow type casting means
	//double->float->long->int->short->byte
	double d=90;
	float f=(float)d;
	long l=(long)f;
	int x=(int)l;
	short s=(short)x;
	int r=100;
	float y=(float)r;
	System.out.println(y);
	
	System.out.println(d);
	System.out.println(f);
	System.out.println(l);
	System.out.println(x);
	System.out.println(s);
}
}
