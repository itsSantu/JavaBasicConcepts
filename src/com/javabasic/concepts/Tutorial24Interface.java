package com.javabasic.concepts;

public class Tutorial24Interface {

	public static void main(String[] args) {
	Tutorial24InterfaceMachineClass IMC = new Tutorial24InterfaceMachineClass();
	IMC.Start();
	Tutorail24InterfacePersonClass IPC = new Tutorail24InterfacePersonClass(" Leo ");
	IPC.Greet();
	
	Tutorial24ActualInterface AI = new Tutorial24InterfaceMachineClass();
	AI.showinfo();
	
	Tutorial24ActualInterface AIP = IPC;
	AIP.showinfo();
	
	System.out.println( "     ");
	System.out.printf( "    ");
	InterfaceOutput(IMC);
	InterfaceOutput(IPC);
	

	}

	private static void InterfaceOutput(Tutorial24ActualInterface tutorial24ActualInterface)
	{
		tutorial24ActualInterface.showinfo();
	}
}
