package oop;

public class ObjectGrouping {

	public static void main(String[] args) {
		// 업캐스팅(up-casting)이란
		// 자식 객체를 부모의 타입으로 해석하는 것
		// 전혀 다른 객체들일지라도 같은 인테퍼에스를 구현하였다면,
		// 업캐스팅을 통하여 그룹화가 가능
		
		// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();

		// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };
		
		// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
			Flyable temp = flyableThings[i];
			temp.fly();
		}
	} // end of main
} // end of ObjectGrouping

interface Flyable {
	public void fly();
}

class Bird implements Flyable {
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public void fly() {
		System.out.println("<새>가 날개를 퍼덕이며 날아갑니다 !");
	}
} // end of Bird

class Helicopter implements Flyable {
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public void fly() {
		System.out.println("<헬기>가 프로펠르를 힘차게 돌리며 날아갑니다 !");
	}
} // end of Helicopter

class Rocket implements Flyable {
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public void fly() {
		System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다 !");
	}
} // end of Rocket