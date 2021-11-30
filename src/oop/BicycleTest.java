package oop;

public class BicycleTest { // 시나리오 작성

	public static void main(String[] args) {
		// 자전거 객체 생성 및 초기화
		Bicycle b1 = new Bicycle("로드형 자전거", 7.25, 326000);
		Bicycle b2 = new Bicycle("산악형 자전거", 8.32, 296000);
		
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

	// 생성자 - 파라미터를 통한 초기화
	Bicycle(String n, double w, int p){
		name = n;
		weight = w;
		price = p;
	}
} // end of Bicycle