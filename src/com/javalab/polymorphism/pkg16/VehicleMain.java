package com.javalab.polymorphism.pkg16;

public class VehicleMain {

	public static void main(String[] args) {
		
		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용==============");
		Taxi taxi = new Taxi();
		taxi.run();
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현=============");
		Driver driver = new Driver();
		driver.drive(taxi);
		driver.drive(bus);
		System.out.println();
		
		System.out.println("[3] 반복문을 통해서 운행을 자동화 시킴===========");
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Taxi();
		vehicles[1] = new Bus();
		
		for (Vehicle vehArr : vehicles) {
			vehArr.run();
		}
		
		
		}
	}
