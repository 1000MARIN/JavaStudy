package basic;

public class Lab03Review {

	public static void main(String[] args) {
		
		// 1. 3번째 배열 문자열을 실수로 변환하세요.
		double f = Double.parseDouble(args[0]);
		
		// 2. 화씨온도를 섭씨로 변화하세요.
		double c = (f-32.0) / 1.8;
		
		// 3. 결과를 출력하세요.
		System.out.println("화씨 " + f + "도는 섭씨로 " + c +"도 입니다!");
	}

}
