package com.javabasic.concepts;

import java.util.Scanner;

public class Tutorial8DoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		int value = input.nextInt();
		while (value != 5) {
			System.out.println("Please enter the number again");
			value = input.nextInt();
		}
		System.out.println("Gotcha");
		// We can write this method even more simpler by using Do while that written
		// below
	}

	public static void DOWhile() {
		int value;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Please enter the number");
			value = s.nextInt();
		} while (value != 5);
		System.out.println("Gotcha");
	}

}
