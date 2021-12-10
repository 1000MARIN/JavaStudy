package oop;

public class PersonTest {

	public static void main(String[] args) {
		// 객체생성
		Person park = new Person("손흥민", "010-1234-1234");
		
		// 1. getter를 호출하여 필드값을 얻으시오.
		System.out.printf("이  름 : %s\n", park.getName());
		System.out.printf("연락처 : %s\n", park.getPhoneNumber());
		
	} // end of main
} // end of PersonTest

class Person {
	// 필드
	// private 필드 - 외부 접근 불가
	private String name;
	private String phoneNumber;
	
	// 생성자
	public Person(String n, String p) {
		name = n;
		phoneNumber = p;
	}
	
	// 게터(getter)는, private 필드를 우회적으로 접근(read)하게 합니다.
	// 2. getter 메소드를 추가하시오. - name을 우회화여 반환
	public String getName() {
		return name;
	}
	
	// 2. getter 메소드를 추가하시오. - phoneNumber을 우회화여 반환
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
} // end of Person
