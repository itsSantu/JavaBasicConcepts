package com.javabasic.concepts;

public class Tutorial14Methods {
	
	public static void main(String[] args) {

		DemoClass demo = new DemoClass();
		demo.name = "Demo User";
		demo.age = 5;
		demo.relation = "son";
		demo.status = "happy";
		System.out.print("Using DemoClass Variables here" + "  " + demo.name + "\t" + " " + demo.age + "\t" + " "
				+ demo.relation + "\t" + " " + demo.status);	
		System.out.println();
		 
		demo.methodsinJava();
		
		
	}
}

class DemoClass {

	String name;
	int age;
	String relation;
	String status;

void methodsinJava() {
	
	System.out.println("My name is"+ " " + name + "  " + "My age is" +" " + age + " years of old");
	
	
}
}


