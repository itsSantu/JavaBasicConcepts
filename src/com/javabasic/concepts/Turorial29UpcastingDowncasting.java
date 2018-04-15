package com.javabasic.concepts;

class MachineGun {
	public void start() {
		System.out.println("Machine is satrrrrrrrrrrting");
	}
}

class Camera extends MachineGun {
	public void start() {
		System.out.println("Cameo is satrrrrrrrrrrting");
	}

	public void snap() {
		System.out.println("Snap is snaaaaaaaaaapping");
	}
}

public class Turorial29UpcastingDowncasting {

	public static void main(String[] args) {

		MachineGun mac = new MachineGun();
		Camera cam = new Camera();
		mac.start();
		cam.start();
		cam.snap();
		// Upcasting
		MachineGun macy = cam;
		macy.start();
		// macy.snap(); // Error macy cannot call camer methods

		// Downcasting
		MachineGun m1 = new Camera();
		Camera camo = (Camera) m1;
		camo.snap();

		// Doesn't work----- Run time error
		// MachineGun maccy = new MachineGun();
		// Camera c= (Camera) maccy;
		// c.snap();

	}

}
