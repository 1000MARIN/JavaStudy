package oop;

public class BicycleTest {

	public static void main(String[] args) {
		// 자전거 객체 생성
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		
		// 객체 필드값 초기화
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
		
		b2.name = "산악형 자전거";
		b2.weight = 8.32;
		b2.price = 296000;
		
		// 객체 정보 출력
		System.out.printf("b1->{%s, %.2fkg, %d원}\n", b1.name, b1.weight, b1.price); // b1->{로드형 자전거, 7.25, 326000}
		System.out.printf("b2->{%s, %.2fkg, %d원}\n", b2.name, b2.weight, b2.price); // b2->{산악형 자전거, 8.32, 296000}
	} // end of main
} // end of BicycleTest

class Bicycle {
	// 필드
	String name;	// 이름
	double weight;	// 무게
	int price;		// 가격

	// 메소드
	void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}
	void horn() {
		System.out.println("따르르릉! 지나갈게요~");
	}
} // end of Bicycle