package oop;

public class SquareTest {

	public static void main(String[] args) {
		// 1. 객체생성
		Square s = new Square();
		// 2. 필드 초기화 (값 변경)
		s.length = 4;
		// 3. 결과 출력
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d", s.length, s.area()); // 한 변의 길이가 4인 정사각형의 넓이 : 16
	} // end of main
} // end of SquareTest

// 4. 정사각형 클래스 구현
class Square {
	// 필드 - 한 변의 길이
	int length;
	
	// 메소드 - 정사각형의 넓이 반환
	int area() {
		return length * length;
	}
} // end of Square