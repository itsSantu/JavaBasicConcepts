package com.javabasic.concepts;

public class Tutorial13ClassesAndObjects {

	public static void main(String[] args) {

		DemoClass demo = new DemoClass();
		demo.name = "Demo User";
		demo.age = 5;
		demo.relation = "son";
		demo.status = "happy";
		System.out.print("Using DemoClass Variables here" + "  " + demo.name + "\t" + " " + demo.age + "\t" + " "
				+ demo.relation + "\t" + " " + demo.status);	
	}
}

// *Class contains:
// 1. Data or state or Instance variables
// 2. SUb-routines or Methods */

class DemoClass {

	String name;
	int age;
	String relation;
	String status;

}