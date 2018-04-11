package com.javabasic.concepts;

class Thing{
	public final static int property=5;
	public String name;
	public static String descript;

	public static int count=0;
	public int id;
	
	Thing(){
		id = count;
		count++;
		
	}
	
	public void showName()
	{
		//Static variables can be accessed by non static Method
		System.out.println(id + " "  + descript + "" + name);
	}
	public static void showInfo() {
		System.out.println(descript);
	}
}





public class Tutorial19StatickeyAndFinal {

	public static void main(String[] args) {
		//Accessing non-static variables and methods
		System.out.println("Before creating object" + " " + Thing.count);
		Thing thingy = new Thing();
		Thing thingy1 = new Thing();
		thingy.name = "Himank";
		thingy.showName();
		
		//Accessing static variable and methods
		Thing.descript="Himank is smart boy";
		Thing.showInfo();
		thingy.name="Himank is Very smart";
		
		thingy.showName();
		thingy1.showName();
		
		System.out.println("After creating object" + " " + Thing.count);
		System.out.println(thingy.id);
		System.out.println(Thing.property);

	}

}
