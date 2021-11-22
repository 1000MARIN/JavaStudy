package basic;

public class CubeVolume {
	
	// 프로그램 실행의 시작점
	public static void main(String[] args) {
		
		// 변수 생성
		int n = 3;
		
		// 메소드 호출을 통한 값 계산
		int x = cube(n);
		
		// 결과 출력
		System.out.printf("%d의 세제곱 => %d", n, x);
	} // end of main
	
	// cube(): n => n^3 (단일 파라미터 메소드)
	public static int cube(int num) {
		// 1. 변수 생성
		int result;
		
		// 2. 세제곱을 계산하세요
		result = num * num * num;
		
		// 3. 값 반환
		return result;
	} // end of cube
	 
} // end of CubeVolume
