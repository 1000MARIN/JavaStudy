package oop;

public class MethodScope {

	public static void main(String[] args) {
		// main 메소드의 지역변수 score
		int score = 88;
		System.out.printf("score = %d in main()\n", score);
		
		// Record 클래스의 메소드 수행
		Record.foo(score);
		
		// main 메소드의 지역변수 score 출력
		System.out.printf("score = %d in main()\n", score);

	} // end of main
} // end of MethodScope

//스코프(scope)란, 변수의 활동 영역
// 메소드 스코프 : 메소드 내부에서 활동 (예 - 파라미터, 지역변수)
// 클래스 스코프 : 클래스 전역에서 활동 (예 - 필드)

class Record {
	// 클래스 메소드
	public static void foo(int score) {
		// printMinus10 메소드의 파라미터 score의 값을 10 감소
		score -= 10;
		
		// printMinus10 메소드의 파라미터 score의 값을 출력
		System.out.printf("score = %d in foo()\n", score);
	} // end of foo
} // end of Record