package chapter_5_loop.b_practice;

import java.util.Scanner;
/**
 * ===========================================================
 * fileName       : While_Ex04
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class While_Ex04 {
	public static void main(String[] args) {
		/*
		 * 반복문을 빠져나오는 방법
		 * 1) 조건식이 false
		 * 2) break 문이 실행.
		 * break문은 반복을 멈추게 함.
		 * 반복문이 진행되다가 break 문을 만나면 곧 바로 반복문을 벗어나서 반복문 다음의 코드를 수행.
		 */
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;

		while (true) { // break 문 활용
			System.out.println("더할 숫자를 입력하세요:(종료하려면 0입력)");
			num = scanner.nextInt(); // 정수 입력받아서 num 에 저장
			if (num == 0) { // 만약 0 을 입력했다면 종료
				break;
			}
			sum += num; // 입력받은 값 더해주기
		}
		System.out.println("현재까지의 총합 = " + sum);
		scanner.close();
	}
}
