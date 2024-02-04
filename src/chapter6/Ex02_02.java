package chapter6;

import java.util.Scanner;

public class Ex02_02 {
	public static void main(String[] args) {
		/*
		 * while과 break를 사용. while 의 조건식은 true로
		 */
		Scanner scanner = new Scanner(System.in);
		int month;

		while (true) {
			System.out.print("올바른 월을 입력하세요. [1-12]");
			month = scanner.nextInt();
			if ((month >= 1 && month <= 12)) {
				break;
			}
		}
		System.out.println("사용자가 입력한 월은 " + month + "입니다.");
		scanner.close();
	}
}