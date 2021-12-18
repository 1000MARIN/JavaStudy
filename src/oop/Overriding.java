package oop;


public class Overriding {

	public static void main(String[] args) {
		// 메소드 오버라이딩(overriding)이란,
		// 부모의 메소드를 자식 클래스에서 재정의하는 것입니다.
		
		// 객체 생성 및 초기화 - 정사각형
		Square1 s = new Square1();
		s.name = "정사각형";
		s.length = 5;

		// 객체 생성 및 초기화 - 삼각형
		Triangle t = new Triangle();
		t.name = "정삼각형";
		t.base = 4;
		t.height = 3;
		
		// 객체 생성 및 초기화 - 원
		Circle1 c = new Circle1();
		c.name = "원";
		c.radius = 4;
		
		// 업 캐스팅 - 도형 배열에 정사각형, 삼각형, 원 담기
		Shape[] shapes = {s, t, c};
		
		// 모든 도형의 넓이 계산 및 출력
		for (int i = 0; i < shapes.length; i++) {
			Shape tmp = shapes[i];
			System.out.printf("%s의 넓이 -> %.2f\n", tmp.name, tmp.area());
		}
	} // end of main
} // end of Overriding

// 도형
class Shape {
	String name;
	
	// 도형의 넓이를 반환
	public double area() {
		return 0;
	}
	
}

// 정사각형
class Square1 extends Shape {
	int length;
	
	// 1. 정사각형 넓이를 구하도록 area()을 재정의하세요.
	// 도형의 넓이를 반환
	public double area() {
		return length * length;
	}
} // end of Square

// 삼각형
class Triangle extends Shape {
	int base;	// 밑변
	int height;	// 높이
	
	// 1. 삼각형 넓이를 구하도록 area()을 재정의하세요.
	// 도형의 넓이를 반환
	public double area() {
		return (base * height) / 2.0;
	}
	
} // end of Triangle

// 원
class Circle1 extends Shape {
	int radius;
	// 1. 원 넓이를 구하도록 area()을 재정의하세요.
	// 도형의 넓이를 반환
	public double area() {
		return radius * radius * Math.PI;
	}
} // end of Circle