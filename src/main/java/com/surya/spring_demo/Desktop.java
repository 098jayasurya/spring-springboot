package com.surya.spring_demo;

public class Desktop implements Computer {

	public Desktop() {
		System.out.println("Destop Constructor");
	}
	
	public void compile() {
		System.out.println("Compiling in Desktop");
	}
	
}
