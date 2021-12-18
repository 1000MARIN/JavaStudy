package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleLottoMachine {

	public static void main(String[] args) {
		// 로또 번호 생성기
		
		// 45개의 공을 만든다.
		// Integer를 담기위한 객체 생성
		ArrayList<Integer> numbers = new ArrayList<Integer>();	// Interger : int 타입을 클래스로 변형한 것
		for (int i = 1; i <= 45; i++) {
			numbers.add(i);	// 1 ~ 45
		}
		
		// 섞는다. 
		// Collections.suffle() -> ArrayList 요소를 무작위로 섞음
		Collections.shuffle(numbers);
		
		// 뽑는다.
		int[] picked = new int[6];
		for (int i = 0; i < 6; i++) {
			picked[i] = numbers.get(i);
		}
		
		// 결과 출력
		// Arrays.toString(picked); -> 배열을 간편하게 출력
		System.out.printf("자동 생성 번호: %s", Arrays.toString(picked));
		// 자동 생성 번호: [35, 44, 28, 13, 12, 37]
	} // end of main
} // end of SimpleLottoMachine
