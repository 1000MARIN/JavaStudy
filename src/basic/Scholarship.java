package basic;

public class Scholarship {

	public static void main(String[] args) {
		// 메소드 호출
		printTest("Park", 100, 92);	// Park => 전액 장학금 !
		printTest("Kim", 82, 96);	// Park => 전액 장학금 !
		printTest("Choi", 82, 85);	// Park => 전액 장학금 !

	} // end of main
	
	public static void printTest(String name, int math, int eng) {
		
		// 변수 생성
		String result = "";
		
		// 조건에 따른 값 변경 (비교 및 논리 연산자)
		if ((math >= 90) && (eng >= 90)) {	// 전액 장학금 조건식
			result = "전액 장학금 !";
		} else if ((math >= 90) || (eng >= 90)) { // 반액 장학금 조건식
			result = "반액 장학금 !";
		} else {
			result = "다음 기회에 ~";
		}
		
		System.out.printf("%s\t => %s\n", name, result);
	} // end of printTest

} // end of Scholarship
