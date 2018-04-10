package com.javabasic.concepts;

public class ThisTest {

	public static void main(String[] args) {

		demo d = new demo();
		d.test();
		System.out.println("Running demo");
	}
}

class demo {
	int a = 10;

	void test() {
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
	}
}
