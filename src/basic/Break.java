package basic;

public class Break {

	public static void main(String[] args) {
		// 주어진 코드는 1부터 10까지의 합을 출력한다. 이에 break 문을 삽입하여, 출력 예와 같은 결과를 얻으시오.
		// 1+2+3+4+5+6+7+8+9+10+
		// => 55
		
		// 1부터 10까지 총합 출력 및 계산
		printSum(1, 10);
		
	} // end of main
	
	public static void printSum(int start, int end) {
		// 변수 생성
		int sum = 0;
		
		// 총합 계산
		for (int i = start; i <= end; i++) {
			System.out.printf("%d", i);
			sum += i;
			
			// 마지막 숫자라면 아래의 코드를 수행하지 않고 탈출
			if (i == end) { // 끝자리 숫자라면?
				break;	// 반복문 탈출
			}
			
			System.out.printf(" + ");
		} // end of for
		
		
		// 결과 출력
		System.out.printf("\n=> %d", sum);
	} // end of printSum
} // end of Break
