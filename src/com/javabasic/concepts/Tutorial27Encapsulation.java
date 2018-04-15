package com.javabasic.concepts;

public class Tutorial27Encapsulation {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData()
	{
		String data = "some stuff" + growthforecast();
		return data;
	}

	public int growthforecast()
	{
		return 9;
	}
//Idea is make private if you can make private, if it's needs to be accessed from child class then protected, access from any where public or specify nothing
//Try not to make data public 

}
