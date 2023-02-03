package com.xworkz.downcasting;

public class DownCasting2 extends DownCasting
{
	
	void swimmin(DownCasting d)
	{
		if(d instanceof DownCasting2)
		{
			DownCasting2 down=(DownCasting2)d;
		}
		System.out.println("DownCasting is PErfoemd");

	}

}
