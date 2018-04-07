package com.javabasic.concepts;

import java.util.Scanner;

public class Tutorial9Switch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a command: ");
		String text = sc.nextLine();
		
		switch(text){
		case "Start":
			System.out.println("Machine Started");
			break;	
		case "Stop":
			System.out.println("Machine Stopped");
			break;
			default:
				System.out.println("Command not recognised");
		}
	}

}
