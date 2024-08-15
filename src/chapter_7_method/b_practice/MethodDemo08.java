package chapter_7_method.b_practice;

import java.util.Random;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Method_Ex08
 * date           : 2024-01-24
 * description    : 암산 연습 프로그램
 * ===========================================================
 */
public class MethodDemo08 {

	// 두 메서드에서 사용하기 위해 클래스 변수로 선언
	static Scanner scanner = new Scanner(System.in);

	/**
	 * 사용자가 게임을 다시 시도할지 여부를 확인합니다.
	 *
	 * @return 사용자가 1을 입력하면 true, 0을 입력하면 false를 반환
	 */
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("다시 한번? <Yes-1/No-0> : ");
			cont = scanner.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1; // cont가 1이면 true, 아니면 false
	}

	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("암산 트레이닝!!");
		do {
			// 100 ~ 999 까지의 3자리 랜덤 숫자 생성
			int x = random.nextInt(900) + 100;
			int y = random.nextInt(900) + 100;
			int z = random.nextInt(900) + 100;

			while (true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = scanner.nextInt(); // 사용자 입력값
				if (k == x + y + z) { // 정답 체크
					System.out.println("정답입니다!");
					break;
				}
				System.out.println("틀렸습니다!!");
			}
		} while (confirmRetry());

		scanner.close(); // 스캐너 닫기
	}
}
