package com.javabasic.concepts;

public class Tutorial25AccessSpecifiersPlantClass {
	//Bad practice
	public String name;
	
	//Acceptable since Final is used
	public final static int id = 5;
	
	private String type;
	
	protected int size;
	
	
	public Tutorial25AccessSpecifiersPlantClass()
	{
		this.name = "Freddy";
		type="Plant";
		size = 23;
	}
	
	protected void checkstatus()
	{
		System.out.println("Hello checking your status");
	}

}
