package com.javabasic.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tutorial34HandlingException {

	// Throws exception
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("test.txt");
		tryCatch();
		FileReader fr = new FileReader(file);
	}

public static void tryCatch()
{
	File file = new File("test.txt");
	try {
		FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + file.toString());
			e.printStackTrace();
		}
}


}
