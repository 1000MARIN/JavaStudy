package oop;

public class Hack {

	public static void main(String[] args) {
		// 1. 계좌 생성
		Account myAccount = new Account(100000);
		System.out.println(myAccount.toString());
		
		// 2. 계좌 해킹
		Hacker.malcious(myAccount);
		
		// 3. 결과 출력
		System.out.println(myAccount.toString());
	} // end of main
} // end of Hack

class Account {
	// 필드 
	int balance;	// 디폴트 접근 제한자 -> 같은 공간 클래스에게 공개!
	
	//접근 제한자의 범위
	// private : 비공개
	// default : 같은 패키지 내 공개
	// protected : 상속 범위 공개
	// public : 완전공개
	
	// 생성자
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 메소드
	public String toString() {
		return String.format("Account { balance: %d }", balance);
	}
} // end of Account

class Hacker {
	// 클래스 메소드 - 계좌의 잔액을 0원으로 변경
	public static void malcious(Account account) {
		// 1. 파라미터 계좌의 잔액을 0으로 변경하세요.
		account.balance = 0;
	}
} // end of Hacker