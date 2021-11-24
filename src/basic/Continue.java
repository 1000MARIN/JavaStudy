package basic;

public class Continue {

	public static void main(String[] args) {
		// 주어진 코드는 1부터 10까지의 합을 출력한다. continue 문을 추가하여
		// 3의 배수를 제외한 총합을 출력 예와 같이 만드시오.
		
		printSum(1, 10); // 1 ~ 10까지의 합을 출력!

	} // end of main
	
	// start 부터 end 까지의 총합을 계산 및 출력 !
	public static void printSum(int start, int end) {
		
		// 변수 생성
		int sum = 0;
		
		// 반복 수행
		for (int i = start; i <= end; i++) {

			// 3의 배수인 경우, 계산하지 않도록 하자 !
			if ((i % 3) == 0) {
				continue;	// 다음 반복으로, 강제이동
			}
			
			System.out.printf("%d", i);
			sum += i;
			
			if (i == end) { // 끝자리 숫자라면?
				break;	// 반복문 탈출
			}
			System.out.printf(" + ");
		} // end of for
		
		// 결과 출력
		System.out.printf("\n=> %d", sum);
		
	} // end of printSum
} // end of Continue
