package com.javabasic.concepts;

public class Tutorial25AccessSpecifiers {

	public static void main(String[] args) {
		Tutorial25AccessSpecifiersPlantClass ap = new Tutorial25AccessSpecifiersPlantClass();
		System.out.println(ap.name);
		ap.checkstatus();
		/*
		public -- Cab be accessed from any where
		private -- Only within class
		protected -- same class, same sub-class & within same package only
		no access specifier -- from any where
		Access specifier doesn't apply for class
*/
	}

}