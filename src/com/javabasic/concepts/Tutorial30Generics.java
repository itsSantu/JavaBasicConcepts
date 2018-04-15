package com.javabasic.concepts;

import java.util.ArrayList;

public class Tutorial30Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> strings = new ArrayList <String>();
		strings.add("Himank is a cute boy");
		strings.add("Himank is a good boy");
		strings.add("Himank is a awesome boy");
		
		String Himank = strings.get(1);
		System.out.println(Himank);
		
		//Java 7 =>
		
		ArrayList <String> person = new ArrayList<>();
		person.add("Himank");
		person.add("HImank's");
		person.add("Himanks'");
		
		System.out.println(" ");
		String hi = person.get(1);
		System.out.println(hi);
	}

}
