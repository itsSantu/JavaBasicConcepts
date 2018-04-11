package com.javabasic.concepts;

class Machine {
	
	private String name;
	private int age;
	
	public Machine()
	{
		this("Himank");
		System.out.println("Running Constructor!!!");
	}
	
	Machine(String name)
	{
		this("Himank", 8);
		System.out.println("Running Second Constructor!!!");
	}
	
	Machine(String name, int pincode){
		System.out.println("Running third Constructor!!!");
		this.name=name;
		this.age=age;
	}
}

public class Tutorial18Constructors {

	public static void main(String[] args) {
		new Machine();
		new Machine("Himank");
		new Machine("Himank", 8);

	}

}
