package com.javalab.polymorphism.pkg10;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		//1. 인터페이스를 사용하지 않는 평범한 경우
		Television tv = new Television();
		
		//2. 인터페이스를 사용하는 경우
		RemoteControl rc = null; // 인터페이스 타입 변수 rc 선언 (인터페이스는 객체 생성이 안됨)
		
		//rc 변수에 Television 객체를 대입 (일종에 자동 타입 변환)
		rc = new Television();
		
		//부모 타입의 turnOn()메소드는 감춰지고 구현 객체(자식)의 메소드가 호출됨.
		rc.turnOn();
		
		rc = new Audio();
		
		rc.turnOn();
		
		// 배열로 출력
		RemoteControl[] rmcArr = new RemoteControl[2];
		
		rmcArr[0] = new Television();	//자동 타입변환
		rmcArr[1] = new Audio();		//자동 타입변환
		
		for (int i = 0; i < rmcArr.length; i++) {
			rmcArr[i].turnOn();
		}
		
		for (RemoteControl remoteControl : rmcArr) {
			remoteControl.turnOn();
		}
	}

}
