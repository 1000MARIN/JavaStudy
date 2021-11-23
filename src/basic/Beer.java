package basic;

public class Beer {

	public static void main(String[] args) {
		order(18);	// 18세가 캔맥주를 사려 함
		order(19);	// 19세가 캔맥주를 사려 함
		order(20); 	// 20세가 캔맥주를 사려 함
	} // end of main
	
	public static void order(int age) {
		if (age >= 19) {
			System.out.printf("%d세, 성인인증 완료 => 캔맥주가 나왔습니다. \n", age);
		}
	} // end of order

} // end of Beer
