package com.javabasic.concepts;

 class frog{
	private String name;
	 private int  age;
 

	
	public void  setName(String name) {
	
		  this.name = name;
	 }
		public void setAge(int newAge) {
		  age=newAge;
	 }
		
		
		 public String getName() {
				return name;
			}
			public int getAge() {
				return age;
			}
	 
 }








public class Tutorial17SettersAndThis {
public String name = "you";
	public static void main(String[] args) {
		frog f =new frog ();
		f.setName("Easy");
		f.setAge(5);
		
		System.out.println(f.getAge());
		System.out.println(f.getName());
		

	}

}
