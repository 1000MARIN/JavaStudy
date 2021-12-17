package oop;

// 1. ArrayList 클래스를 java.util
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 2. String을 담을 수 있는 ArrayList  객체를 만드시오.
		ArrayList<String> names = new ArrayList<String>();
		
		// 3. 리스트에 이름을 추가하시오.
		names.add("Kim");
		names.add("Lee");
		names.add("Park");
		names.add("Choi");
		names.add("Hong");
		names.add("No");
		
		// 4. 0번째 요소를 "Yoon"으로 변경
		names.set(0, "Yoon");
		
		// 5. 반복문을 통해 모든 이름을 출력하시오.
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("names.get(%d) => %s\n", i, names.get(i));
		}
		
//		System.out.printf("names.get(%d) => %s\n", 0, names.get(0));
//		System.out.printf("names.get(%d) => %s\n", 1, names.get(1));
//		System.out.printf("names.get(%d) => %s\n", 2, names.get(2));
//		System.out.printf("names.get(%d) => %s\n", 3, names.get(3));
//		System.out.printf("names.get(%d) => %s\n", 4, names.get(4));
//		System.out.printf("names.get(%d) => %s\n", 5, names.get(5));
	} // end of main
} // end of ArrayListTest
