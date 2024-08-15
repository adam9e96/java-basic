package chapter_4_condition;

import java.util.Scanner;
/**
 * ===========================================================
 * fileName       : Switch_Ex04
 * date           : 2024-01-24
 * description    : 점수를 입력 받아 "수우미양가"를 평가하는 프로그램
 * ===========================================================
 */
public class Switch_Ex04 {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요 >>> ");
		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();
		int gradeTemp = score / 10;
		String grade ="가";	 // 초기 값을 "가"로 초기화 하는 이유 : 사용자가 입력한 점수가 유효하지 않을 때 또는 점수에 따른 등급을
		// 부여 할 수 없는 경우를 대비하기 위함

		if (score >= 0 && score <= 100) {	// 0 ~ 100점 이하인 경우
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
		System.out.println("등급: " + grade);
		scanner.close();

	}

}
