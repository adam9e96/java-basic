package chapter4;

import java.util.Scanner;

public class Exam017 {
	/*
	 * created:2023-01-02 title:if-else if 문 연습
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		System.out.print("나이를 입력하세요>> ");
		age = scanner.nextInt();

		if (age > 19) { // 20 ~
			System.out.println("성인입니다");
			System.out.println("성인요금이 적용됩니다.");
		} else if (age > 13) { // 14 ~ 19
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		} else if (age > 8) { // 9 ~ 13
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		} else if (age >= 0) { // 0 ~ 8
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		} else { // 음수 입력 시
			System.out.println("잘못 입력했습니다.");
		}
		System.out.println("==========================");

		// 코드 가독성을 개선 보기 더 편함

		if (age >= 20) { // 20 ~
			System.out.println("성인입니다");
			System.out.println("성인요금이 적용됩니다.");
		} else if (age >= 14) { // 14 ~ 19 // age >=14 && age<=19 이렇게 해도 결과는 동일하나 굳이임 뒤에 있는 조건은 검사를안함
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		} else if (age >= 9) { // 9 ~ 13
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		} else if (age >= 0) { // 0 ~ 8
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		} else { // 음수 입력 시
			System.out.println("잘못 입력했습니다.");
		}
		// else if 문 조건 14이상인 경우와 9이상인 문장을 변경할 경우
		// 순차적으로 실행하기 떄문에 잘못된 결과가 실행된다.
		scanner.close();
		/*
		 * else if 문만 단독으로 사용할 수 없다. 무조건 if문 뒤에 올 수 있다. 
		 * 코드의 조건식이 요구사항에 맞도록 해야한다. age >
		 * 19 나 age >= 20 이나 결과는 동일하지만 요구사항이 20살부터라고 기재되어 있다면 후자가 조금 더 맞는 말일 것이다.
		 */
	}

}
