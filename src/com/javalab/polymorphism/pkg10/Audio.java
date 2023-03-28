package com.javalab.polymorphism.pkg10;
/*
 * 구현 클래스
 * -인터페이스르 구현한 클래스
 */
public class Audio implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");	//인터페이스의 메소드 내용
	}
}
