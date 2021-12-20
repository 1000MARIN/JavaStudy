package oop;

public class Polymorphism {

	public static void main(String[] args) {
		// 다형성 
		// 하나의 객체가 다양한 타입으로 해석 되는 것
		
		// 성기사 객체 생성
		HolyKnight uther = new HolyKnight("우서", 180);
		
		// 탱커로서의 역할 수행
		Tanker t = uther;	// 업 캐스팅
		t.increaseHp();
		
		// 힐러로서의 역할 수행
		Healer h = uther;	// 업 캐스팅
		h.heal();
		
	} // end of main
} // end of Polymorphism

interface Tanker {
	public void increaseHp();
}

interface Healer {
	public void heal();
}

// 1. 탱커와 힐러 역할을 부여하세요.
class HolyKnight implements Tanker, Healer{
	private String name;
	private int hp;
	
	public HolyKnight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	// 2. Tanker의 메소드를 오버라이딩 (부모 메소드를 자식에서 재정의)
	public void increaseHp() {
		System.out.println("전체 체력 +50 증가시킵니다.");
	}
	
	// 3. Healer의 메소드를 오버라이딩 (부모 메소드를 자식에서 재정의)
	public void heal() {
		System.out.println("체력을 +30 회복합니다.");
	}
} // end of HolyKnight
