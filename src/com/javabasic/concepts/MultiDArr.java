package com.javabasic.concepts;

public class MultiDArr {
	public static void main(String[] args) {
		String [] [] da = new String [2][3];
		da[0][1] = "Hi";
		
		for(int r=0; r<da.length; r++)
		{
			for(int c=0; c<da[r].length; c++)
			{
				System.out.println(da[r][c]);
			}
			System.out.println(da[r]);
			System.out.println(da[0][1]);
			
		}
	}

}
