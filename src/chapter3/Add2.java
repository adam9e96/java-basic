package chapter3;

import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {

		/*
		 * 콘솔에서 입력을 받을 때는 Scanner 클래스 사용
		 */

		Scanner scanner = new Scanner(System.in); // Scanner 타입도 클래스이므로 new 키워드 사용함.
		int x, y, sum;

		System.out.print("첫 번째 숫자를 입력하시오: "); // 줄을 바꾸지 않는다.
		x = scanner.nextInt(); // 정수 입력

		System.out.print("두 번째 숫자를 입력하시오: ");
		y = scanner.nextInt();

		sum = x + y;
		System.out.println("두 정수의 합 : " + sum); // 합을 출력한다.

		scanner.close();
	}
}
