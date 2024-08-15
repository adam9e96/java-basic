package chapter_7_method.b_practice;

import java.util.Random;
import java.util.Scanner;

/**
 * 이 클래스는 2자리 숫자의 덧셈 문제를 생성하고 사용자가 맞출 때까지 반복하며,
 * 업/다운 기능을 추가하여 사용자가 입력한 값이 정답보다 큰지 작은지를 알려줍니다.
 */
public class MethodDemo07 {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * 사용자가 게임을 다시 시도할지 여부를 확인합니다.
	 *
	 * @return 사용자가 1을 입력하면 true, 0을 입력하면 false를 반환
	 */
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.println("다시 한번?<Yes-1/No-0>");
			cont = scanner.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}

	public static void main(String[] args) {
		Random random = new Random();

		do {
			// 10 ~ 99 까지 랜덤으로 숫자 생성
			int a = random.nextInt(90) + 10;
			int b = random.nextInt(90) + 10;

			while (true) {
				System.out.print(a + " + " + b + " = ");
				int k = scanner.nextInt();
				if (k == a + b) {
					System.out.println("정답입니다!");
					break;
				} else {
					System.out.println("틀렸습니다.");
					if (k > (a + b)) {
						System.out.println("입력한 값이 큽니다.");
					} else {
						System.out.println("입력한 값이 작습니다.");
					}
				}
			}
		} while (confirmRetry());

		scanner.close();
	}
}
