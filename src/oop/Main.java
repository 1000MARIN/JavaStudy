package oop;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		Knight k1 = new Knight("돈기호테", 30);
		
		// 생성 결과 출력
		System.out.println("[객체 생성]");
		System.out.printf("	%s\n", k1.toString());
		//[객체 생성]
		//Knight { name: 돈기호테, hp: 30 }
		
		// 체력 증가 +30
		k1.setHp(k1.getHp() + 30);
		
		// 결과 출력
		System.out.println("[체력증가 +30]");
		System.out.printf("	%s\n", k1.toString());
		//[체력증가 +30]
		//Knight { name: 돈기호테, hp: 60 }
	} // end of main
} // end of Main

class Knight{
	// 필드 추가
	private String name;
	private int hp;
	
	// 생성자 생성자 추가
	public Knight(String name, int hp) {
		this.name = name;	// 파라미터와 필드의 이름이 같으면 this로 명확하게 구분가능
		this.hp = hp;		// 파라미터와 필드의 이름이 같으면 this로 명확하게 구분가능
	}
	
	// 세터
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// 게터
	public int getHp() {
		return this.hp;
	}
	
	public String toString() {
		return String.format("Knight { name: %s, hp: %d }", this.name, this.hp);
	}
} // end of Knight