package basic;

public class AverageHeight {

	public static void main(String[] args) {
		test(176.3, true);	// 176.3cm, 남 => 평균키 이상
		test(162.7, false);	// 176.3cm, 여 => 평균키 이상
		test(171.8, true);	// 176.3cm, 남 => 평균키 이하
		test(158.3, false);	// 176.3cm, 여 => 평균키 이하

	} // end of main
	
	public static void test(double height, boolean isMale) {
		// 변수 생성
		String gender = "";
		String result = "";
		
		// 조건 처리 (중첩 조건문)
		if (isMale) {
			gender = "남성";
			if (height >= 173.5) {
				result = "이상";
			} else {
				result = "이하";
			}
		} else {
			gender = "여성";
			if (height >= 160.8) {
				result = "이상";
			} else {
				result = "이하";
			}
		}
		
		System.out.printf("%.1fcm, %s => 평균키 %s\n", height, gender, result);
	} // end of test
	
} // end of AverageHeight
