package oop;

import java.util.ArrayList;

public class RamenTest {

	public static void main(String[] args) {
		// 라면(Ramen) 객체를 ArrayList에 담고, 담겨진 라면의 총합을 구하시오.
		ArrayList<Ramen> list = new ArrayList<Ramen>();
		
		// Ramen 객체 생성
		Ramen shin = new Ramen("신라면", 800);
		Ramen jin = new Ramen("진라면", 700);
		Ramen bibim = new Ramen("비빔면", 900);
		
		// 1. Ramen 객체를 ArrayList에 담으시오.
		list.add(shin);
		list.add(jin);
		list.add(bibim);
		
		// 2. ArrayList 에 담긴 모든 객체 정보를 출력하시오.
		System.out.println(list.get(0).toString());
		System.out.println(list.get(1).toString());
		System.out.println(list.get(2).toString());
		
		// 3. 총합을 출력하시오.
		int sum = 0;
		sum += list.get(0).getPrice();
		sum += list.get(1).getPrice();
		sum += list.get(2).getPrice();
		System.out.println("======================");
		System.out.printf("총 합: %d", sum);
	} // end of main
} // end of RamenTest

class Ramen {
	// 필드
	private String name;
	private int price;
	
	// 생성자
	public Ramen(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 게터
	public int getPrice() {
		return this.price;
	}
	
	// 메소드
	public String toString() {
		return String.format("Ramen { name: %s, price: %d }", name, price);
	}
} // end of Ramen
