package chapter_4_condition;

public class Exam_01_02 {

	public static void main(String[] args) {
		/*
		 * 대문자를 'A'부터 'Z' 까지 출력하는 프로그램 
		 * (for문으로 char타입변수 1개만 사용) 
		 * 출력예)
		 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 */
		int i;
		char a = 'A';
		for (i = a; i <= 'Z'; i++) {
			System.out.printf("%c", i);
		}
	}
}
