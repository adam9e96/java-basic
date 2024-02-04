package chapter5;

import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		/*
		 * 1번은 강아지, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("번호를 입력하세요 >>");
		int value = scanner.nextInt();
		String a = "";

		switch (value) {
		case 1:
//				System.out.println("bog");
			a = "bog";
			break;
		case 2:
//				System.out.println("cat");
			a = "cat";
			break;
		case 3:
//				System.out.println("chick");
			a = "chick";
			break;
		default:
//					System.out.println("번호가 잘못되었습니다.");
			a = "번호가 잘못되었습니다.";
		}
		System.out.println(a);
		scanner.close();
	}
}
