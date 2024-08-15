package chapter_4_condition;

public class Exam015 {
	/*
	 * 2023-01-02 if 문 연습
	 */
	public static void main(String[] args) {

		int a = 3;
		if (a > 3) { // if (조건식) 조건식 : 결과값이 boolean
			// 조건식이 참일 때 실행
			System.out.println("a는 3보다 큽니다");
			// 들여쓰기 잘해야함
		} // if 구문의 끝

		// 조건식과 상관없이 무조건 실행
		System.out.println("검사가 끝났습니다.");

		System.out.println("==================");

		// 정수 인지 판별하는 문

		int b = 1;

		if (b > 0) {
			System.out.println("정수 입니다.");
		} else {
			System.out.println("정수가 아닙니다.");
		}
		// 3항 연산자로 변환
		// 실행할게 없는 문장은 ""으로 하면됨
	}
}
