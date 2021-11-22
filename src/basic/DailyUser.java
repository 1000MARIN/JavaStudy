package basic;

public class DailyUser {

	public static void main(String[] args) {
		// 하루 평균 사용자 구하기
		
		// 배열의 평균값
		int [] counts = { 581, 512, 527, 495, 423, 141, 236 };		
		
		// 메소드 호출을 통한 계산
		double result = average(counts);
		
		// 결과 출력
		System.out.printf("하루 평균 사용자: %.2f명", result);
	} // end of main

	private static double average (int[] arr) {
		//총합
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		// 평균
		// int / int => int
		// double / double => double
		double avg = sum / arr.length; // 총합 / 개수 => 평균
		
		// 결과값 반환
		return avg;
	} // end of average
}
