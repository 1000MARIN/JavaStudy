package basic;

public class Matrix1 {

	public static void main(String[] args) {
		// 주어진 코드는 행(R)과 열(C)의 정보를 입력받아 R x c의 별표시 행렬을 출력한다.
		// 출력 에와 같은 결과를 얻도록 적절한 입력값을 넣으시오.
		// * * * * * * *  
		// * * * * * * *  
		// * * * * * * *  
		
		// 입력값 받기
		int r = 3;
		int c = 7;
		
		// 매트릭스 출력
		printMatrix(r, c);
	} // end of main
	public static void printMatrix(int rowMax, int columMax) {
		
		// 중첩 반복문 (이중 for문)
		for (int i = 0; i < rowMax; i++) {
			for (int j = 0; j < columMax; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		} // end of for
	} // end printMatrix
} // end of Matrix1
