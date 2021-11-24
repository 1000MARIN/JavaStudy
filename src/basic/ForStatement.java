package basic;

public class ForStatement {

	public static void main(String[] args) {
		// 입력값 받기
		int num = 7;
		
		// 메소드를 통한, 결과 출력
		printNumbers(num);
		
	} // end of main
	public static void printNumbers(int max) {
		System.out.println("출력을 시작합니다..");
		
		// 반복을 통한 정수 출력 (1 ~ max)
		for (int i = 1; i <= max; i++) {
			System.out.printf("%s", i);
		}
		
		System.out.println("\n끝 !!");
		
	} // end of printNumbers
	
} // end of ForStatement
