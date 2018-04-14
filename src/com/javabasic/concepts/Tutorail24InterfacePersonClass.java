package com.javabasic.concepts;

public class Tutorail24InterfacePersonClass implements Tutorial24ActualInterface {
	
	private String name;
	
	
	public Tutorail24InterfacePersonClass(String name) {

		this.name = name;
	}


	public void Greet()
	{
		System.out.println("Hello Master, have a great day");
	}


	//@Override
	public void showinfo() {
		System.out.println("Hello my Master's name is :" +name);
		
	}


}
