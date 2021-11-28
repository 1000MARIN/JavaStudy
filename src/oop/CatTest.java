 package oop;

public class CatTest {

	public static void main(String[] args) {
		// Cat 객체 생성
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		// 객체의 필드 값을 변경하시오.
		c1.name = "네로";
		c2.name = "나비";
		
		// 메소드 호출
		c1.claw();
		c2.claw();
		
		c1.meow();
		c2.meow();
	} // end of main
} // end of CatTest

class Cat {
	
	// 필드 영역
	String name;	// 이름
	String breed;	// 품종
	int age;		// 나이
	double weight; 	// 무게
	
	// 메소드 영역
	void claw() {	
		System.out.printf("[%s]할퀴기!\n", name);
	}
	
	void meow() {	
		System.out.printf("[%s]야 옹~~\n", name);
	}
} // end of Cat