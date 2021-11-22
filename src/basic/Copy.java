package basic;

public class Copy {

	public static void main(String[] args) {
		// 문자열 생성
		String origin = "가나다라";
		
		// 문자열 복사
		String copy = origin;
		
		// 문자열 출력
		System.out.println(copy);	// 가나다라
	
		// 덧셈연산을 통해 원하는 문자열을 연결하세요.
		copy = copy + "마바사";
		
		// 문자열 출력
		System.out.println(copy);

	} // end of main

} // end of Copy
