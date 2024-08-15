package chapter_7_method.b_practice;

import java.util.Scanner;

/**
 * 이 클래스는 좌하변이 직각인 직각삼각형을 표시하는 메서드를 포함합니다.
 *
 * @since 2024.08.11
 */
public class MethodDemo04 {

	/**
	 * 주어진 줄에 맞춰 별과 공백을 출력하여 좌하변이 직각인 직각삼각형을 만듭니다.
	 *
	 * @param n     현재 출력할 줄의 번호
	 * @param total 총 줄 수
	 */
	public void putStars(int n, int total) {
		for (int i = 1; i <= total; i++) {
			if (i <= total - n) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MethodDemo04 demo = new MethodDemo04();

		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// putStars() 메서드 호출
			demo.putStars(i, n);
			System.out.println();
		}
		scanner.close();
	}
}
