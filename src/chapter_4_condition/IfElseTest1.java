package chapter_4_condition;

import java.util.Scanner;

public class IfElseTest1 {
	public static void main(String[] args) {
		/*
		 * 변수 x가 10보다 크고 20보다 작을 때 변수 x를 출력하는 조건식을 완성하라
		 */
		int intValue = 15;
		if (intValue > 10 && intValue < 20) {
			System.out.println(intValue);
		}
		/*
		 * for 문을 사용하여 0부터 10미만의 정수 중에서 짝수 만을 작은 수부터 출력하시오.
		 */
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		/*
		 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오. 
		 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때
		 * 또는 400의 배수일 때이다.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력>");
		int intValue2 = scanner.nextInt();

		boolean a = (intValue2 % 4) == 0;
		boolean b = (intValue2 % 100) != 0;
		boolean c = (intValue2 % 400) == 0;

		if (a) {
			if (b || c) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}
		scanner.close();
	}
}
