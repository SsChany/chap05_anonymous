package com.javalab.polymorphism.pkg01;

public class Child1 extends Parent {

	@Override // 오버라이딩 검사역할
	public void showPersonality() {
		System.out.println("첫쨰의 성격은 유순하고 조용합니다.");
	}
}
