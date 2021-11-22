package basic;

public class WhatIsWrong {

	public static void main(String[] args) {
		
		// 다중 파라미터와 타입 불일치
		
		int a = sqaure((int) 3.0);
		int b = (int) cube(2);
		
		System.out.printf("a = %d, b = %d\n", a, b);
	} // end of main
	
	public static int sqaure(int n) {
		return n * n;
	}

	public static double cube(double n) {
		return n * n * n;
	}
	
} // end of WhatIsWrong
