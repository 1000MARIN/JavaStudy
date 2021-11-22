package basic;

public class GuGuDan {

	public static void main(String[] args) {
		// 구구단 호출 (2단 ~ 9단)
		PrintGuGuDan();
	} // end of main

	//구구단 출력 메소드!
	public static void PrintGuGuDan() {
		for (int i = 2; i <= 9; i++) {
			printDan(i); // i단 출력
		}
	} // end of PrintGuGuDan
	
	// i을 출력한다.
	// 예를 들어 i = 2 이면, 2 x 1 = 2, ... , 2 x 9 = 18
	public static void printDan(int dan) {
		System.out.printf("%d단\n", dan);
		
		// 반복문을 사용
		for (int k = 1; k <= 9; k++) {
			System.out.printf("\t");
			System.out.printf("%d x %d = %d\n", dan, k, dan * k);
		}
	} // end of printDan
}
