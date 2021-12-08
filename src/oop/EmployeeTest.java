package oop;

public class EmployeeTest {

	public static void main(String[] args) {
		// 한 주가 일한 시간
		
		// 배열 생성
		int[] hours0 = { 2, 4, 3, 4, 5, 8, 8 };
		int[] hours1 = { 5, 4, 3, 4, 5, 8, 8 };
		int[] hours2 = { 3, 4, 3, 4, 5, 8, 8 };
		int[] hours3 = { 2, 4, 3, 4, 5, 8, 8 };
		int[] hours4 = { 7, 4, 3, 4, 5, 8, 8 };
		int[] hours5 = { 8, 4, 3, 4, 5, 8, 8 };
		int[] hours6 = { 4, 4, 3, 4, 5, 8, 8 };
		int[] hours7 = { 6, 4, 3, 4, 5, 8, 8 };
		
		// 객체 생성
		Employee e0 =  new Employee("직원0", hours0);
		Employee e1 =  new Employee("직원1", hours1);
		Employee e2 =  new Employee("직원2", hours2);
		Employee e3 =  new Employee("직원3", hours3);
		Employee e4 =  new Employee("직원4", hours4);
		Employee e5 =  new Employee("직원5", hours5);
		Employee e6 =  new Employee("직원6", hours6);
		Employee e7 =  new Employee("직원7", hours7);
		
		// 객체 배열 만들기
		Employee[] employees = { e0, e1, e2, e3, e4, e5, e6, e7 };
		
		// 정보 출력
		for (int i = 0; i < employees.length; i++) {
			employees[i].pritTotalHours();
		}
	} // end of main
} // end of EmployeeTest

// 직원 클래스
class Employee {
	// 필드
	String name;	// 이름
	int[] hours;	// 요일별 일한 시간
	
	// 생성자
	Employee(String str, int[] arr) {
		name = str;
		hours = arr;
	}
	
	// 메소드 
	void pritTotalHours() {
		System.out.printf("%s -> %d 시간\n", name, totalHours());
		
	} // end of pritTotalHours
	int totalHours() {
		
		int sum = 0;
		for (int i = 0; i < hours.length; i++) {
			sum += hours[i];
		}
		return sum;
	} // end of TotalHours
} // end of Employee
