package oop;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		// 1. Book을 담기 위한 ArrayList 객체를 만드시오.
		ArrayList<Book> list = new ArrayList<Book>();
		
		// 2. Book 객체를 생성하시오.
		Book onepiece = new Book("원피스", 4500);
		Book naruto = new Book("나루토", 4000);
		Book java = new Book("자바 프로그래밍", 5000);
		
		// 3. ArrayList 객체에 Book 객체들을 담으세요.
		list.add(onepiece);
		list.add(naruto);
		list.add(java);
		
		// 4. 리스트에 담긴 모든 책 정보 반복문으로 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list.get(%d) => %s\n", i, list.get(i));
		}
		
//		System.out.printf("list.get(%d) => %s\n", 0, list.get(0));
//		System.out.printf("list.get(%d) => %s\n", 1, list.get(1));
//		System.out.printf("list.get(%d) => %s\n", 2, list.get(2));
		
	} // end of main
} // end of BookTest

class Book {
	// 필드
	private String title;
	private int price;
	
	// 생성자
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	// 메소드
	public String toString() {
		return String.format("Book { name: %s, price: %d }", title, price);
	}
} // end of Book