package com;

public class Test {

	public static void main(String[] args) {
		System.out.println("start");
		
		int[] a = {10, 20, 30};
		
		try {
		System.out.println(a[99]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
		System.out.println("end");
	}
}
