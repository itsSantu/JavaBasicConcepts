package com.javabasic.concepts;

import java.util.ArrayList;

class machu
{

	@Override
	public String toString() {
		return "This is machu";
	}
	 public void startu()
	 {
		 System.out.println("Machu is starting");
	 }
	
}

class cachu extends machu
{
	public String toString() {
		return "This is cachu";
	}
}

public class Tutorial31GenericAndWildcard {

	public static void main(String[] args) {
		ArrayList<machu> list1 = new ArrayList<machu>();
		list1.add(new machu());
		list1.add( new machu());
		
		ArrayList<cachu> list2 = new ArrayList<cachu>();
		list2.add(new cachu());
		list2.add(new cachu());
		
		showList(list1);
		showList(list2);

	}

	private static void showList(ArrayList<? extends machu> list) {
	for(machu li: list)
	{
		System.out.println(li);
	}
		
	}

}
