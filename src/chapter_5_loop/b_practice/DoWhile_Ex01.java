package chapter_5_loop.b_practice;

import java.util.Scanner;
/**
 * ===========================================================
 * fileName       : DoWhile_Ex01
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class DoWhile_Ex01 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));	// q를 출력하면 종료
		System.out.println();
		System.out.println("프로그램 종료");

		scanner.close();
	}
}
