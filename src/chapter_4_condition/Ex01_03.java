package chapter_4_condition;

import java.util.Scanner;

public class Ex01_03 {
	/*
	 * 월을 입력하면 계절을 출력하는 코드를 완성하세요.
	 * 1, 2 : 겨울
	 * 3, 4, 5 : 봄
	 * 6, 7, 8 : 여름
	 * 9, 10, 11 : 가을
	 * 12 : 겨울
	 * 
	 * 예) 계절을 표시합니다.
	 *  몇 월 입니까? : 9
	 *  가을입니다.
	 *  
	 *  계절을 표시합니다.
	 *  몇 월입니까? : 13
	 *  잘못된 입력 값 입니다.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("몇 월입니까?");
		int intValue = scanner.nextInt();

		if (intValue == 1 || intValue == 2 || intValue == 12) {
			System.out.println("겨울입니다.");
		} else if (intValue >= 3 && intValue <= 5) {
			System.out.println("봄입니다.");
		} else if (intValue >= 6 && intValue <= 8) {
			System.out.println("여름입니다.");
		} else if (intValue >= 9 && intValue <= 11) {
			System.out.println("가을입니다");
		} else {
			System.out.println("잘못된 입력 값 입니다.");
		}
		scanner.close();

		/*
		 * 코드를 더 간략화 할 수 있음 1가지 있다.
		 */
		if (intValue < 1 || intValue > 12) {
			System.out.println("잘못 입력");
		} else if (intValue == 12 || intValue <= 2) {
			System.out.println("겨울");
		} else if (intValue <= 5) {
			System.out.println("봄");
		} else if (intValue <= 8) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		System.out.println("=========================");
		
	}
}
