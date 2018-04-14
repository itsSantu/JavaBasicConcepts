package com.javabasic.concepts;

public class Tutorial24InterfaceMachineClass implements Tutorial24ActualInterface {
	
	private int id=5;
	
	public void Start()
	{
		System.out.println("Hello Master, machine has been started");
	}

//	@Override
	public void showinfo() {
		System.out.println("Machine id is : " +id);
		
	}

}
