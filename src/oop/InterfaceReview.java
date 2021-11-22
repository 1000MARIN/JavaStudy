package oop;

import java.util.ArrayList;

public class InterfaceReview {

	public static void main(String[] args) {
		// 인터페이스의 하위 객체 생성 & 업캐스팅(부모 타입으로 해석)
		Sounding dog = new Dog();
		Sounding baby = new Baby();
		Sounding tiger = new Tiger();
		Sounding robot = new Robot();
		
		// ArrayLIst를 통한 객체 저장
		ArrayList<Sounding> list = new ArrayList<Sounding>();
		list.add(dog);
		list.add(baby);
		list.add(tiger);
		list.add(robot);
		
		// 인터페이스 배열 생성
		//Sounding[] arr = { dog, baby, tiger, robot };
		
		// 소리내기
//		for (int i = 0; i < arr.length; i ++) {
//			arr[i].sound();
//		}
		
		for (int i = 0; i < list.size(); i ++) {
			list.get(i).sound();
		}
	} // end of main
} // end of InterfaceReview

interface Sounding {
	public void sound();
}

class Dog implements Sounding{
	public void sound() {					// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
		System.out.println("Dog: 멍멍!");
	}
} // end of Dog

class Baby implements Sounding{
	public void sound() {					// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
		System.out.println("Baby: 응애!");
	}
} // end of Baby

class Tiger implements Sounding{
	public void sound() {					// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
		System.out.println("Tiger: 어흥!");
	}
} // end of Tiger

class Robot implements Sounding{
	public void sound() {					// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
		System.out.println("Robot: 삐빕!");
	}
} // end of Robot