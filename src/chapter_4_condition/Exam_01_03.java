package chapter_4_condition;

public class Exam_01_03 {

	public static void main(String[] args) {
		/*
		 * 1부터 20까지의 홀수를 차례대로 출력하는 프로그램
		 */
		int i;

		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
