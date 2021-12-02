package oop;

public class HeroTest {

	public static void main(String[] args) {
		// 객체 생성
		Hero ironMan = new Hero("아이언맨", 80);
		Hero thanos	 = new Hero("타노스", 160);
		Hero thor	 = new Hero("토르", 150);
		Hero groot	 = new Hero("그루트", 80);
		
		// 모든 객체 정보를 출력
		System.out.println(ironMan.toStr());
		System.out.println(thanos.toStr());
		System.out.println(thor.toStr());
		System.out.println(groot.toStr());

	} // end of main
} // end of HeroTest

// Hero 클래스
class Hero {
	// 필드
	String name;
	int hp;
	
	// 생성자
	Hero(String s, int i) {
		name = s;
		hp = i;
	}
	
	// 메소드
	String toStr() {
		return String.format("Hero { name: %s, hp: %d }", name, hp);
	}
} // end of Hero