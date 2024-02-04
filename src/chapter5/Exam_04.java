package chapter5;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력 받아 "수우미양가"를 평가하는 프로그램
		 */
		System.out.print("점수를 입력하세요 >>> ");
		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();
		int gradeTemp = score / 10;
//		String grade ="가";
		String grade = "";

		if (score >= 0 && score <= 100) {
			switch (gradeTemp) {
			case 9, 10:
				grade = "수";
				break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			case 6:
				grade = "양";
				break;
			default:
				grade = "가";
			}
		} else {
			System.out.println("점수를 다시 입력하세요.");
		}
		System.out.println(grade);
		scanner.close();

	}

}
