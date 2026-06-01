package com.surya.spring_demo;

public class Dev {

	private Computer com;
	
	 private int age ;
	
	


	public Dev() {
		System.out.println("Dev constructor");
	}
	
	

	public Computer getCom() {
		return com;
	}



	public void setCom(Computer com) {
		this.com = com;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void build() {
		
		System.out.println("working on Awesome Project");
		com.compile();
		
	}
}
