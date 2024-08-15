package chapter_5_loop.b_practice;

import java.util.Random;
import java.util.Scanner;
/**
 * ===========================================================
 * fileName       : While_Ex03
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class While_Ex03 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 주사위를 던지면 사용자가 주사위의 숫자를 맞히는 프로그램을 완성하세요.
		 * 사용자가 맞힐 때까지 게임은 계속 됩니다.
		 * 
		 * int nextInt(int n) int 타입의 0 ~ 매개값미만 까지의 난수를 리턴.
		 * Random random = new Random();
		 * answer = random.nextInt(6) + 1;
		 * 
		 * 예 )
		 * 주사위 값은 얼마일까요? >>> 5
		 * 오답입니다. 다시 시도하세요.
		 * 주사위 값은 얼마일까요? >>. 1
		 * 1! 정답입니다.
		 * 
		 * 1) break 를 사용
		 * 2) break를 사용안하는 경우
		 */
		Random random = new Random();
		int answer = random.nextInt(6)+1;
//		System.out.println(answer); <-- 개발 단계에서는 이런 답코드가 있으면 좋다. 개발이 끝나면 주석처리
		Scanner scanner = new Scanner(System.in);
	
		// 1
//		while (true) {
//			System.out.print("주사위 값은 얼마일까요? >>>");
//			int value = scanner.nextInt();
//			if (answer == value) {
//				break;
//			}
//			System.out.println("오답입니다. 다시 시도하세요.");
//		}
//		System.out.println(answer + "! 정답입니다.");
//		scanner.close();
		
//		System.out.println("======================");
		
		// 2
//		boolean run = true;
//		while(run) { //1
//			System.out.print("주사위 값은 얼마일까요? >>>" );
//			int user = scanner.nextInt();		
//			
//			if (!(answer == user)) {
//			System.out.println("오답입니다. 다시 시도하세요.");
//			} else if (answer == user){
//				System.out.println(answer+"!"+"정답입니다.");
//				run = false;
//			}
//		}
//		scanner.close();
//		
//		System.out.println("======================");
		
//		// 3
//		while(answer != 0) {
//			System.out.print("주사위 값은 얼마일까요? >>>" );
//			int user = scanner.nextInt();		
//			if (!(answer == user)) {
//				System.out.println("오답입니다. 다시 시도하세요.");				
//			} else if (answer == user) {
//				System.out.println(answer+"!"+"정답입니다.");
//				answer = 0;
//			}
//		}
//		scanner.close();
		// 4
		int user;
		do {
			System.out.print("주사위 값은 얼마일까요? >>> ");
			user = scanner.nextInt();
			if (!(answer == user)) {
				System.out.println("오답입니다. 다시 시도하세요.");
			} else if (answer == user) {
				System.out.println(answer + "!" + "정답입니다.");
				answer = 0;
			}
		} while (answer != 0);
		scanner.close();
	}
}
