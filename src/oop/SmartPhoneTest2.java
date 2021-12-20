package oop;

public class SmartPhoneTest2 {

	public static void main(String[] args) {
		// 객체 생성
		SmartPhone1 sp = new SmartPhone1("아이폰");
		
		// 비프음 내기
		sp.beep();
		
		// 음악 재생하기
		sp.playMusic("상어송");
	} // end of main
} // end of SmartPhoneTest

interface Alarm {
	public void beep();						// 비프음
	public void playMusic(String title);	// 음악 재생
} // end of Phone

class SmartPhone1 implements Alarm {
	private String name;	// 모델명
	
	public SmartPhone1(String name) {
		this.name = name;
	}
	
	// Alarm 인터페이스의 추상 메소드를 재정의
	public void beep() {
		System.out.println("삐빔 ! 삐비비빕~!");
	}
	// Alarm 인터페이스의 추상 메소드를 재정의
	public void playMusic(String title) {
		System.out.printf("[%s]을 재생합니다...!", title);
	}
	
} // end of SmartPhone