package jspiders;

public class Car 
{
	static 
	{
		System.out.println(1);
	}
	
	public static void main(String[] args) 
	{
		Car d = new Car();
		System.out.println(3);
	}
	
	{
		System.out.println(2);
	}
}
