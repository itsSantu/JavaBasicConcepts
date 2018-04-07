package com.javabasic.concepts;

public class Tutorial6WhileAndIfCS {
	public static void main(String[] args) {

		int i = 0;
		while (true) {
			System.out.println("Looping in : " + i);

			if (i == 5) {
				break;
			}
			i++;
			System.out.println("Running");
		}

	}
}