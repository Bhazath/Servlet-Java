package org;

public class Son extends Father
{
	int age = 30;
	
	void display()
	{
		int age = 10;
		
		System.out.println(age); //10
		System.out.println(this.age); //30
		System.out.println(super.age); //50
	}
}
