package com.javabasic.concepts;

public class Tutorial26Polymorphism {
	public static void main(String[] args) {
		Tutorial26PolymorphismPlants p = new Tutorial26PolymorphismPlants();
		Tutorial26PolymorphismTrees t = new Tutorial26PolymorphismTrees();
		p.grow();
		t.grow();
	//	Now 
		Tutorial26PolymorphismPlants p2 = t;
	 
		p2.grow();
		t.shedleaves();
	
		//p2.shedleaves();  will not work since type of the ref i,e class name here is Plants so
	
		
		
	}

}

