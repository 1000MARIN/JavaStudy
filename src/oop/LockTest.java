package oop;

public class LockTest {

	public static void main(String[] args) {
		// 객체 생성
		Lock lock = new Lock("123!@#");
		
		// 객체 정보 출력
		System.out.println(lock.toString());
		
		// 객체 비밀번호 변경
		lock.setPassword("654#@!");
		
		// 객체 정보 출력
		System.out.println(lock.toString());

	} // end of main
} // end of LockTest

class Lock {
	// 필드
	private String password;
	
	// 생산자
	public Lock(String p) {
		password = p;
	}
	
	// 메소드
	public String toString() {
		return String.format("Lock { password: %s }", password);
	}
	
	// 세터(setter)는, private 필드를 우회적으로 변경(write)합니다.
	// 1. 비밀번호 변경을 위해, setter 메소드를 추가하시오.
	public void setPassword(String pw) {
		password = pw;
	}
	
} // end of Lock