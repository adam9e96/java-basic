package chapter4;

import java.util.Scanner;
// if - else if
public class Ex_01_01 {
	/*
	 * 사용자에게 입력받은 정수가 양수인지, 0인지, 
	 * 음수인지 알려주는 코드를 완성하시오.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("값 입력>>> ");
		int value = scanner.nextInt();
		/*
		 * 코드 순서는 상관없는데 추후 빈도에 따라 결정하는것이 좋다. 
		 * 결과는 동일하더라도 검사를 덜하면서 실행되는 것이 효율적임.
		 */
		if (value > 0) {
			System.out.println("양수입니다.");
		} else if (value < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		scanner.close();
	}
}
