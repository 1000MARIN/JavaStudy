package basic;

public class WhileStatement {

	public static void main(String[] args) {
		// 입력값 받기
		int startNum = 5;
		
		// 카운트 다운 출력
		countDown(startNum);
	} // end of main
	
	public static void countDown(int num) {
		System.out.println("카운트 다운을 사직합니다...");
		
		while (num >= 0) {
			System.out.printf("%d..\n", num);	// 5.. //4.. //3.. ~ // 0..
			num--;
		}
		
		System.out.println("발사 !!");
	}

} // end of WhileStatement
