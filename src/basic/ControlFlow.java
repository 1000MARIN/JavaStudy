package basic;

public class ControlFlow {

	public static void main(String[] args) {
		drawsRectangle();
	} // end of main
	
	// 메소드 중첩 호출
	public static void drawsRectangle() {
		drawLine();	// 윗 변
		drawEdge();	// 중 간
		drawLine();	// 윗 변
	}
	
	// 직선을 그리는 메소드
	public static void drawLine() {
		System.out.println("******");
	}
	// 양 끝점을 그리는 메소드
	public static void drawEdge() {
		System.out.println("*    *");
	}
	
} // end of ControlFlow
