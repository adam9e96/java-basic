package chapter4;

import java.util.Scanner;

public class Exam018 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		System.out.print("나이를 입력하세요>> ");
		age = scanner.nextInt();

		if (age <= 8) { // 0 ~ 8
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		} else if (age <= 13) {
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		} else if (age <= 19) {
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		} else {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}

		scanner.close();
		/*
		 * 나이가 적은 순으로 실행하도록 변환 나이가 적은순이든 높은순이든 결과는 동일하지만 성인이 입장하는 빈도가 높다면 나이가 높은 순부터
		 * 실행되도록 하고 나이가 적은 사람이 입장하는 빈도가 높다면 나이가 적은 순으로 먼저 실행되도록 하는게 좋다.
		 */
	}
}
