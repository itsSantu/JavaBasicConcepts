package com.javabasic.concepts;

class Robot {

	void speak(String text) {
		System.out.println(text);
	}

	public void Jump(int height) {
		System.out.println("Height of the Jump is" + height);
	}

	public void Map(String direction, double distance) {
		System.out.println(direction + distance);
	}
}

public class Tutorial16MethodParameters {

	public static void main(String[] args) {
		Robot robo = new Robot();
		robo.speak("Calling the String Paramater text");
		robo.Jump(5);
		robo.Map("North", 40.00);

		String greeting = "hello, how are you doing";
		
		robo.speak(greeting);
	}

}
