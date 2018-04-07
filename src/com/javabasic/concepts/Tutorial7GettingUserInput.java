package com.javabasic.concepts;

import java.util.Scanner;

public class Tutorial7GettingUserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String thank = input.nextLine();
		System.out.println();
		System.out.println("Your Name is: " + thank);
		scanner();

	}

	public static void scanner() {
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter your age : ");
		int age = s.nextInt();
		System.out.println();
		System.out.println("Your age is : " + age);

	}
}
