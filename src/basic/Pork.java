package basic;

public class Pork {

	public static void main(String[] args) {
		// 메소드 예제
		// 음식 칼로리 계산
		
		// 1. 변수를 생성하시오.
		int num = 3; // 3인분
		
		// 2. 메소드를 통한 칼로리를 계산하시오.
		double result = calculate(num);
		
		// 3. 결과를 출력하시오.
		System.out.printf("삼겹살 %d인분 : %.2f kcal", num, result);
		
	} // end of main
	
	public static double calculate(int n) {
		int gram = n * 180; // 1인분 => 180g
		double kcal = gram * 5.179; // 1g => 5.179kcal
		return kcal;
	} // end of calculate
	
} // end of Pork
