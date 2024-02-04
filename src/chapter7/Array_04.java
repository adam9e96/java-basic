package chapter7;

/**
 * ===========================================================
 * fileName       : Array_04
 * date           : 2024-02-04
 * description    : 배열연습_04
 * ===========================================================
 */
public class Array_04 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

		// 테스트 코드
		System.out.println("[max: " + max+"]");
		System.out.println("[min: " + min+"]");

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				System.out.println("[max: " + max+"]"); // 테스트 코드.if가 true일 때 실행됨
			}
			if (score[i] < min) {
				min = score[i];
				System.out.println("[min: " + min+"]");
			}
		} // end of for
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}
}
