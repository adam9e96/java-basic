package chapter7;

import java.util.Arrays;

public class Exam_08 {
	public static void main(String[] args) {
		// for문으로 배열 초기화
		int[] c = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}

		// 배열의 요소를 출력하는 방법 3가지.
		// for문을 이용한 출력
		System.out.println("c.length : " + c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		// foreach 문을 이용한 출력
		System.out.println();
		for (int d : c) { // (배열의 요소 : 배열).
			// 반복 시에는 변수 d에 순서대로 요소가 들어감. 자바스크립트의 for of 문과 유사.
			System.out.print(d);
		}

		// Arrays.toString 메서드 사용. 문자열로 출력
		System.out.println();
		System.out.println(Arrays.toString(c));
	}
}
