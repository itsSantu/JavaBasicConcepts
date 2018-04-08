package com.javabasic.concepts;

public class Tutorial10Arrays {

	public static void main(String[] args) {
		
		int value =5;
		int [] values;
		values = new  int [3];
		
		System.out.println(values[0] +values[1] +values[2]);
		System.out.println(values[1] +values[2]);
		System.out.println(values[2]);
		System.out.println(value);

		values[0] = 5;
		values[1] = 55;
		System.out.println("First vale at index 0 is: " +values[0] + " " +values[1] + " " +values[2]);
		
		for (int i=0; i<values.length; i++)
		{
			System.out.println(i);
		}
	
	int [] numbers = {0,1,2,3,4,5,6,7,8,9};
	for(int i=0; i<numbers.length; i++ ) {
		System.out.println();
		System.out.println(i);
		
	}
}

}
