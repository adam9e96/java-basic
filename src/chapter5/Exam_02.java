package chapter5;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		/*
		 * 문제1.아래의 메뉴를 보여주고, 선택한 메뉴를 알려주는 프로그램 작성 출력 
		 * 예)  1. 삽입 
		 * 		2. 수정 
		 * 		3. 삭제 
		 * 입력 예) 숫자를 선택하세요 :2 
		 * 출력 예) 수정을 선택하셨습니다.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. 삽입");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");

		System.out.print("숫자를 선택하세요 :");
		int value = scanner.nextInt();
		String b = "";
		String c = "잘못";
		switch (value) {
		case 1:
			b = "삽입을";
			break;
		case 2:
			b = "수정을";
			break;
		case 3:
			b = "삭제를";
			break;
		default:
			System.out.print(c);
		}
		System.out.println(b + " 선택하셨습니다.");
		scanner.close();
	}

}
