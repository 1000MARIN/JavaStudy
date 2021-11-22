package oop;

public class Starcraft {

	public static void main(String[] args) {
		// 객체 생성
		Marine ma = new Marine("레이너", 80);		// 생성자 호출 및 초기화
		Medic me = new Medic("모랄레스", 60, 60);	// 생성자 호출 및 초기화
		
		// 마린의 스팀팩!
		ma.stimpak();								// 메소드 호출
		
		// 메딕의 힘
		me.heal(ma);								// 메소드 호출
	} // end of main

} // end of Starcraft

class Marine {										// 생성자 정의
	String name;
	int hp; 
	
	Marine (String s, int i) {
		name = s;
		hp = i;
	}
	void stimpak() {
		System.out.printf("[%s]의 스팀팩 ! HP: %d -> ", name, hp);
		hp -= 10;
		System.out.printf("%d\n", hp);
	}
} // end of Marine

class Medic {										// 생성자 정의
	String name;
	int hp;
	int mp;

	Medic (String s, int i1, int i2) {
		name = s;
		hp = i1;
		mp = i2;
	}
	void heal(Marine target) {
		System.out.printf("[%s]의 치유 ! -> [%s] hp(%d  -> ", name, target.name, target.hp);
		target.hp += 10;
		System.out.printf("%d)\n", target.hp);
	}
} // end of Medic