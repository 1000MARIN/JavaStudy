package basic;

public class Ramyun {

	public static void main(String[] args) {
		buy();
		boil();
		put();
		eat();

	} // end of main
	
	
	// 리턴(반환)값이 없는 메소드	
	public static void boil() {
		System.out.println("물을 끓인다.");
	}
	public static void buy() {
		System.out.println("라면을 사온다.");
	}
	public static void put() {
		System.out.println("라면을 넣는다.");
	}
	public static void eat() {
		System.out.println("맛있게 먹는다.");
	}
	
	
} // end of Ramyun
