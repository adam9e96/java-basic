package chapter3;

import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {

		/*
		 * 사용자로부터 숫자를 입력받아 cm를 inch 단위로 변환하여 출력하는 프로그램을 만들어 보세요.
		 * 1cm 는 0.393701 inch로 반환할 수 있습니다.
		 * 
		 * 예) cm 단위의 숫자를 입력해주세요.
		 * 입력 > 24
		 * 24cm는 9.448824 inch 입니다.
		 */

		Scanner scanner = new Scanner(System.in);
		int cm;
		double inch;

		System.out.println("cm 단위의 숫자를 입력해주세요.");
		System.out.print("입력 > ");

		cm = scanner.nextInt();
		inch = cm * 0.393701;

		System.out.println(cm + "cm는 " + inch + " inch 입니다.");

		scanner.close();
	}
}
