package basic;

public class ArrayToParameter {

	public static void main(String[] args) {
		// 0이상 20미만의 정수 중, 짝수와 소수의 합을 구하려 한다.
		// (소수란 1과 자기 자신만으로 나누어떨어지는 1보다 큰 양의 정수)
		// 출력 예와 같은 결과를 얻도록, sum() 메소드를 완성하시오.
		// 0 이상 20 미만의 짝수와 소수 중...
		// 짝수의 합: 90
		// 소수의 합: 77
		
		// 배열 생성
		int[] evens = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };	// 짝수
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19};			// 소수
		
		// 계산
		int evenSum = sum(evens);
		int primeSum = sum(primes);
		
		// 출력
		System.out.println("0 이상 20 미만의 짝수와 소수 중..");
		System.out.printf("짝수의 합: %d\n", evenSum);
		System.out.printf("소수의 합: %d\n", primeSum);
	} // end of main
	
	// 정수형 배열을 입력 받아 총합을 반환
	public static int sum(int[] arr) {
		int sum = 0;
		
		// 반복문을 통한 총합 계산 !
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	} // end of sum

} // end of ArrayToParameter
