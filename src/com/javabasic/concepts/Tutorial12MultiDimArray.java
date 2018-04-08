package com.javabasic.concepts;

public class Tutorial12MultiDimArray {

	public static void main(String[] args) {

		int [] [] grid = {
				{0,1,2,3},
				{3,2,1,0}
		};
		System.out.println(grid[0][0] + " " + grid[0][1]);
		
		String[] [] text = new String [3] [3];
		text[0][1] = "Hello Welcome ya";
		
		System.out.println(text[0][1]);
		
		for(int row=0; row<grid.length; row++)
		{
			for(int col=0; col<grid[row].length; col++)
			{
				System.out.print(grid [row][col]+ "\t");
			}
		}

	}

}
