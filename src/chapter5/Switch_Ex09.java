package chapter5;

import java.util.Scanner;
/**
 * ===========================================================
 * fileName       : Switch_Ex09
 * date           : 2024-01-24
 * description    : switch 문 문제1
 * ===========================================================
 */
public class Switch_Ex09 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 성적을 입력받아 switch 문을 사용해서 학점을 출력하는 코드를 완성하세요. 입력은 0 ~ 100 까지 입력이 됩니다. 기준은
		 * 아래와 같습니다. 
		 * A : 90 ~ 100 
		 * B : 80 ~ 89 
		 * C : 70 ~ 79 
		 * D : 60 ~ 69 
		 * F : 0 ~ 59
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("성적을 입력하세요 >>");

		int score = scanner.nextInt();
		int value = score / 10;
		String grade = "";

		switch (value) {
		case 9, 10:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("입력한 성적은 : " + score + ", 학점은 : " + grade + " 입니다.");

		// 2
		switch (value) {
		case 9, 10 -> grade = "A";
		case 8 -> grade = "B";
		case 7 -> grade = "C";
		case 6 -> grade = "D";
		default -> grade = "F";
		}
		System.out.println("입력한 성적은 : " + score + ", 학점은 : " + grade + " 입니다.");
		scanner.close();
	}
}
