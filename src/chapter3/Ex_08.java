package chapter3;

import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 숫자를 입력받아 달러를 원으로 변환하여 출력하는 프로그램을 만들어 보세요.
		 * 1달러는 1289.50 원으로 반환할 수 있습니다.
		 * 
		 * 예 ) 달러 단위의 금액을 입력해주세요.
		 * 입력 > 24
		 * -> 원화 : 30948.0
		 */
		Scanner scanner = new Scanner(System.in);

		int dollar;
		double won;

		System.out.println("달러 단위의 금액을 입력해주세요.");
		System.out.print("입력 > ");

		dollar = scanner.nextInt();
		won = dollar * 1289.50;

		System.out.println("-> 원화 : " + won);

		scanner.close();
	}
}
