package oop;

public class DrinkTest {

	public static void main(String[] args) {
		// 디폴트 생성자로 객체 만들기
		Drink d1 = new Drink(); // ERROR !! (디폴트 생성자가 없기 때문에)
		d1.name = "포카리";
		d1.price = 1000;
		
		// 다른 생성자로 객체 만들기
		Drink d2 = new Drink("박카스", 800);
		
		// 모든 객체 출력
		System.out.println(d1.toStr());
		System.out.println(d2.toStr());

	} // end of main

} // end of DrinkTest

// 드링크 객체
class Drink {
	// 필드
	String name;
	int price;
	
	// 디폴드 생성자를 추가하세요.
	Drink () { } // d1
	
	/// 생성자 
	Drink(String n, int p) { // d2
		name = n;
		price = p;
	}
	
	// 메소드
	String toStr() {
		return String.format("Drink { name: %s, price: %d }", name, price);
	}
	
}
