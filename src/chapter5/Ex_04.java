package chapter5;

import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 임의의 양의 정수를 하나 입력받은 뒤 1부터 입력받은 정수까지 모든 정수의 합계를 출력하는 프로그램을 구현하세요.
		 * 
		 * 실행 예) 임의의 양수를 입력하세요 >>> 5 1부터 5사이의 모든 정수의 합계는 15입니다.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("임의의 양수를 입력하세요 >>> ");
		int intValue = scanner.nextInt(); // 정수 값을 입력 받음

		int sum = 0;

		if (intValue > 0) {
			for (int i = 1; i <= intValue; i++) {
				sum += i;
			}
//		System.out.printf("1부터 %d 사이의 모든 정수의 합계는 %d 입니다.\n",intValue,sum); 
			System.out.println("1부터 " + intValue + " 사이의 모든 정수의 합계는 " + sum + " 입니다.");
		} else {
			System.out.println("양의 정수를 입력하세요.");
		}
		scanner.close();
	}
}
