package oop;

import java.util.ArrayList;

public class InterfaceType {

	public static void main(String[] args) {
		// 다양한 하위 객체들을 상위 인터페이스 타입으로 ArrayList에 저장 가능
		
		
		// 객체 생성
		// 인터페이스의 하위 객체 생성 & 업캐스팅(부모 타입으로 해석)
		Orderable f = new Food("족발", 30000);
		Orderable e = new Electronics("에어팟", 198000);
		Orderable c = new Clothing("셔츠", 50000);
		
		// ArrayLIst를 통한 객체 저장
		ArrayList<Orderable> list = new ArrayList<Orderable>();
		list.add(f);
		list.add(e);
		list.add(c);
		
		
		// 총합 계산
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Orderable o = list.get(i);
			sum += o.discountedPrice();
		}
		
		// 결과 출력
		System.out.printf("총합: %d원", sum);
		
		
	} // end of main
} // end of InterfaceType

interface Orderable {
	public int discountedPrice();
} // end of Orderable

class Food implements Orderable {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public int discountedPrice() {
		return (int) (price * 0.9); // double 타입을 int로 캐스팅
	}
} // end of Food

class Electronics implements Orderable {
	private String name;
	private int price;
	
	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public int discountedPrice() {
		return (int) (price * 0.8);	// double 타입을 int로 캐스팅
	}
} // end of Electronics

class Clothing implements Orderable {
	private String name;
	private int price;
	
	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 메소드 오버라이딩 (부모 메소드를 자식에서 재정의)
	public int discountedPrice() {
		return (int) (price * 0.7);	// double 타입을 int로 캐스팅
	}
} // end of Clothing