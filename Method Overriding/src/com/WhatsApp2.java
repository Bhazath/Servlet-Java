package com;

public class WhatsApp2 extends WhatsApp1 {
	
	@Override
	void display() {
		super.display();
		System.out.println("Double Ticks Supported");
	}
	
	void call() {
		System.out.println("Voic Call Supported");
	}
}
