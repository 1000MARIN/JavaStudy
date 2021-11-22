package basic;

public class Casting {

	public static void main(String[] args) {
		// 변수 생성
		double tall = 176.4;
		double weight = 82.34;
		
		// 출력
		System.out.printf("신장: %dcm\n", (int) tall);	// 캐스팅 : double -> int
		System.out.printf("체중: %dkg\n", (int) weight);// 캐스팅 : double -> int

	}

}
