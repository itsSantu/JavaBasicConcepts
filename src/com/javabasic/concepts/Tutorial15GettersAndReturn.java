package com.javabasic.concepts;

public class Tutorial15GettersAndReturn {
	
	public static void main(String[] args) {

		DemoClass2 demo = new DemoClass2();
		demo.name = "Demo User";
		demo.age = 5;
		
		System.out.print("Using DemoClass Variables here" + "  " + demo.name + "\t" + " " + demo.age);	
		System.out.println();
		 
		int r = demo.returnMethod();
		System.out.println(r);
		
		
		
	}
}

class DemoClass2 {

	String name;
	int age;
	String relation;
	String status;

   int  returnMethod() {
	
	System.out.println("My name is"+ " " + name + "  " + "My age is" +" " + age + " years of old");
	
	int yearsleft =60 -age;
	
	System.out.println(yearsleft);
	
	return yearsleft;
}

}
