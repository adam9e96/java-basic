package chapter10;

/**
 * ===========================================================
 * fileName       : aa
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
import java.util.Random;
import java.util.Scanner;

public class Method_Ex_01 {
	/*
	 * 인수 (매개변수) 가 없는 메서드 암산 연습
	 */
	static Scanner scanner = new Scanner(System.in); // 두 메서드에서 사용하기 위해 클래스 변수로 선언
	// 여기다 static Scanner 를 선언안하면 두번 써야 됬었다. 클래스 안쪽 메서드 바깥쪽에 static로 지정해서 어디서든 쓸수
//	있도록 함

	static boolean confirmRetry() { // 매개변수를 전달 받지 않는 메서드
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
			// random.nextInt(n) : 0 ~ ( n - 1 ) 까지의 정수를 랜덤으로 반환
			int x = random.nextInt(900) + 100; // 3자릿수의 수
			int y = random.nextInt(900) + 100; // 3자릿수의 수
			int z = random.nextInt(900) + 100; // 3자릿수의 수

			while (true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = scanner.nextInt(); // 입력한값
				if (k == x + y + z) // 정답
					break;
				System.out.println("틀렸습니다!!");
			}
		} while (confirmRetry());
	}
}
