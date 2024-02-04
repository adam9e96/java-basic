package chapter10;

import java.util.Random;
import java.util.Scanner;

/*
 * 
1) 숫자를 2자리수로

2) 업 다운 기능 추가.

 */
public class Method_Exam_01 {
	static Scanner scanner = new Scanner(System.in);

	static boolean confirmRetry() {
		int cont;
		do {
			System.out.println("다시 한번?<Yes-1/No-0");
			cont = scanner.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1; // 리턴값이 boolean인데 정수값 1 = true, 0 = false 로 자동 형변환되어서 전달되는건가? #TODO
	}

	public static void main(String[] args) {
		Random random = new Random();

		do { // 10 ~ 99 까지 랜덤으로 생성
			int x = random.nextInt(90) + 10; // 3자릿수의 수
			int y = random.nextInt(90) + 10; // 3자릿수의 수
//			int z = random.nextInt(90) + 10; // 3자릿수의 수

			while (true) {
				System.out.print(x + " + " + y + " = ");
				int k = scanner.nextInt();
				if (k == x + y) {
					break;
				} else {
					System.out.println("틀렸습니다.");
					if (k > (x + y)) {
						System.out.println("입력한 값이 큽니다.");
					} else {
						System.out.println("입력한 값이 작습니다.");
					}
				}
			}
		} while (confirmRetry());
	}
}
