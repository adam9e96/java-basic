package chapter3;

public class Exam010 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자 2항 연산자이고, 항은 boolean 값이고 결과도 boolean
		 */
		int a = 10;

		// 비교연산자가 논리연산자 보다 먼저 실행된다. (우선순위임)
		System.out.println(5 < 10 && a < 15); // true -> true && true
		System.out.println((5 < a && a < 15) && a % 2 == 0); // true && true 이므로 true

		a = 4;

		// a && b 논리 곱 연산할 때 먼저 계산되는 좌측 a값이 false 라면 우측 항의 b는 계산 안한다.
		// 조건문 코드짤 때 도움이 될 수 있다.
		System.out.println((5 < a && a < 15) && a % 2 == 0); // (false && true) && true 이므로 false
		System.out.println((5 < a && a < 15) || a % 2 == 0); // (false && true) || true 이므로 true

		// 무조건 암기해야 함.

		a = 5;
		System.out.println(5 < a && a > 10); // false
		System.out.println((2 > a && a > 33) || a >= 5); // true

		// || 문을 잘 보면 복잡하더라도 OR문 한쪽만 true면 true이므로 OR문을 잘보자.
	}
}
