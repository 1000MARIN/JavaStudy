package oop;

public class UpCasting {

	public static void main(String[] args) {
		// 업 캐스팅이란, 
		// 자식 객체를 부모의 타입으로 해석하는 것.
		
		// 기사 객체 생성 및 초기화
		Knight1 knight = new Knight1();
		knight.name = "아서스";
		knight.hp = 180;
		knight.strength = 50;
		
		// 도적 객체 생성 및 초기화
		Thief thief = new Thief();
		thief.name = "발리라";
		thief.hp = 120;
		thief.agility = 40;
		
		// 업 캐스팅 - 부모 타입으로 객체를 해석
		Adventurer adv0 = knight;
		Adventurer adv1 = thief;
		
		// 모험가들의 배열 생성
		Adventurer[] advs = { adv0, adv1 };
		
		// 모든 모험가의 정보 출력
		for (int i = 0; i < advs.length; i++) {
			System.out.println(advs[i].toString());
		}
	} // end of main
} // end of UpCasting

class Adventurer {
	String name;
	int hp;
	
	public void punch() {
		System.out.printf("[%s]의 펀치 !! \n", name);
	}
	
	public String toString() {
		return String.format("[%s] HP: %d", name, hp);
	}
	
} // end of Adventurer

class Knight1 extends Adventurer {
	int strength;
	
	public void berserker() {
		System.out.println("체력과 공격력이 증가 합니다. ");
	}
} // end of Knight1

class Thief extends Adventurer {
	int agility; // 민첩
	
	public void sharpen() {
		System.out.println("크리티컬 확률이 증가합니다.");
	}
} // end of Thief