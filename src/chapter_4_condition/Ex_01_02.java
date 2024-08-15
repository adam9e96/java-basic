package chapter_4_condition;

import java.util.Scanner;

public class Ex_01_02 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 성적을 입력 받아
		 * if문을 사용해서 학점을 출력하는 코드를 완성하세요.
		 * 입력은 0 ~ 100까지 입력이 됩니다.
		 * 기준은 아래와 같다.
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 * 
		 * 예) : 성적을 입력하세요 : 81
		 * 학점 B
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("성적을 입력하세요 : ");
		int score = scanner.nextInt();

		if (score >= 90) {
			System.out.println("학점 A");
		} else if (score >= 80) {
			System.out.println("학점 B");
		} else if (score >= 70) {
			System.out.println("학점 C");
		} else if (score >= 60) {
			System.out.println("학점 D");
		} else {
			System.out.println("학점 F");
		}

		scanner.close();
	}

}
