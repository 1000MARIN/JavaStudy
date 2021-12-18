package oop;

public class InheritanceTest {

	public static void main(String[] args) {
		// 서로 다른 두 클래스에 중복 속성을 상속(extends)을 통해 제거할 수 있습니다.
		// 객체생성
		Pet dog = new Pet();

		// 4. 객체를 초기화하세요.
		dog.name = "차우차우";
		dog.age = 3;
		dog.price = 2200000;
		
		// 정보 출력
		System.out.printf("Pet { name: %s, age: %d세, price: %d원 }", dog.name, dog.age, dog.price);
	} // end of main
} // end of InheritanceTest

class Animal {
	String name;	// 이름
	
	public void cry() {
		System.out.println("동물이 웁니다 !");
	}
} // end of Animal


// 1. Pet 클래스를 Animal로 부터 확장 선언 하세요.
class Pet extends Animal {
	// 2. 부모클래스 Animal과 중복되는 필드를 제거하세요.
//	String name;
	int age;
	int price;
	
//	public void cry() {
//		System.out.println("동물이 웁니다 !");
//	}
	
	public void play() {
		System.out.println("애완 동물이 장난을 칩니다 ~");
	}
} // end of Pet
