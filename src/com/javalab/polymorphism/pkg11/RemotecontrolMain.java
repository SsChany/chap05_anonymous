package com.javalab.polymorphism.pkg11;

public class RemotecontrolMain {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn(); //TV 켬
		rc.setVolume(11);
		rc.turnOff(); // TV 끔
		System.out.println();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn(); //Audio 켬
		rc.setVolume(-1);
		rc.turnOff(); //Audio 끔
		System.out.println();
			
		// 배열
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new Television();
		rcArr[1] = new Audio();
		
		for (RemoteControl remoteControl : rcArr) {
			remoteControl.turnOn();
			remoteControl.setVolume(17);
			remoteControl.turnOff();
			System.out.println();
		}
			
	}

}
