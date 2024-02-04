package chapter9;
//created : 2024-01-9
//updated : 2024-01-10
public class Method_Ex1 {

	public static void main(String[] args) {
		/* 밑변이 30, 높이가 10인 사각형의 넓이를 출력하세요.
		 * 단 메서드 calculator() 를 호출해서 출력하세요.
		 * 결과값 :
		 * <계산을 시작합니다.
		 * 밑변이 30높이가 10인 사각형의 넓이는 300입니다.
		 */

		int width = 30;
		int height = 10;
		System.out.println("결과값 :");
		System.out.println("밑변이 " + width + "높이가" + height + "인 사각형의 넓이는 " + calculator(width, height) + "입니다.");
	}

	static int calculator(int a, int b) {
		System.out.println("<계산을 시작합니다.");
		int area = a * b; // 밑변 * 높이 = 사각형의 넓이
		return area;
	}
}