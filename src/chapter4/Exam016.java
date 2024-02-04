package chapter4;

import java.util.Scanner;

public class Exam016 {
	/*
	 * created:2023-01-02 title:if-else 문 연습
	 */
	public static void main(String[] args) {
		int age = 15;

		if (age > 19) {
			System.out.println("성인입니다");
			System.out.println("성인요금이 적용됩니다");
		} else { // 위의 조건식이 거짓일 때 if (age <=19) {} 와 같음
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");

		// 위의 문장을 3항 연산자로 변환해보자.
		System.out.println(age > 19 ? "성인입니다.\n 성인요금이 적용됩니다." : "청소년입니다.\n청소년 요금이 적용됩니다.");
		System.out.println("결제를 진행해 주세요.");
		/*
		 * 3항 연산자를 쓰는 이유 코드수를 줄이기 위해서
		 * 
		 * 단점으로는 한눈에 안들어 오기 때문에 연습을 좀 해둬서 눈에 익혀야함
		 */

		// 사용자에게 입력을 받아보자

		Scanner scanner = new Scanner(System.in);
		int intAge;

		// 값 입력
		System.out.print("나이를 입력하세요>> ");
		intAge = scanner.nextInt();

		if (intAge > 19) {
			System.out.println("성인 입니다");
			System.out.println("성인 요금이 적용됩니다.");
		} else { // intAge <= 18
			System.out.println("청소년 입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		// 3연산자로 변환
//		System.out.println((intAge > 19)?"성인 입니다.\n성인 요금이 적용됩니다.":"청소년 입니다.\n청소년 요금이 적용됩니다." );
		scanner.close();
	}
}
