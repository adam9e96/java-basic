package chapter6;

import java.util.Scanner;

public class Ex02_dowhile {
	public static void main(String[] args) {
		/*
		 * do while 문을 사용해서 사용자로 부터 월의 번호를 입력받는 프로그램을 작성해 보세요.
		 * 사용자가 올바른 월 번호를 입력할 때 까지 반복을 계속합니다.
		 * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어갑니다.
		 */
		Scanner scanner = new Scanner(System.in);
		int month = 13;
//		int month = 1;

//		do {
//			System.out.print("올바른 월을 입력하세요. [1-12]");
//			month = scanner.nextInt();
//		} while(month < 1 || month > 12); 
//			System.out.println("사용자가 입력한 월은 " +month + "입니다.");
//			scanner.close();

		while (true) {
			System.out.print("올바른 월을 입력하세요. [1-12]");
			month = scanner.nextInt();
			if (!(month < 1 || month > 12)) {
				System.out.println("사용자가 입력한 월은 " + month + "입니다.");
				break;
			}
		}
		scanner.close();
			/*
		 * while 문은 처음부터 조건식을 확인해야 하는데 do while문은 일단 한번은 실행한다.
		 * 여기서 보면 while문으로 하면 값을 틀린값으로 넣어서 하는데 이 경우 do while 문은 int month
		 * 
		 * 반복문을 빠져나오는 방법
		 * 1. break
		 * 2. 조건식이 false
		 */
		
	}
	
}
