package basic;

public class DoMath {

	public static void main(String[] args) {
		// 변수 생성 및 초기화
		double score = 1.0 + 2.0 * (3.0 + 4.0) - 5.0;	// 10.0
		
		// 변수값 출력
		System.out.println(score); // 10.0

		// 변수값 변경
		score = score / 2.0;	// 10.0 / 2.0 => 5.0
		
		// 변수값 출력
		System.out.println(score); // 5.0
		
		// 변수값 변경
		score = score / 2.0; // 5.0 / 2.0 => 2.5
		
		// 변수값 출력
		System.out.println(score); // 2.5

	} // end of main

} // end of DoMath
