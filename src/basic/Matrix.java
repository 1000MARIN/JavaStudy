package basic;

public class Matrix {

	public static void main(String[] args) {
		
		// 중첩 반복문
		// 반복문 속에 또 다른 반복문이 들어가는 것을 말합니다.
		// 이를 활용 하여 7행 4열 구조의 별 표시를 출력해보도록 합시다.
		// * * * * 
		// * * * * 
		// * * * * 
		// * * * * 
		// * * * * 
		// * * * * 
		// * * * * 

		// 7번 반복 ! 각 행 출력 ! 0, 1, 2, ...., 6 => 7번 반복 !
		// 중첩 반복문 (이중 for문)
		for (int row = 0; row < 7; row++) {
			// 각 열. 4번 반복 !
			for (int col = 0; col < 4; col++) {
				System.out.printf("* ");
			}
			System.out.println(); // 줄 개행 !
		} // end of for
	} // end of main
} // end of Matrix
