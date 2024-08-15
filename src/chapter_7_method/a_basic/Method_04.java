package chapter_7_method.a_basic;

import java.util.Scanner;

public class Method_04 {

	static int getMax(int a, int b) { // a, b의 최대값을 반환
		System.out.println("함수 시작");
		if (a > b) {
			return a; // a가 b보다 크면 a를 반환하고 함수 종료
		} else {
			return b; // b가 a보다 크거나 같으면 b를 반환하고 함수 종료
		}
		// System.out.println("함수 종료"); // <-- 실행되지 않는 코드로 에러 발생
	}

	public static void main(String[] args) {
		/*
		 * return 의 기능
		 * 1) 값을 반환
		 * 2) 함수를 종료 (반복문의 break와 비슷)
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 a: ");
		int a = scanner.nextInt();
		System.out.print("정수 b: ");
		int b = scanner.nextInt();
		System.out.println("최대값은 " + getMax(a, b) + "입니다.");
		scanner.close();
	}
}
