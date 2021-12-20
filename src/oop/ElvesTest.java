package oop;

import java.util.ArrayList;

public class ElvesTest {

	public static void main(String[] args) {
		// 엘프의 진화
		
		// 엘프 객체 생성 & 업캐스팅(부모 타입으로 해석)
		Elf a = new Elf("티란테", 100);
		Elf b = new HighElf("말퓨리온", 160, 100);
		Elf c = new ElfLord("마이에브", 230, 140, 100);
		
		// 객체 배열 생성
		//Elf[] elves = { a, b, c };
		
		// ArrayList로 묶기
		ArrayList<Elf> list = new ArrayList<Elf>();	// Elf를 담기위한 ArrayList 생성
		list.add(a);
		list.add(b);
		list.add(c);
		
		
		// 반복을 이용한 출력
//		for (int i = 0; i < elves.length; i++) {
//			System.out.println(elves[i].toString());
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	} // end of main
} // end of ElvesTest

class Elf {
	protected String name;	// protected : 상속 관계 접근 허용
	protected int hp;		// protected : 상속 관계 접근 허용
	 
	public Elf(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		return String.format("[엘프] Name: %s, HP: %d", this.name, this.hp);
	}
} // end of Elf

class HighElf extends Elf {
	// name, hp 를 상속 받음
	protected int mp;		// protected : 상속 관계 접근 허용
	
	public HighElf(String name, int hp, int mp) {
		super(name, hp); // 부모 클래스 생성자 호출
		this.mp = mp;
	}
	
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public String toString() {
		return String.format("[하이엘프] Name: %s, HP: %d, MP: %d", super.name, super.hp, this.mp);
	}
} // end of HighElf

class ElfLord extends HighElf {
	// name, hp, mp 를 상속 받음
	protected int shield;		// protected : 상속 관계 접근 허용
	
	public ElfLord(String name, int hp, int mp, int shield) {
		super(name, hp, mp); // 부모 생성자 호출
		this.shield = shield;
	}
	
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public String toString() {
		return String.format("[엘프로드] Name: %s, HP: %d, MP: %d, SH: %d", name, hp, mp, shield);
	}
} // end of ElfLord