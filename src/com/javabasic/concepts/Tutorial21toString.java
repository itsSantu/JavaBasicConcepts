package com.javabasic.concepts;

class Frogy{
	
	private String name;
	private int id;
		
	public Frogy(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	public  String toString()
	{
		//Inefficient (return which is commented) lots of conversion and string objects flying so use String Builder
		
		//	return id + " " + name;
		
			//	Betterway
		
		StringBuilder sb = new StringBuilder();
		sb.append(id).append( " : ").append(name);
		return sb.toString();
	} 
			//OR
	public  String  astoString() {
		
	return String.format("%-4d: %s ", id, name );
	}
}

public class Tutorial21toString 
{

	public static void main(String[] args) 
	{
		Frogy frog1 = new Frogy(5, "Freddie");
		Frogy frog2 = new Frogy(55, "Bruh");
		
		System.out.println(frog1);
		System.out.println(frog2);

	}

}

