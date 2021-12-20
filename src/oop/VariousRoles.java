package oop;

public class VariousRoles {

	public static void main(String[] args) {
		// 다형성(쓰리잡) 인생
		
		// Person 객체 생성
		Person1 Lee = new Person1("철진");
		
		// 각 직업으로 변신 (업캐스팅)
		Developer dev = Lee;
		Instructor inst = Lee;
		Masseur mas = Lee;
		
		// 3. 직업별 메소드를 호출하여 코드를 완성하세요.
		dev.Programming("Java");
		inst.teach("자료구조");
		mas.massage();
	} // end of main
} // end of VariousRoles

interface Developer {
	public void Programming(String lang);
}

interface Instructor {
	public void teach(String subject);
	
}

interface Masseur {
	public void massage();
}

// 1. Person 클래스에 개발자, 강사, 마사지사 역할을 부여

class Person1 implements Developer, Instructor, Masseur {
	private String name;	// 이름
	public Person1(String name) {
		this.name = name;
	}
	
	// 2. 구현하기로 한 인터페이스의 메소드를 오버라이딩 (부모 메소드를 자식에서 재정의)
	public void Programming(String lang) {
		System.out.printf("%s -> %s 프로그래밍 중!\n", name, lang);
	}
	public void teach(String subject) {
		System.out.printf("%s -> %s 수업 중!\n", name, subject);
		
	}
	public void massage() {
		System.out.printf("%s -> 마사지 중!\n", name);
		
	}
} // end of Person
