package com.javabasic.concepts;

public class Tutotrial28CastingNumbers {

	public static void main(String[] args) {
		byte bytevalue = 20;
		short shortvalue=55;
		int intvalue =333;
		long longvalue = 123456;
		float floatvalue = 88899.00f;
		float floatvalue2 = (float)55555.555;
		double doublevalue = 88.88;

		System.out.println(Byte.MAX_VALUE);
		
		intvalue = (int) longvalue; //casting here 
		System.out.println(intvalue);
		
		doublevalue = intvalue;
		System.out.println(doublevalue);
		
		intvalue = (int) floatvalue;
		System.out.println(intvalue);
		
		bytevalue = (byte) 128;
		System.out.println(bytevalue);//SHouldn't use this, prints -128 since the max of byte is 127 and trying to fit 128 has pushe to min value of byte
	}
	
	

}
