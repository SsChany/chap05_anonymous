package com.javalab.polymorphism.pkg01;

import java.util.Scanner;


public class polyMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Parent parent = null;
		
		while (true) {
			System.out.println("=============================================");
			System.out.println("성격을 알고 싶은 자녀를 선택하세요");
			System.out.println("1.첫째");
			System.out.println("2.둘째");
			System.out.println("3.셋째");
			System.out.println("4.종료");
			System.out.println();
			
			String no = scanner.nextLine(); //키보드에서 Scanner를 사용해서  점수 입력
			if (no.equals("4")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if (no.equals("1")) {
				parent = (Parent)new Child1(); //필드의 다향성(자식을 부모 타입에 저장)
			}else if (no.equals("2")) {
				parent = (Parent)new Child2(); //필드의 다향성(자식을 부모 타입에 저장)
			}else if (no.equals("3")) {
				parent = (Parent)new Child3(); //필드의 다향성(자식을 부모 타입에 저장)
			}
			parent.showPersonality(); //부모 타입으로 호출하지만 자식(각3개타입)의 메소드가 호출됨
		}
		scanner.close();
	}

}
