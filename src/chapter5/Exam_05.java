package chapter5;

import java.util.Scanner;

public class Exam_05 {
	/*
	 * 현재 월을 입력 받아 입력받은 월에 해당하는 계절을 출력하는 프로그램
	 */
	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("현재 월을 입력하세요 : ");
//		int month = scanner.nextInt();
//		String season = "";
//		boolean isFlag = true;
//		
//		if(month > 0 && month <13) {
//			switch(month) {
//			case 1,2,12:
//				season = "겨울";
//				break;
//			case 3,4,5:
//				season = "봄";
//				break;
//			case 6,7,8:
//				season = "여름";
//			break;
//			case 9,10,11:
//				season = "가을";
//				break;
//			}
//		} else {
//			isFlag = false;
//			System.out.println("잘못 입력했습니다.");
//		}
//		if (isFlag) {
//		System.out.println(month+"월은 현재 "+season+"입니다.");
//		}
//		scanner.close();

		//
		Scanner scanner = new Scanner(System.in);

		System.out.print("현재 월을 입력하세요. : ");
		int month = scanner.nextInt();

		String season = "겨울";
		String a = "현재 계절은 %s입니다.";

		if (month > 0 && month < 13) {
			switch (month / 3) {
			case 1: // 3, 4, 5
				season = "봄";
				break;
			case 2: // 6, 7, 8
				season = "여름";
				break;
			case 3: // 9, 10, 11
				season = "가을";
				break;
			}
		} else {
			a = "잘못입력하였습니다.";
		}
//		System.out.println(a);
		System.out.printf(a, season);
//		System.out.println("현재 계절은 "+season+"입니다");
		scanner.close();

	}
}
