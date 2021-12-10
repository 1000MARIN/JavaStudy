package oop;

public class PointTest {

	public static void main(String[] args) {
		// 두점 사이의 거리
		
		// 객체 생성
		Point p1 = new Point(0, 0);				// 생성자 호출 및 초기화
		Point p2 = new Point(3, 4);				// 생성자 호출 및 초기화
		
		// 거리 계산
		double dist = Point.distance(p1, p2); 	// 클래스 메소드 호출 (주체 객체 없이도 호출 가능)
	
		// 결과 출력
		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist); // 두 점 A(0, 0), B(3, 4) 사이의 거리: 5.00
	
	} // end of main
} // end of PointTest

class Point {									// 생성자 정의
	// 1. 필드를 만드시오
	int x;										// 인스턴스 변수
	int y;										// 인스턴스 변수
	
	// 2. 생성자를 정의하시요.
	Point (int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	// 3. 객체 정보를 문자열로 반환하는 인스턴스 메소드를 만드시오.
	String toStr() {							//인스턴스 메소드
		return String.format("(%d, %d)", x, y);
	}
	
	// 4. 두 점 사이의 거리를 반환하는 클래스 메소드를 만드시오.
	static double distance(Point p, Point q) { 
		double dX = p.x - q.x;					// x좌표의 변화량
		double dY = p.y - q.y;					// y좌표의 변화량
		return Math.sqrt((dX * dX) + (dY * dY));// Math.sqrt는 루트 메소드
	}
	
	// static 키워드	: 필드 & 메소드에 적용 가능한 공유의 키워드
	// 클래스 변수 		: 객체 외부 클래스 영역에서 공유되는 변수
	// 인스턴스 변수	: 객체 내부 변수
	// 클래스 메소드 	: 클래스가 동작시키는 메소드
	// 인스턴스 메소드 	: 주체 객체가 동작하는 메소드
	
	// 접근 제한자의 범위
	// private : 비공개
	// default : 같은 패키지 내 공개
	// protected : 상속 범위 공개
	// public : 완전공개
	
} // end of Point