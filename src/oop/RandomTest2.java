package oop;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		// 두 개의 주사위 눈 값 출력한다. 주사위 A와 B를 동시에 100회 던진 결과의 합을 토대로,
		// 출력 예와 같은 결과를 만드시오.
		// 2 => #
		// 3 => ##
		// 4 => ######
		// 5 => ####
		// 6 => ##########
		// 7 => #############
		// 8 => ##########
		// 9 => #######
		// 10 => ####
		// 11 => ####
		// 12 => ####
		
		// 배열생성
		int[] counts = new int[13];	// 인덱스: 0 ~ 12
		
		// 변수 생성 및 주사위 100번 던지기
		for (int i = 0; i < 100; i++) {
			int a = DieAA.roll();
			int b = DieBB.roll();
			counts[a + b]++;
		}
		
		// 결과 출력
		for (int row = 2; row < counts.length; row++) {
			System.out.printf("%d\t=>\t", row);
			// #을 출력
			for (int col = 0; col < counts[row]; col++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		

	} // end of main

} // end of RandomTest
 
class DieAA {
	// 1 부터 6사이 정수를 반환
	public static int roll() {
		double r = Math.random() * 6;
		int randInt = (int) r;
		return randInt + 1;
	}
} // end of DieA

class DieBB {
	// 1 부터 6사이 정수를 반환
	public static int roll() {
		// Random 클래스를 활용하여 주사위의 눈값(1~6)을 반환하시오.
		Random rand = new Random();
		int randInt = rand.nextInt(6);	// 0 ~ 5
		return randInt + 1;
	}
} // end of DieA

