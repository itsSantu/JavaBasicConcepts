package com.javabasic.concepts;

public class Tutorial20StringBuilderAndFormatting {

	public static void main(String[] args) {
		
		
		String info = "";
		//inefficient when used in lengthy program, slows down execution
		info += "Hi this is String Builder tutorial";
		info += " ";
		info += "and Formatting!";
		System.out.println(info);
		
		//more efficient memory way and execution
		StringBuilder sb = new StringBuilder();
		sb.append("Hello there");
		sb.append(" ");
		sb.append("thanks");
		System.out.println(sb.toString());
		
		StringBuilder sc = new StringBuilder();
		sc.append("Hello again")
		.append(" " )
		.append("appending string without ref variable");
		System.out.println(sc.toString());
		
		/////Formatting///////
		
		System.out.println("Here is some text.\t That was supposed to be present and slasht means tab\nmeans newline ");
		System.out.printf("What is f doing here %d, Yes exactly even %d", 5,55);
		//%3d is used for width also negative values can be used ex: -3 for left align
		for(int i=0; i<14; i++) {
			System.out.printf("%3d: Use of width i,e three with d prints in same pretty spacing\n", i);
			//for String
			System.out.printf("%3d: %s \n Use of width",i,  "%si,e three with d prints in same pretty spacing");
		//Formatting floating point
			System.out.printf("Total value is: %2f\n", 5.555555);
			System.out.printf("Total value is: %-2f\n", 555.555555);
		}
		
		

	}

}
