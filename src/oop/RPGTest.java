package oop;

public class RPGTest {

	public static void main(String[] args) {
		// 상속은 기존클래스(A)를 확장하여 새로운 클래스(B)를 만드는 것입니다.
		// 이를 위해 extends 키워드를 사용합니다. 이렇게 확장된 클래스는, 기존 클래스의 모든 속성을 물려받게 됩니다.
		
		// 객체 생성 및 초기화
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;
		
		
		Wizard wizard = new Wizard();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;
		
		// 두 객체의 펀치
		novice.punch();		// [프로도]의 펀치 !!
		wizard.punch();		//[해리포터]의 펀치 !!

		// 위자드 객체의 파이어볼
		wizard.fireball();	// [해리포터]의 파이어볼 !!

	} // end of main
} // end of RPGTest

class Novice {
	String name;
	int hp;
	
	public void punch() {
		System.out.printf("[%s]의 펀치 !!\n", name);
	}
}

// 1. Wizard 클래스를 Novice 클래스로 부터 확장하세요.
class Wizard extends Novice {
	
	// 2. mp 필드를 추가하세요.
	int mp;
	
	// 3. fireball() 메소드를 만드세요.
	public void fireball() {
		System.out.printf("[%s]의 파이어볼 @@\n", name);
	}
}