package com.javabasic.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tutorial33ScannerClassReadingFiles {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "/Users/apple/Desktop/s";
		File textfile = new File (fileName);
			Scanner su = new Scanner(textfile);
			while (su.hasNextLine()) {
				String line = su.nextLine();
				System.out.println(line);
			}
			su.close();
	
		
	}

}
