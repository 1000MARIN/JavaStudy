package oop;

import java.util.ArrayList;

public class MonsterTest {

	public static void main(String[] args) {
		// Monster 객체를 저장할 ArrayList 생성
		ArrayList<Monster> list = new ArrayList<Monster>();
		
		// Monster 객체 생성
		Monster slime = new Monster("슬라임", 1);
		Monster orc = new Monster("오크", 3);
		Monster golem = new Monster("골렘", 1);
		
		// ArrayList에 객체 담기
		list.add(slime);
		list.add(orc);
		list.add(golem);
		
		// 전체 출력
		System.out.println("========변경전========");
		System.out.println(list.get(0).toString());
		System.out.println(list.get(1).toString());
		System.out.println(list.get(2).toString());
		
		// 1. 레벨 1의 토끼 객체를 생성하세요.
		Monster rabbit = new Monster("토끼", 1);
		
		// 2. ArrayList의 첫 요소인 슬라임을 토끼로 변경하세요.
		list.set(0, rabbit);
		
		// 전체 출력
		System.out.println("========변경후========");
		System.out.println(list.get(0).toString());
		System.out.println(list.get(1).toString());
		System.out.println(list.get(2).toString());
		
	} // end of main
} // end of MonsterTest

class Monster {
	// 필드
	private String name;
	private int level;
	
	// 생성자
	public Monster(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	// 메소드
	public String toString() {
		return String.format("Monster { name: %s, level: %d }", name, level);
	} 
} // end of Monster
