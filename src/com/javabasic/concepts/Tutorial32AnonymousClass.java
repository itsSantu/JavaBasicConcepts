package com.javabasic.concepts;

class mouse{
	public void start()
	{
		System.out.println("Mouse is running...!");
	}
}

interface PlantY {
	public void growY();
}
public class Tutorial32AnonymousClass {

	public static void main(String[] args) {
		
		mouse m = new mouse() {
					@Override
					public void start() {
						System.out.println("Mouse is Starrinnggggg...!");
					}
						
				};
				m.start();

	
	PlantY pll = new PlantY () {

		@Override
		public void growY() {
		System.out.println("Intrface Overriden");
			
		}
		};
	
				pll.growY();
	}

}
