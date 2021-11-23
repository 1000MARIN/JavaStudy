package basic;

public class LeapYear {
	public static void main(String[] args) {
		// 윤년 계산하기
		// 윤년 : 1년이 366일인 해
		// 기본 적으로 년수가 4의 배수이면 윤년이다.
		// 그러나 100으로 나누어지고 떨어지는 경우 윤년이 아니다.
		// 특별히 1000으로 나누어 떨어지는 경우에는 윤년이 된다.
		
		// 입력값 받기
		int input = Integer.parseInt(args[0]); // "1988" => 1988
		
		// 윤년 여부 계산
		boolean output = isLeapYear(input); // 1988 => true
	
		
		// 결과 출력
		System.out.printf("%d년은 윤년입니까? %s", input, output);
	} // end of main
	
	// 윤년 판별 메소드
	private static boolean isLeapYear(int year) {
		// 변수 생성
		boolean result = false;
	
	
		// 조건문 처리 ( 윤년 여부 판별 )
		if ((year % 4) == 0) {
			result = true;
			
			if ((year % 100) == 0) {
				result = false;
				
				if((year % 1000) == 0) {
					result = true;
				}
			}
		}
	
		// 결과값 반환
		return result;
		
	} // end of isLeapYear		
} // end of LeapYear
