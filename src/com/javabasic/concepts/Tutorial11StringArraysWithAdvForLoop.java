package com.javabasic.concepts;

public class Tutorial11StringArraysWithAdvForLoop {

	public static void main(String[] args) {
		String [] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "Welcome to String Array";
		arr[2] = "With Adavanced For Loop";
		System.out.println(arr[0]+ " " + arr[1]+ " " + arr[2]);
		System.out.println();
		
		//All the above steps can be written in even simple way
		
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug"};
		//Writng Advanced for loop
		for(String mon: months)
		{
			System.out.println("List of Months using Adv for loop: " +mon);
		}

	}
}
