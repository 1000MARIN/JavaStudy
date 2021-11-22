package basic;


public class CircleAreaCalculator {

	public static void main(String[] args) {
		String rr = "반지름";
		
		// 1. 입력값 받기 (문자열을 실수로 변환)
		int r = Integer.parseInt(args[0]); // "4" -> 4
		
		// 2. 원의 얿이(S = pi * r ^ 2 계산
		double s  = Math.PI * r * r;
		
		// 3. 결과 출력
		System.out.println(rr + "이" + r + "인 원의 넓이 ->"+ s);
		
//		System.out.printf("%s이 %d인 원의 넓이 -> %.3f", result, result, result);
		// %d : 정수(int) %f : 실수(double) %s : 문자열(String)
		System.out.printf("%s이 %d인 원의 넓이 -> %.3f", rr, r, s);
		
	} // end of main

} // end of CircleAreaCalculator
