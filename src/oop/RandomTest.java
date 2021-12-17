package oop;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 두 개의 주사위 눈 값 출력하기
		// A: 2
		// B: 5
		
		// 변수 생성 및 주사위 던지기
		int a = DieA.roll();
		int b = DieB.roll();
		
		// 결과 출력
		System.out.printf("A: %d\n", a);
		System.out.printf("B: %d\n", b);

	} // end of main

} // end of RandomTest
 
class DieA {
	// 1 부터 6사이 정수를 반환
	public static int roll() {
		double r = Math.random() * 6;
		int randInt = (int) r;
		return randInt + 1;
	}
} // end of DieA

class DieB {
	// 1 부터 6사이 정수를 반환
	public static int roll() {
		// Random 클래스를 활용하여 주사위의 눈값(1~6)을 반환하시오.
		Random rand = new Random();
		int randInt = rand.nextInt(6);	// 0 ~ 5
		return randInt + 1;
	}
} // end of DieA

