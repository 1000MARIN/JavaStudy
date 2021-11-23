package basic;

public class BusCard {

	public static void main(String[] args) {
		printRole(22);	// 22살 => 성인
		printRole(16);	// 16살 => 청소년
		printRole(10);	// 10살 => 어린이
		printRole(4);	// 4살 => 유아

	} // end of main
	public static void printRole(int age) {
		
		String role = "";
		
		// else-if 문
		
		if (age >= 18) {
			role = "성인";
		} else if (age >= 13) {
			role = "청소년";
		} else if (age >= 6) {
			role = "어린이";
		} else {
			role = "유아";
		}
		
		// 결과 출력
		System.out.printf("%d살 => %s입니다.\n", age, role);

	} // end of printRole
} // end of BusCard
