package basic;

// 1. 클래스 생성
public class Lab02Review {
	
	// 2. 메인 메소드 작성
	public static void main(String[] args) {
		
		// 3. 변수 생성 및 초기화(초기값 설정)
		String name = "홍팍"; 
		int age = 34; // 타입: int , 변수 이름: age , 연산자 : =  (대입 연산자) , 값 : 34
		double weight = 72.4;
		boolean isMale = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("몸무게: " + weight + "kg");
		System.out.println("남성인가요?: " + isMale);

		System.out.println("======================");
		
		// 문자를 숫자로 변환
		// "123" -> 123
		int a = Integer.parseInt(args[0]);
		
		// "3.14" -> 3.14
		double b = Double.parseDouble(args[1]);
		
		System.out.println(a + b);
		
		
		
	}

}
