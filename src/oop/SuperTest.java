package oop;

public class SuperTest {

	public static void main(String[] args) {
		// 1. Orc 색체를 만들고 정보를 출력하시오.
		Orc a = new Orc("오크", 80);
		System.out.println(a.toString());
		
		// 2. OrcWarrior 객체를 만들고 정보를 출력하시오.
		OrcWarrior b = new OrcWarrior("오크전사", 120, 3);
		System.out.println(b.toString());

	} // end of main
} // end of SuperTest

class Orc {
	protected String name;
	protected int hp;
	
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		return String.format("Orc { name: %s, hp: %d }", this.name, this.hp);
	}
} // end of Orc

class OrcWarrior extends Orc {
	protected int amor;
	
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);	// 부모 클래스 생성자
		this.amor = amor;
	}
	
	// 메소드 오버라이딩 !
	public String toString() {
		return String.format("OrcWarrior { name: %s, hp: %d, amor: %d }", this.name, this.hp, this.amor);
	}
} // end of OrcWarrior
